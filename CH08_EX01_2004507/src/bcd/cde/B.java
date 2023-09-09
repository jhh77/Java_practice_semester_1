package bcd.cde;
//A 클래스를 사용하는 두번째 방법2-1
 import abc.bcd.A;

public class B {
	void bcd() {
		//A 클래스의 객체 생성 방법 1
		//A a = new A(); // (X)
		abc.bcd.A a1 = new abc.bcd.A();
		
		//A 클래스를 사용하는 두번째 방법2-1
		A a2 = new A();
		
	}
}
