/** 규칙 찾기
 *  1 - 2438번: 별 찍기 - 1   
 *  출력 예시의 별 모양을 보고 규칙을 유추해 봅니다
 */
package lv8;
	
import java.util.*;

public class lv8_01 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.close();
			
	        for(int i = 0; i < num; i++) {
	            for(int j = 0; j <= i ; j++){
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		}
	}
		