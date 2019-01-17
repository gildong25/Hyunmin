/** for문 사용해보기
 *  5 - 2439번: 별 찍기 - 2
 *  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개 출력해 봅니다. (오른쪽 정렬)
 */

package lv3;
import java.util.Scanner;

public class lv3_05 {
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
				
		for(int i = 0; i <= num ; ++i) {
			for(int j = num ; j > 0; j--) {
				if( i < j )
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}