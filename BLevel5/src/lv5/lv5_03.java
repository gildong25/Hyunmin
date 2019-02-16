/** 함수 사용하기
 *  3 - 2448번: 별 찍기 - 11
 *  그리고자 하는 삼각형의 크기와 위치에 대한 함수를 정의해 재귀적으로 문제를 해결해 봅니다.
 */
package lv5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class lv5_03 {
    private static char[][] map;
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int n = Integer.parseInt(br.readLine());
            map= new char[n][2*n-1];
            initMap(n);
            
            drawStar(0, n-1, n);
            int i;
            for(i=0; i<n; i++) {
                bw.write(map[i]);
                bw.write('\n');
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // 별 그리기
    private static void drawStar(int x, int y, int n) {
        if(n == 3) {
            map[x][y] = '*';
            map[x+1][y-1] = map[x+1][y+1] = '*';
            map[x+2][y-2] = map[x+2][y-1] = map[x+2][y] = map[x+2][y+1] = map[x+2][y+2] = '*';
            return;
        }
        
        // 윗 삼각형
        drawStar(x, y, n/2);
        // 아래 왼쪽 삼각형
        drawStar(x + n/2, y - n/2, n/2);
        // 아래 오른쪽 삼각형
        drawStar(x + n/2, y + n/2, n/2);
    }
    
    // 초기화
    private static void initMap(int n) {
        int i,j;
        for(i=0; i<n; i++) {
            for(j=0; j<2*n-1; j++) {
                map[i][j] = ' ';
            }    
        }
    }
    

}