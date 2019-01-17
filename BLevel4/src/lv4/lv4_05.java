/** if문 사용해보기
 *  5 - 4344번: 평균은 넘겠지 
 *  평균이 넘는 학생들의 퍼센테이지를 출력하는 문제
 */
package lv4;

import java.util.*;

public class lv4_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();	// 케이스수
		int N = 0;				// 학생수
		
		double avg = 0;			// 평균점수
		int[] arr = new int[1000];
		
		// 케이스 수 확인
		for (int i=0; i < C; i++) {
			N = sc.nextInt();
			int total = 0;			// 합계
		    int num = 0;			// 평균넘는 학생수
		
		    for(int j=0; j < N; j++) {	// 입력 반복문
				arr[j] = sc.nextInt();
				total += arr[j]; 		// 합계구하기
			}
			avg = (double)total / N;    // 평균구하기
			
			for(int j=0; j < N; j++) { // 학생수 세기
				if(arr[j]>avg) {
					num++;
				}
			}
			System.out.printf("%.3f", 100.0 * num / N);
			System.out.println("%");
		}
		sc.close();
	}
}
