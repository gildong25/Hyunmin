/** for문 사용해보기
 *  7 - 2441번: 별 찍기 - 4
 *  첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 출력해 봅니다. (오른쪽 정렬)
 */

package lv3;
import java.util.Scanner;
public class lv3_07 {
	public static void main(String[] args)
		{	
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.close();
			//int num = 5;
			
			for (int i = 1; i <= num; ++i) {
	            for (int j = 1; j <= i - 1; ++j) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= num - i + 1; ++j) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}