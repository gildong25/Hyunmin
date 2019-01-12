/** 입출력 받아보기
 *	8 - 11719번: 입력받은 문자를 출력하는 문제2
 *  Scanner / while
 */

package ch1;

import java.util.Scanner;

public class ch1_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
				String input = sc.nextLine();
				System.out.println(input);
		}
		sc.close();
	}
}
