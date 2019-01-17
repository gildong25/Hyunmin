/** for문 사용해보기
 *  2 - 2742번: 기찍 N
 *  N부터 1까지 숫자를 한줄에 하나씩 출력해 봅니다. (역순)
 *  
 */

package lv3;

import java.util.Scanner;

public class lv3_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=num; i > 0 ; i--)
			System.out.println(i);
	}

}