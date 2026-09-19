package task.cafe_report;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class CafeReportApp {
    public static void main(String[] args) {
        Path[] inputFiles = {
                Path.of("data", "miniproject", "cafe-report", "branch-a.txt"),
                Path.of("data", "miniproject", "cafe-report", "branch-b.txt")
        };
        Path output = Path.of("out", "cafe-report.txt");

        // TODO: 전체·지점별·메뉴별 결과를 저장할 변수를 준비하세요.
        List<Branch> branches = new ArrayList<>();
        Map<String,Item> items = new LinkedHashMap<>();

        int invalidCount = 0;
        int totalCount = 0;
        int totalAmount = 0;
        int totalMoney = 0;

        for (Path input : inputFiles) {
            String branchName = input.getFileName().toString().replace(".txt", "");
            Branch branch = new Branch(branchName);
            boolean flag = false;
            try (BufferedReader reader =
                         Files.newBufferedReader(input, StandardCharsets.UTF_8)) {
                String line;
                int lineNumber = 0;
                while ((line = reader.readLine()) != null) {
                    lineNumber++;
                    totalCount++;
                    // TODO: 항목을 나누고 검사한 뒤 정상 내역만 집계하세요.
                    String[] temp = line.split(",");//이름 가격 수량
                    if(temp.length!=3 || temp[0].trim().isEmpty()){//항목이 3개가 아니거나 메뉴 이름 비어있음
                        System.out.println("파일 이름: " + input.getFileName() + " 줄 번호: " + lineNumber + " 잘못된 입력입니다");
                        invalidCount++;
                        continue;
                    }
                    String itemName = temp[0].trim();
                    int price = 0;
                    int quantity = 0;
                    try {
                        price = Integer.parseInt(temp[1].trim());
                        quantity = Integer.parseInt(temp[2].trim());
                    }catch (NumberFormatException e){
                        System.out.println("파일 이름: " + input.getFileName() + " 줄 번호: " + lineNumber + " 잘못된 입력입니다");
                        invalidCount++;
                        continue;
                    }

                    if((price<=0) || (quantity<=0)){
                        System.out.println("파일 이름: " + input.getFileName() + " 줄 번호: " + lineNumber + " 잘못된 입력입니다");
                        invalidCount++;
                        continue;
                    }

                    totalAmount+=quantity;
                    totalMoney+=(price*quantity);
                    if(items.containsKey(itemName)){
                        Item prevItem = items.get(itemName);
                        prevItem.addQuantity(quantity);
                        items.put(itemName,prevItem);
                    }else{
                        items.put(itemName,new Item(itemName,price,quantity));
                    }

                    branch.addItem(new Item(itemName,price,quantity));
                }
            } catch (IOException e) {
                System.out.println("파일 읽기 실패: " + input.getFileName());
                flag = true;
            }
            if(!flag) branches.add(branch);
        }

        // TODO: 보고서를 문자열로 만들고 콘솔 출력과 파일 저장을 구현하세요.
        StringBuilder report = new StringBuilder();

        report.append("정상 내역: ").append(totalCount - invalidCount).append("건\n");
        report.append("제외한 내역: ").append(invalidCount).append("건\n");
        report.append("전체 판매 수량: ").append(totalAmount).append("잔\n");
        report.append("총매출: ").append(totalMoney).append("원\n");
        report.append("\n");

        report.append("[지점별 매출]\n");

        for (Branch branch : branches) {
            report.append(branch.getName())
                    .append(": ")
                    .append(branch.totalMoney())
                    .append("원")
                    .append("\n");
        }

        report.append("\n");
        report.append("[메뉴별 판매]\n");
        for (String menu : items.keySet()) {
            report.append(menu)
                    .append(": ")
                    .append(items.get(menu).getQuantity())
                    .append("잔 / ")
                    .append(items.get(menu).calcTotal())
                    .append("원\n");
        }

        System.out.print(report);

        try (PrintWriter writer = new PrintWriter(output.toFile())) {
            writer.print(report);
        } catch (FileNotFoundException e) {
            System.out.println("파일 저장에 실패했습니다.");
        }
    }
}
