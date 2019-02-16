/** 규칙 찾기
 *  2 - 2292번: 벌집    
 *  벌집이 형성되는 규칙을 유추해 문제를 해결해 봅니다
 */

package lv8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lv8_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.print(solution(n));
	}

	private static int solution(int n) {
		// 1: 1 (1)
		// a(n) = a(n-1) + 6(n-1) | a(n): 첫 항
		if (n == 1)
			return 1; 	// 1: 1 (1)
		
		int i = 2;
		int k = 1;

		while (i <= n) { // a(n) = a(n-1) + 6(n-1) | a(n): 첫 항
			i += 6 * k++;
		}

		return k;
	}
}
