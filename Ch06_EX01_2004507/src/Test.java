//package, import, class

class A{
	int m=3;
	void print() {
		System.out.println(m);
	}
}

public class Test { //Test 안에는 메서드 1개만 있는 것. main메서드 안에 있는 것은 지역변수
	//field(필드), method(메서드), 생성자, 이너클래스
	public static void main(String[] ar) {
		//#1. 객체생성
		A a1 = new A();
		A a2 = new A();
		//#필드사용 (필드값에 값을 넣거나 빼는 것)
		System.out.println(a1.m);
		System.out.println(a2.m);
		a1.m = 5;
		a2.m = 7;
		//#메서드 사용 (=메서드 호출)
		a1.print(); //5
		a2.print(); //7
	}
}
