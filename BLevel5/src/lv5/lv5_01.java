/** 함수 사용하기
 *  1 - 4673번: 셀프넘버
 *  자연수 n에 대해 d(n)의 값을 구하는 함수를 정의해 문제를 해결 해 봅니다
 */
package lv5;

public class lv5_01 {
	static int d[] = new int [10036];
	
	public static void main(String[] args) {
		for(int i = 1; i <= 10000; i++) {
			d[dn(i)] = 1;
			if(d[i]!=1) System.out.println(i);
		}
	}
	
	static int dn(int i) {
		int res = i;
		if(i >= 10000) { res += i / 10000; i %= 10000; }
		if(i >= 1000) { res += i / 1000; i %= 1000; }
		if(i >= 100) { res += i / 100; i %= 100; }
		if(i >= 10) { res += i / 10; i %= 10; }
		return res += i;
	}

}
