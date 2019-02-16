/** 함수 사용하기
 *  2 - 1065번: 한수
 *  각 자리수가 등차수열을 이루는 지 판별하는 함수를 구현해 문제를 해결해 봅니다.
 */
package lv5;

import java.util.Scanner;

public class lv5_02 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
	     int count = 0;
	         
	        for(int j = 1; j <= n; j++)  {
	            String stringj = Integer.toString(j);
	            int length = stringj.length();
	            int num1 = Integer.parseInt(stringj.substring(0, 1));
	            int dff = 10;
	             
	            boolean isOK = true;
	            
	            for(int i = 1; i < length; i++)  {
	                int num2 = Integer.parseInt(stringj.substring(i, i+1));
	                 
	                if(dff == 10)   {
	                    dff = num2 - num1;
	                }else   {
	                    if(dff != (num2 - num1))    {
	                        isOK = false;
	                        break;
	                    }
	                }  
	                num1 = num2;
	            }
	             
	            if(isOK){
	                count++;
	            }
	        }
	        System.out.println(count);
	}

}
