/** 문자열 사용하기 단계
 *  5 - 1316번: 그룹 단어 체커 
 *  규칙에 맞는 알파벳의 개수를 출력하는 문제1
 */

package lv7;

import java.util.Scanner;

public class lv7_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 단어 개수 n
		String[] words = new String[n];
		char[] seg;

		int check = 0;
		int answer = 0;

		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
			seg = words[i].toCharArray(); // 저장

			for (int a = 0; a < seg.length; a++) {
				for (int b = a + 1; b < seg.length; b++) { // 앞의 문자와 비교
					if (seg[a] == seg[b] & seg[a] != seg[b - 1]) { // 다른 경우
						check = 1; // 아님을 check
					}
				}
			}
			if (check == 0) {
				answer += 1;
			}
			check = 0; // check 삭제
		}
		System.out.println(answer);
	}
}