/** 문자열 사용하기 단계
 *  3 - 2675 번: 문자열 반복
 *  문자열의 각 문자를 반복하여 출력해봅니다
 */

package lv7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class lv7_03 {

	public static void main(String[] args) throws IOException {
	// 버퍼리더 - 입력 / 버퍼라이터 - 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) { // 글자당 반복출력
			String[] temp = br.readLine().trim().split(" ");
			int r = Integer.parseInt(temp[0]);
			String s = temp[1];
			int i, j;
			for (i = 0; i < s.length(); i++) { // 인덱스 길이만큼 만큼 출력
				for (j = 0; j < r; j++) {
					bw.write(s.charAt(i));	
				}
			}
			bw.write("\n");
		}

		bw.flush();
		br.close();
		bw.close();
	}

}
