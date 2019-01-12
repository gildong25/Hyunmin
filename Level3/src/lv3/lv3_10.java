/** for문 사용해보기
 *  10 - 11720번: 숫자의 합 
 *  주어진 수를 모두 더하는 문제
 *  
 */

package lv3;

import java.util.*;

public class lv3_10 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int num = sc.nextInt();
	        int sum = 0;
	        String number = sc.next();
	        
	        sc.close();
	        for(int i=0; i<number.length(); i++) {
	        	//charAt-  source에서 한문자씩 차례대로 읽어올 수 있다
	            sum += number.charAt(i)-'0';
	        }
	        System.out.print(sum);
	    }
	
}
