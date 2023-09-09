//생성자 오버로딩
class A{
	A() {
		System.out.println("첫번째 생성자");
	}
	
	A(int a) {
		System.out.println("두번째 생성자");
	}
	
	A(double b) {
		System.out.println("세번째 생성자");
	}
	
	A(int a, int b) {
		System.out.println("네번째 생성자");
	}
	
	A(double a, double b) {
		System.out.println("다섯번째 생성자");
	}
}

public class Test {
	public static void main(String[] ar) {
		//객체 생성
		A a1 = new A();
		A a2 = new A(3);
		A a3 = new A(2.8);
		A a4 = new A(1,2);
		A a5 = new A(2.1, 5.8);
		
		//시험문제형식 - 오버로딩 해놓고 섞어 놓으면 어떤 것이 호출되었는지, 생성자 추가하기.
		
	}
}
