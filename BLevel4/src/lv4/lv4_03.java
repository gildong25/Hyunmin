/** if문 사용해보기
 *  3 - 10871번: X보다 작은 수
 *  정수 N개 중에서 X보다 작은 수 모두 출력해보기
 */
package lv4;

import java.util.*;

public class lv4_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < X)
				System.out.print(arr[i] + " ");
		}
	}
}
