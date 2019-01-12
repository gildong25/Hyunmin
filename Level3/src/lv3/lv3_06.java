/** for문 사용해보기
 *  6 - 2440번: 별 찍기 - 3 
 *  첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 출력해 봅니다.
 */

package lv3;

import java.util.Scanner;

public class lv3_06 {
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
				
		for(int i = 1; i < num + 1 ; i++) {
			for(int j = num ; j > 0; j--) {
				if( i <= j )
					System.out.print("*");
				else
					System.out.print("");
			}
			System.out.println();
			
		}
		
	}
}