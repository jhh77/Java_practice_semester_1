//메서드 오버로딩
class A{
	int m;
	//double m; //필드는 절대 오버로딩이 될 수 없음
	void abc() {
		System.out.println("메서드 1");
	}
	void abc(double a) {
		System.out.println("메서드 2");
	}
//	int abc(int b) { //오버로딩 불가능. 왜? 시그너처가 같으니까. 변수와 리턴타입은 시그너처가 아니다. 
//		System.out.println("메서드 3");
//	}
	void abc(int a) {
		System.out.println("메서드 3");
	}
	void abc(int a, int b) {
		System.out.println("메서드 4");
	}
	//나중에 bcd 메서드 만들어보기. 리턴타입은 void. 매개변수로 int로 받을 수 있어야하고, double도 받을 수 있어야한다. - 만들 줄 알아야함.
	
	//#미션
	void abc(int a, int b, int c) {
		System.out.println("메서드 5");
	}
	void abc(int a, int b, int c, int d) {
		System.out.println("메서드 6");
	}
	void abc(int a, int b, int c, int d, int e) {
		System.out.println("메서드 7");
	}
	void abc(int a, int b, int c, int d, int e, int f) {
		System.out.println("메서드 8");
	}
	void abc(int a, int b, int c, int d, int e, int f, int g) {
		System.out.println("메서드 9");
	}
}

public class Test {
	public static void main(String[] ar) {
		//#1. 객체 생성
		A a = new A();
		
		//#2. 멤버 호출
		a.abc(); //메서드1
		a.abc(2.8); //메서드2
		a.abc(3); //메서드3
		a.abc(4,5); //메서드4
		//시험형식- 어떤 메서드를 호출한건지 결과 쓸 줄 아는 것.
		//시험형식- 메서드2, 메서드4가 호출되도록 코드를 써라.

		//#미션 
		a.abc(1,2,3);
		a.abc(1,2,3,4);
		a.abc(1,2,3,4,5);
		a.abc(1,2,3,4,5,6);
		a.abc(1,2,3,4,5,6,7);
		
		//... 가변길이매개변수
		//a.abc(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16);
		
	}
}
