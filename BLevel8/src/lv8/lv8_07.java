/** 규칙 찾기
 *  7 - 2775번: 부녀회장이 될테야    
 *  층과 거주자 수의 규칙을 찾는 문제
 */

package lv8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class lv8_07 {
	 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(br.readLine());
        
        int[][] apartment = new int[15][16];
        for(int i=0; i<=14; i++) { // 초기화 세팅
            apartment[i][1] = 1;
            apartment[0][i+1] = i+1; 
        }
        
        for(int j=0; j<t; j++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            
            for(int r=1; r<=k; r++) {
                
                for(int c=1; c<=n; c++) {
                    apartment[r][c] = apartment[r][c-1] + apartment[r-1][c];
                }
                
            }
            
            bw.write(String.valueOf(apartment[k][n]));
            bw.newLine();
        }
        
        bw.flush();
    }
 
}