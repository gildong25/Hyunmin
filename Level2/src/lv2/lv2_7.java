/** 사칙연산 도전하기
 *	7 - 2558번: 두 수의 입력을 받아 더한 값을 출력하는 문제
 *  nextInt() 는 줄바꿈과 관계없다.
 */

package lv2;

import java.util.Scanner;

public class lv2_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
	
		System.out.println(a+b);
	}
}
