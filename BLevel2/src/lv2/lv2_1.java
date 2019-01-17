/** 사칙연산 도전하기
 *	1 - 1000번: 두 수의 덧셈
 *  Scanner
 */

package lv2;

import java.util.Scanner;

public class lv2_1 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        
        System.out.println(a + b);
    }
}
