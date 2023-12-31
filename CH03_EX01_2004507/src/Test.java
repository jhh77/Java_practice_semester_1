// main / ctrl + space / enter
//sysout / ctrl + space / enter
public class Test {
	public static void main(String[] args) {
		//산술연산자
		System.out.println(7 + 4); //11
		System.out.println(7 - 4); //3
		System.out.println(7 * 4); //28
		System.out.println(7 / 4); //1
		System.out.println(7 % 4); //3
		
		//증감연산자
		int a = 3;
		int b = a++; //b = 4;
		System.out.println(a); //4
		System.out.println(b); //3
		a = 3;
		b = ++a; //b = 4;
		System.out.println(a); //4
		System.out.println(b); //4
		a = 3;
		System.out.println(a++); //3
		System.out.println(++a); //5
		a = 3; b = 4;
		int c = a++ + ++b; //c = 8;
		System.out.println(a); //4
		System.out.println(b); //5
		System.out.println(c); //8
	}
}
