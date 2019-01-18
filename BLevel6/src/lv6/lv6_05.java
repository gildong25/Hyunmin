/** 1차원 배열 사용하기
 *  5 - 10039번: 평균 점수 
 *  조건에 따라 주어진 배열의 평균을 구하는 문제
 */
package lv6;

import java.util.Scanner;

public class lv6_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 5;
		int[] arr = new int[N];
		int total=0;
		
		// arr 배열에 값 넣기
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i]>=40)
				total += arr[i];
			else
				total += 40;
		}
		
		System.out.println(total/5);
		sc.close();
	}

}
