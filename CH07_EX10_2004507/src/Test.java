//this 키워드: 자기 자신 클래스 객체 A this = new A();
class A{
	int m;
	int n;
	void abc(int a, int b) {
		m = a; //this. 붙음
		n = b; //this. 붙음
		bcd(); //this. 붙음
	}
	void bcd() {
		System.out.println("bcd() 메서드");
	}
}

class B{
	int m;
	int n;
	void abc(int m, int n) {
		m = m; //지역변수로 인식
		n = n; //지역변수로 인식
		bcd(); //this. 붙음
	}
	void bcd() {
		System.out.println("bcd() 메서드");
	}
}

class C{
	int m;
	int n;
	void abc(int m, int n) {
		this.m = m; 
		this.n = n; 
		bcd(); //this. 붙음
	}
	void bcd() {
		System.out.println("bcd() 메서드");
	}
}

class D{
	int m;
	int n;
	void abc(int m, int n) {
		m = this.m; 
		this.n = n; 
		bcd(); //this. 붙음
	}
	void bcd() {
		System.out.println("bcd() 메서드");
	}
}

public class Test {
	public static void main(String[] ar) {
		//#객체 생성
		A a = new A();
		
		//#멤버 사용
		a.abc(2,3); //bcd() 메서드
		System.out.println(a.m); //2
		System.out.println(a.n); //3
		
		//#객체 생성
		B b = new B();
				
		//#멤버 사용
		b.abc(2,3); //bcd() 메서드
		System.out.println(b.m); //0
		System.out.println(b.n); //0
		
		//#객체 생성
		C c = new C();
		
		//#멤버 사용
		c.abc(2,3); //bcd() 메서드
		System.out.println(c.m); //2
		System.out.println(c.n); //3
		
		//#객체 생성
		D d = new D();
		
		//#멤버 사용
		d.abc(2,3); //bcd() 메서드
		System.out.println(d.m); //0
		System.out.println(d.n); //3
		
	} 
}

//A라는 클래스에서 this. 가 붙는 곳은 몇 개? 3개 this.m , this.n, this.bcd()