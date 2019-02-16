/** 문자열 사용하기 단계
 *  7 - 2908 번: 상수
 *  숫자를 뒤집어서 비교하는 문제
 */

package lv7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv7_07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().trim().split(" "); // 띄어쓰기로 단어 나눔
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);

		// 뒤집은 수
		int new_a = 0, new_b = 0;
		new_a = (a % 10) * 100 + ((a % 100) / 10) * 10 + (a / 100);

		new_b = (b % 10) * 100 + ((b % 100) / 10) * 10 + (b / 100);

		System.out.println((new_a > new_b) ? new_a : new_b);
	}

}
