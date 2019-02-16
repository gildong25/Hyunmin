/** 문자열 사용하기 단계
 *  1 - 11654번: 아스키코드  
 *  알파벳의 아스키 코드 값을 출력해봅니다
 */

package lv7;

import java.util.Scanner;

public class lv7_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		char c = input.charAt(0);
		
		System.out.println((int)c);
	}

}
