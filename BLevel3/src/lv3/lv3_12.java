/** for문 사용해보기
 *  12 - 15552번: 빠른 A+B 
 *  
 */

package lv3;

import java.io.*;
import java.util.*;

public class lv3_12 {
	    static StringTokenizer st;
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        
	        st = new StringTokenizer(br.readLine());
	        int t = Integer.parseInt(st.nextToken());
	        int[] plusArray = new int[t];
	        
	        for(int i=0; i<t; i++) {
	            st = new StringTokenizer(br.readLine());
	            int a = Integer.parseInt(st.nextToken());
	            int b = Integer.parseInt(st.nextToken());
	            
	            plusArray[i] = a+b;
	        }
	        
	        for(int output : plusArray) {
	            bw.write(String.valueOf(output));
	            bw.newLine();
	        }
	        bw.flush();
	    }

}
