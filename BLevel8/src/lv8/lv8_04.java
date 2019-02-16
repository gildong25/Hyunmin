/** 규칙 찾기
 *  4 - 번: Fly me to the Alpha Centauri   
 *  거리에 따른 장치 사용 횟수를 출력하는 문제
 */

package lv8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class lv8_04 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int dist, t = Integer.parseInt(in.readLine());
		StringBuilder res = new StringBuilder();
		String line[];
		while (t-- > 0) {
			line = in.readLine().split(" ");
			dist = Integer.parseInt(line[1]) - Integer.parseInt(line[0]);
			res.append(warp(dist) + "\n");
		}
		out.write(res.toString());
		out.close();
		in.close();
	}
	// 워프 횟수
	private static long warp(int dist) {
		long n, minN, powN, maxN, warpCount = 0;
		for (n = 1;; n++) {
			powN = n * n;
			minN = powN - n + 1;
			maxN = powN + 1 + n - 1;
			if (minN <= dist && dist <= maxN) {	
				if (minN <= dist && dist <= powN) // powN(n^2)를 기준으로
					warpCount = (n << 1) - 1;
				else
					warpCount = n << 1;
				break;
			}
		}
		return warpCount;
	}
}