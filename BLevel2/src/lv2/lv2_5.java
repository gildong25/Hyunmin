/** 사칙연산 도전하기
 *	5 - 10869번: 모든 사칙연산 해보기
 * 
 */

package lv2;

import java.util.Scanner;

public class lv2_5 {
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        sc.close();
	        
	        System.out.println(a + b);
	        System.out.println(a - b);
	        System.out.println(a * b);
	        System.out.println(a / b);
	        System.out.println(a % b);
	    }
}
