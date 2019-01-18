/** 1차원 배열 사용하기
 *  2 - 2577번: 숫자의 개수 
 *  세 수를 곱한 수의 각 자리수에 해당하는 숫자의 개수를 저장하기 위한 1차원 배열을 선언하여 문제를 해결해봅니다
 */

package lv6;
import java.util.Scanner;

public class lv6_02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
         
        int[] counts = new int[10];
 
        int number = A * B * C;
        
        while (number > 0) {
            counts[number % 10]++;
            number = number / 10;
        }
         
        for (int i = 0; i < counts.length; ++i) {
            System.out.println(counts[i]);
        }
    }
}