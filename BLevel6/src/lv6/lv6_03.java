/** 1차원 배열 사용하기
 *  3 - 8958번: OX 퀴즈 
 *  OX퀴즈의 결과를 일차원 배열로 입력받아 점수를 계산합니다
 */


package lv6;

import java.util.Scanner;
 
public class lv6_03 {
     public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int T = sc.nextInt();
    	int O_score = 0;
    	int sum = 0;
    	String[] str = new String[T];
    	int[] result = new int[T];
    	
    	for(int i=0; i<T;i++)
    		str[i] = sc.next();
    	
    	for(int i=0; i<str.length; i++) {
    		for(int j=0; j<str[i].length(); j++) {
    			if(str[i].charAt(j) == 'O') {
    				O_score++;
    				sum += O_score;
    			}
    			else 
    				O_score=0;
    		}
    		
    		result[i] = sum;
    		
    		O_score = 0;
    		sum = 0;
    	}
    	sc.close();
    	for(int i =0; i<result.length; i++)
    		System.out.println(result[i]);
    }
}
