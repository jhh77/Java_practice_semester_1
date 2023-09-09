//생성자
class A{
	int m;
	void abc() {
		System.out.println(m); //같은 클래스에서 멤버가 멤버를 부르니까 이름만 씀.
	}
//	A() { //컴파일러가 자동으로 추가해주는 생성자(기본 생성자) - 기본생성자는 입력매개변수가 없는 생성자
//		
//	}
}

class B{ //직접 기본생성자를 추가한 경우
	int m;
	void abc() {
		System.out.println(m); 
	}
	B() {
		m = 3;
	}
}

class C{
	int m;
	void abc() {
		System.out.println(m); 
	}
	C(int a) {
		m = a;
	}
}

public class Test {
	public static void main(String[] ar) {
		//#객체 생성
		A a = new A();
		
		//#멤버 호출
		a.abc(); //0
		
		//#객체 생성
		B b = new B();
		
		//#멤버 호출
		b.abc(); //3
		
		//#객체 생성
		C c1 = new C(2);
		C c2 = new C(5);
		
		//#멤버 호출
		c1.abc(); // 2
		c2.abc(); // 5
		
	}
}
