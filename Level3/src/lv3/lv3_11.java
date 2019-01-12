/** for문 사용해보기
 *  11 - 11721번: 열 개씩 끊어 출력하기 
 *  주어진 글자를 10글자씩 나눠 출력하는 문제
 */

package lv3;

import java.util.Scanner;

public class lv3_11 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String input = sc.next();
	        sc.close();
	         
	        for (int i = 0; i < input.length(); ++i) {
	            System.out.print(input.charAt(i));
	            if (i % 10 == 9) {
	                System.out.println();
	            }
	        }
	    }

}
