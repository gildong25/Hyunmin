/** 1차원 배열 사용하기
 *  4 - 2920번: 음계 
 *  주어진 배열이 오름차순인지 아닌지 판단하는 문제
 */
package lv6;

import java.io.*;

public class lv6_04 {
    public static void main(String[] args) throws IOException {
    	//버퍼리더 사용하기
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String note = br.readLine().trim();
        
        //버퍼리더 사용하기
        if(note.equals("1 2 3 4 5 6 7 8")) {
            bw.write("ascending");
        }else if(note.equals("8 7 6 5 4 3 2 1")) {
            bw.write("descending");
        }else {
            bw.write("mixed");
        }
        bw.flush();
    }
 
}
