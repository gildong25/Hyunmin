/** if문 사용해보기
 *  4 - 1546번: 평균 
 *  최대값을 찾아, 그 값으로 다른 값들을 바꾼 후 평균을 구하는 문제
 */
package lv4;

import java.util.Arrays;
import java.util.Scanner;

public class lv4_04 {
	public static void main(String[] args) {
		int M = 0; // 최댓값
		int cnt = 0; // 총합
		double result = 0; // 새로운 평균
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		// arr 배열에 값 넣기
		for(int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
			cnt += arr[i];
		}
		sc.close();
		
		// arr 배열 정렬 후 최대값(M)찾기
		Arrays.sort(arr);
		M = arr[arr.length-1];
		
		
		result = 100.0 * cnt / M / N;
		System.out.printf("%.2f",result);
		
	}

}
