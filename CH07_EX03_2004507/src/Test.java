//클래스 외부에서 멤버 호출

class A { //멤버 2(필드 1, 메서드 1)
	int m=3;
	void abc() {
		System.out.println("클래스 A 메서드");
	}
	int bcd() {
		return m;
	}
}

public class Test {
	public static void main(String[] ar) {
		//#1. 객체 생성
		A a = new A();
		
		//#2. 멤버 호출
		a.m=5;
		System.out.println(a.m); //5
		a.abc(); //클래스 A 메서드
		int k = a.bcd(); 
		System.out.println(k); //5
		a.bcd(); //가능. 리턴값 받지 않음. 
	}
}
