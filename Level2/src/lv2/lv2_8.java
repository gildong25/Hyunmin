/** 사칙연산 도전하기
 *	8 - 2839번: 나누기, 나머지 연산을 이용하는 문제
 * 
 */
package lv2;

import java.util.Scanner;

public class lv2_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		if( N % 5 == 0 ){
			System.out.println(N/5);
            return;
        } else {
			int num5 = N / 5;
			
			for( int i = num5 ; i > 0 ; i-- ) {
			  int tmp = N - i * 5;
				if( tmp % 3 == 0 ) {
					int num3 = tmp / 3;
					System.out.println(num3 + i);
                    return;
				}else
					continue;
			}
		}
        
		if( N % 3 == 0 )
			System.out.println(N/3);
		else
			System.out.println(-1);
	}
    
}