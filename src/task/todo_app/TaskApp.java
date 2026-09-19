package task.todo_app;

import java.util.*;

public class TaskApp {
    public static void main(String[] args) {
        // TODO: 할 일 목록을 준비하고 안내에 나온 세 항목을 등록하세요.
        // 목록은 아래 while 바깥에 두어 메뉴를 바꿔도 유지되도록 합니다.

        try (Scanner scanner = new Scanner(System.in)) {
            boolean running = true;
            List<Todo> todoList = new ArrayList<>();
            todoList.add(new Todo(1, "자바 복습",Status.INCOMPLETE));
            todoList.add(new Todo(2, "예외 처리 정리",Status.COMPLETE));
            todoList.add(new Todo(3, "파일 입출력 예제 실행",Status.INCOMPLETE));

            while (running) {
                printMenu();
                int menu = readInt(scanner, "선택: ");
                int cnt = 3;

                switch (menu) {
                    case 1: {
                        String title = readText(scanner, "할 일 제목: ");
                        // TODO: 제목을 검사하고 미완료 항목을 추가하세요.
                        if(title.trim().equals("")){
                            System.out.println("제목이 비어있습니다.");
                            continue;
                        }
                        cnt++;
                        todoList.add(new Todo(cnt,title,Status.INCOMPLETE));
                        break;
                    }
                    case 2:
                        // TODO: 전체 목록을 출력하세요.
                        if(todoList.isEmpty()){
                            System.out.println("조회할 항목이 없습니다.");
                            continue;
                        }
                        for(Todo todo : todoList){
                            System.out.println(todo.getNum() + ". " + todo.getTitle() + "("+todo.getStatus().getStatus() + ")");
                        }
                        break;
                    case 3:
                        // TODO: 미완료 항목만 출력하세요.
                        int count = 0;
                        for(Todo todo : todoList) {
                            if(todo.getStatus().equals(Status.INCOMPLETE)){
                                count++;
                                System.out.println(todo.getNum() + ". " + todo.getTitle() + "(" + todo.getStatus().getStatus() + ")");
                            }
                        }
                        if(count == 0) System.out.println("조회할 항목이 없습니다.");
                        break;
                    case 4: {
                        int targetId = readInt(scanner, "완료할 번호: ");
                        // TODO: 번호로 찾은 항목을 완료 처리하세요.

                        if((Todo.findTodo(todoList,targetId)!=null) ||
                                todoList.get(targetId-1).getStatus().equals(Status.COMPLETE)){
                            System.out.println("없는 번호이거나 이미 완료된 항목입니다.");
                            continue;
                        }
                        todoList.get(targetId-1).complete();
                        break;
                    }
                    case 5:
                        // TODO: 전체·완료·미완료 개수를 출력하세요.

                        long compCount = todoList.stream()
                                .filter(Todo::isComplecated)
                                .count();


                        System.out.println("전체: " + todoList.size());
                        System.out.println("완료: " + compCount);
                        System.out.println("미완료: " + (todoList.size()-compCount));
                        break;
                    case 0:
                        running = false;
                        System.out.println("종료합니다.");
                        break;
                    default:
                        System.out.println("메뉴에 있는 번호를 선택하세요.");
                }
            }
        }
    }

    private static void printMenu() {
        System.out.println();
        System.out.println("1. 할 일 추가");
        System.out.println("2. 전체 목록 보기");
        System.out.println("3. 미완료 목록 보기");
        System.out.println("4. 완료 처리");
        System.out.println("5. 진행 상황 보기");
        System.out.println("0. 종료");
    }

    private static String readText(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            String text = readText(scanner, prompt);
            try {
                return Integer.parseInt(text);
            } catch (NumberFormatException e) {
                System.out.println("정수로 입력하세요.");
            }
        }
    }
}