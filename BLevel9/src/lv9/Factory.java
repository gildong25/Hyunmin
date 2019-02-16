/** 정렬해보기
 *  6 - 1181번: 단어 정렬  
 *  단어들을 정렬하는 문제
 */

package lv9;

import java.util.Scanner;
import java.util.ArrayList;
public class Factory {



private static addInterface addInterfaceS = new AddCalculator(); //정적캐시
private static addInterface addInterfaceD = null;
private static ArrayList<Integer> cached_factorial = new ArrayList<Integer>();
public static addInterface getAddInterface() {
if( addInterfaceD == null) {
addInterfaceD = new AddCalculator(); //동적캐시
}
return addInterfaceD;
}

public static int getFactorial(int x) {

if(cached_factorial.get(x-1) != null) {
return cached_factorial.get(x-1);
}
if(x == 1) {
return 1;
}
int cached_value = x + getFactorial(x-1);
cached_factorial.add(cached_value);
return cached_value;
}
// B
public static void main(String[] args) {
addInterface addAble0 = Factory.getAddInterface();
addInterface addAble1 = Factory.getAddInterface();
addInterface addAble2 = Factory.getAddInterface();
addInterface addAble3 = Factory.getAddInterface();
addInterface addAble4 = Factory.getAddInterface();
addInterface addAble5 = Factory.getAddInterface();
addInterface addAble6 = Factory.getAddInterface();
addInterface addAble7 = Factory.getAddInterface();
addInterface addAble8 = Factory.getAddInterface();
addInterface addAble9 = Factory.getAddInterface();
addInterface addAble10 = Factory.getAddInterface();
addInterface addAble11 = Factory.getAddInterface();
System.out.println(addAble0==addAble1);
}
// show(new addInterface() {
//
// @Override
// public int add(int a, int b) {
// return a+b+1;
// }
// });
// show(new addInterface() {
//
// @Override
// public int add(int a, int b) {
// return a+b+2;
// }
// });
//
// show((a,b)->a+b+1);
// show(Factory::getShow);
// }
//
// public int getShow(int a,int b) {
// return a+b;
// }
//
public static int show(addInterface add) {
return add.add(1, 2);
}
}

class addMock implements addInterface{

@Override
public int add(int a, int b){
return a + b;
}
}

// A
interface addInterface {
public int add(int a, int b);
}

// A

class AddCalculator implements addInterface{

@Override
public int add(int a, int b) {
return a+b+5;
}
}

