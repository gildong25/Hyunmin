/** 사칙연산 도전하기
 *	6 - 10430번: 나머지 연산을 하고 계산한 결과와 계산을 한 결과를 나머지 연산한 결과가 같은지 살펴보기
 * 
 */

package lv2;

import java.util.Scanner;

public class lv2_6 {
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        int C = sc.nextInt();
	        sc.close();
	        
	        System.out.println((A+B)%C);
	        System.out.println((A%C + B%C)%C);
	        System.out.println((A*B)%C);
	        System.out.println((A%C * B%C)%C);
	    }
}
