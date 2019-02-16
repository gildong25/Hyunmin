/** ¹®ÀÚ¿­ »ç¿ëÇÏ±â ´Ü°è
 *  2 - 10809¹ø:  ¾ËÆÄºª Ã£±â
 *  ÇÑ ´Ü¾î¿¡¼­ °¢ ¾ËÆÄºªÀÌ Ã³À½ µîÀåÇÏ´Â À§Ä¡¸¦ Ã£¾Æº¾´Ï´Ù
 */

package lv7;

import java.util.Arrays;
import java.util.Scanner;

public class lv7_02 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in); 
		        
		        String input = sc.nextLine();
		        
		        //¹è¿­ »ç¿ë
		        int[] arr = new int[26];
		        Arrays.fill(arr, -1);	// ¹è¿­ ÃÊ±âÈ­
		        
		        for (int i=0; i<input.length(); i++){
		            char tmp  = input.charAt(i);		// ÀÎµ¦½º À§Ä¡ ÇØ´ç ¹®ÀÚ ­ˆÃâ
		            int index = input.indexOf(tmp);
		            
		            arr[tmp-97] = index;	// ÀÎÆ®Çü ¹è¿­¿¡ ´ã±â
		        }
		        
		        for (int i = 0; i < arr.length; i++)
		            System.out.print((i != arr.length -1) ? arr[i] + " " : arr[i]);
		        //¶÷´Ù½ÄÀ¸·Î ÀÎµ¦½º ÃßÃâ
		      sc.close();  
	}

}
