package abc;

public class A {
	public int a;
	protected int b;
	int c;
	private int d;
	
	void abc() {
		//클래스 내부에서는 네가지 접근지정자 모두 사용 가능
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
