/** 입출력 받아보기
 *	2 - 1000번: a,b 입력받아 A+B 출력
 *  ** Scanner 이용 **
 */

package lv1;

import java.util.Scanner;

public class lv1_2 {
	    public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int a = sc.nextInt();
	       int b = sc.nextInt();
	       sc.close();
	         
	       System.out.println(a + b);
    }
}
