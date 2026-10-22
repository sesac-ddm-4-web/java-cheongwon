package task.cote.part11.ex1;

/**
 * Just 구현
 */
class Solution {
    public int[] solution(String[] park, String[] routes) {
        //길:'O', 장애물:'X'
        //HxW
        int H = park.length;
        int W = park[0].length();
        boolean[][] m = new boolean[H][W];
        int y = 0;
        int x = 0;

        for(int h=0; h<H; h++){
            char[] temp = park[h].toCharArray();
            for(int w=0; w<W; w++){
                if(temp[w] == 'S'){
                    y=h;
                    x=w;
                    m[h][w] = true;
                }
                if(temp[w] == 'O') m[h][w] = true;
                if(temp[w] == 'X') m[h][w] = false;
            }
        }

        for(String route : routes){
            String[] temp = route.split(" ");
            String op = temp[0];
            int n = Integer.parseInt(temp[1]);
            int y_sign = 0;
            int x_sign = 0;

            if(op.equals("N")){
                //북쪽 -> y좌표 -
                y_sign = -1;
                x_sign = 0;
            }
            if(op.equals("S")){
                //남쪽 -> y좌표 +
                y_sign = 1;
                x_sign = 0;
            }
            if(op.equals("W")){
                //서쪽 -> x좌표 -
                x_sign = -1;
                y_sign = 0;
            }
            if(op.equals("E")){
                //동쪽 -> x좌표 +
                x_sign = 1;
                y_sign = 0;
            }
            boolean flag = false;
            int ny = y;
            int nx = x;
            for(int i=0; i<n; i++){
                ny+=y_sign;
                nx+=x_sign;
                if(ny<0 || ny>=H || nx<0 || nx>=W){
                    flag = true;
                    break;
                }
                if(!m[ny][nx]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                y=ny;
                x=nx;
            }
        }
        int[] answer = new int[]{y,x};
        return answer;
    }
}