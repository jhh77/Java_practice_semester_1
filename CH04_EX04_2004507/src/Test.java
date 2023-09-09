
public class Test {
	public static void main(String[] ar) {
		//if 선택제어문
		//type1
		int a=5;
		if(a>2) {
			System.out.println("실행1");
		}
		if(a<2) {
			System.out.println("실행2");
		}
		
		//type2
		if(a<2) {
			System.out.println("실행3");
		}
		else {
			System.out.println("실행4");
		}
		
		//type 3
		a=85;
		if(a>=90) {
			System.out.println("A학점");
		}
		else if(a>=80) {
			System.out.println("B학점");
		}
		else if(a>=70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("D학점");
		}
		
		a=85;
		
		if(a>=70) {
			System.out.println("C학점");
		}
		else if(a>=80) {
			System.out.println("B학점");
		}
		else if(a>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("D학점");
		}
		
		a=85;
		//이렇게 고치면 된다.
		if(a>=70 && a<80) {
			System.out.println("C학점");
		}
		else if(a>=80 && a<90) {
			System.out.println("B학점");
		}
		else if(a>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("D학점");
		}
	}
}
