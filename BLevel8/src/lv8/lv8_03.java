/** 규칙 찾기
 *  3 - 번: 분수찾기   
 *  각 번호의 분수들이 어떤 규칙을 있는지 유추해 문제를 해결해 봅니다
 */

package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv8_03 {
 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int line = 0;
        int cnt = 0;
        while(cnt < n) { // 라인증가
            line++;
            cnt = line * (line+1) / 2;
        }
        // 등차수열 n(n+1)/2
        if( line % 2 != 0) {	// 홀수 
            int top = 1+(cnt-n);
            int bottom = line - (cnt-n);
            System.out.println(top+"/"+bottom);
        }else {					// 짝수
            int top = line - (cnt - n);	
            int bottom = 1 + (cnt - n);
            System.out.println(top+"/"+bottom);
        }// end if
        
    }
}
