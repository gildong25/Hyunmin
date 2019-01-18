/** 1차원 배열 사용하기
 *  1 - 1152번: 단어의 개수 
 *  일차원 문자열 배열에서 단어의 개수를 구해봅니다
 */

package lv6;

import java.util.Scanner;
import java.util.StringTokenizer;

public class lv6_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		
		// StringTokenizer : 문자열 나누기
		StringTokenizer strToken = new StringTokenizer(N," ");
		// countTokens : 토큰 갯수 세기
		System.out.println(strToken.countTokens());	
		sc.close();
	}
}
