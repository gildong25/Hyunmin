/** for문 사용해보기
 *  1 - 2741번: N 찍기
 *  1부터 N까지 숫자를 한줄에 하나씩 출력해 봅니다 
 *  
 */

package lv3;

import java.util.Scanner;

public class lv3_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for(int i=0; i < num; i++)
			System.out.println(i+1);
	}

}
