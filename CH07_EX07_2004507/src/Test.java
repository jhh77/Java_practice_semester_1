//가변길이 매개변수

class A{ //멤버 1개(메서드 1)
	void abc(int... a) { //호출되면 int[] a; 먼저 실행
		System.out.println(a.length); //매개변수의 길이 출력
		for(int i=0; i < a.length; i++) { //매개변수 각각의 값 출력
			System.out.println(a[i]);
		}
	}
	
	void bcd(String s, int... a) { //이렇게도 가능. 하지만 가변길이 매개변수는 마지막에만 올 수 있음. 하나만 올 수 있음. int... double... 안됨
		System.out.println(a.length); //매개변수의 길이 구하기
		for(int i=0; i < a.length; i++) { //매개변수 각각의 값 출력
			System.out.println(a[i]);
		}
	}
}

public class Test {
	public static void main(String[] ar) {
		//#1. 객체생성
		A a = new A();
		
		//#2. 멤버호출
		a.abc(1,2,3); // 3 1 2 3 
		a.abc(1,2); // 2 1 2
		a.abc(); //0 배열이 안 만들어지는 것이 아님. 길이가 0인 배열
		
		a.bcd("2학년 A반", 1,2,3); 
	}
}
