
public class Test {
	public static void main(String[] ar) {
		//삼항연산자
		int a = 3;
		int b = (a > 2)?10:20;
		System.out.println(b); //10
		
		a = 3;
		b = (a < 2)?10:20; 
		System.out.println(b); //20
		
		a = 3;
		b = 5;
		int c = (a > 2)?(b<5)?10:20:30;
		int d = (a < 2)?(b < 7)?10:20:(b > 5)?30:40;
		System.out.println(c); //20
		System.out.println(d); //40
	}
}
