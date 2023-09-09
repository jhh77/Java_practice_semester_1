
public class Test {
	public static void main(String[] ar) {
		//비교연산자
		int a = 3;
		System.out.println(a > 2); //true
		System.out.println(a < 2); //false
		System.out.println(a >= 3); //true
		System.out.println(a <= 3); //true
		System.out.println(a == 3); //true
		System.out.println(a != 3); //false
		
		//논리연산자
		System.out.println(true && (3 > 2)); //true
		System.out.println(false || !(3 > 2)); //false
		System.out.println(!false ^ !(3 > 2)); //true
		
		//비트연산자를 이용한 논리연산
		a = 3;
		int b = 3, c = 3;
		System.out.println(false && a++>3); //false
		System.out.println(true || ++b>3); //true
		System.out.println(false ^ c++>3); //c = 3, false
		System.out.println(a); //3
		System.out.println(b); //3
		System.out.println(c); //4
		
		a = 3; b = 3; c = 3;
		System.out.println(false & a++>3); //false
		System.out.println(true | ++b>3); //true
		System.out.println(false ^ c++>3); //false
		System.out.println(a); //4
		System.out.println(b); //4
		System.out.println(c); //4
		
		
		a = 3; b = 3;
		System.out.println(true & a++>3); //a = 3, false
		System.out.println(false | b++>3); // b = 3, false
		System.out.println(a); //4
		System.out.println(b); //4
		
		a = 3; b = 3;
		System.out.println(true && a++>3); //false
		System.out.println(false || b++>3); //false
		System.out.println(a); //4 , 숏서킷이 안되니까
		System.out.println(b); //4
		

	}
}
