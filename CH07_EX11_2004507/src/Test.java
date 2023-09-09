//this() 메서드: 자기 자신의 다른 생성자 호출
class A{
	A() {
		this(2.8);
		System.out.println("1");
	}
	
	A(int a) {
		this(1,2);
		System.out.println("2");
	}
	
	A(double b) {
		this(3);
		System.out.println("3");
	}
	
	A(int a, int b) {
		System.out.println("4");
	}
	
}
public class Test {
	public static void main(String[] ar) {
		//#객체 생성
		A a1 = new A(); //4 2 3 1
		A a2 = new A(3); //4 2
		A a3 = new A(1.2); //4 2 3 
		A a4 = new A(1,2); //4
		//4 2 3이 나오도록 this를 작성할 줄 알기. 또는 출력결과 쓸 줄 알아야 함.
	}
}
