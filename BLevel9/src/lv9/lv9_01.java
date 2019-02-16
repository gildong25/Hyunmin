/** 정렬해보기
 *  1 - 2750 번: 수 정렬하기   
 *  삽입 정렬, 거품 정렬 등의 간단한 정렬 알고리즘을 구현해 봅니다
 */

package lv9;

import java.util.Scanner;

public class lv9_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] data = new int[n];
		int temp;
		
		for(int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
		}

		sc.close();
		
		for(int i = data.length; i>0;i--) {
			for(int j = 0; j<i-1; j++) {
				if(data[j]>data[j+1]) {
					temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < data.length; i++)
			System.out.println(data[i]);
	}

}
