
public class Test {
	public static void main(String[] ar) {
//		변수의 생명 주기		
		int a; 
		{
			int b;
			a = 5;
			b = 7;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
//		System.out.println(b); //b는 메모리에서 이미 사라짐.
	}
}
