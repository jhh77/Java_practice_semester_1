//필드의 강제 초기값

class A{
	boolean a;
	int b;
	double c;
	String d;
	void print() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}


public class Test {
	public static void main(String[] ar) {
		//#1. 객체 생성
		A a = new A();
		
		//#2. 메서드 호출
		a.print(); //false, 0, 0.0, null 출력
	}
}

