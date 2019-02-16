/** 문자열 사용하기 단계
 *  4 - 1157번: 단어 공부
 *  주어진 단어 중 가장 많이 사용된 알파벳을 출력하는 문제 - 출력시 대문자로 출력
 */

package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv7_04 {
	public static void main(String[] args) throws IOException {
		// BufferReader로 받아옴
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine().trim().toUpperCase(); // 대문자로 통일
		
		int[] cnt = new int[26]; // a-z
		int i;
		for (i = 0; i < input.length(); i++) {
			cnt[input.charAt(i) - 65]++;	// 알파벳 별 카운트
		}

		int max = Integer.MIN_VALUE;
		for (i = 0; i < 26; i++) {
			if (cnt[i] > max) {
				max = cnt[i];	// 최대값 찾기
			}
		}
		// StringBuilder - 문자열 담는것, 수정가능
		StringBuilder sb = new StringBuilder();
		int check = -1;
		for (i = 0; i < 26; i++) {
			if (cnt[i] == max) {
				if (check != -1) {
					sb.append("?");	// 없을시 ? 출력
					System.out.print(sb.toString());
					return;
				}
				check = i;
			}
		}

		sb.append((char) (check + 65));	// 형변환 
		System.out.print(sb.toString());	

	}
}
