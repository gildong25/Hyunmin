/** for문 사용해보기
 *  9 - 8393번: 합
 *  1부터 N까지의 합을 구합니다
 */

package lv3;

import java.util.*;

public class lv3_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int result=0;
		for(int i = 0; i <= num; i++) {
			result +=i;
		}
		System.out.printf("%d%n",result);
		
	}
}
