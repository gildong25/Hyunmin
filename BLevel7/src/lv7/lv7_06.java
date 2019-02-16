/** 문자열 사용하기 단계
 *  6 - 1152 번: 단어의 개수  
 *  단어의 개수를 구하는 문제
 */

package lv7;

import java.util.Scanner;

public class lv7_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int result = 0;
		String s = sc.nextLine();

		String word = "";
		for (int i = 0; i < s.length(); i++) {
			String c = String.valueOf(s.charAt(i));
			if (c.equals(" ")) {
				// 스페이스바 찾아내기
				word = "";
			} else {
				if (word.length() == 0) {
					result++; // 스페이스바 갯수 뽑기
				}
				word = c;
			}
		}
		System.out.println(result);
	}

}
