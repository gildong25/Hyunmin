/** 정렬해보기
 *  2 - 2751번: 수 정렬하기 2   
 *  병합정렬(Merge Sort) 혹은 힙 정렬(Heap Sort)을 사용해 봅니다
 */

package lv9;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

 
public class lv9_02 {

	    public static void main(String[] args) {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        try {
	            int n = Integer.parseInt(br.readLine());
	            ArrayList<Integer> data = new ArrayList<Integer>();
	            for(int i=0; i<n; i++) {
	                data.add(Integer.parseInt(br.readLine()));
	            }
	            Collections.sort(data);
	            for(int i=0; i<n; i++) {
	                System.out.println(data.get(i));
	            }
	        } catch (Exception e) {
	            // TODO: handle exception
	            e.printStackTrace();
	        }
	    }
}