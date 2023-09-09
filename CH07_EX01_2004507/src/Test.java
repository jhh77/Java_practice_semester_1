//필드
class A{
	int m = 3;
	int n;
	void print(int i) {
		int k;
		System.out.println(m); 
		System.out.println(n); 
		System.out.println(i);
		//System.out.println(k); //지역변수는 초기화 이후에만 출력가능 (stack은 빈칸이 존재하기 때문에)
	}
}


public class Test {
	public static void main(String[] ar) {
		//#1. 객체 생성
		A a = new A();
		
		//#메서드 호출
		a.print(7); //매개변수가 있는 함수
		
	}
}
