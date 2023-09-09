//클래스 내부의 멤버 사용

class A{ //멤버 3개(필드 1, 메서드 2)
	int m=3;
	void abc() {
		System.out.println(m); //a.m이 아니다. 이름만 호출.
		System.out.println("abc() 메서드");
	}
	void bcd() {
		abc(); //이름만 호출.
		System.out.println("bcd() 메서드");
	}
} //실행하려면 객체 생성을 먼저 해야한다. 이건 정의만 한 것.

public class Test {
	public static void main(String[] ar) {
		//#1. 객체 생성
		A a = new A();
		
		//#2. 멤버 호출
		a.abc(); //3 abc() 메서드
		a.bcd(); //3 abc() 메서드 bcd() 메서드
	}
}
