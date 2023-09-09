
public class Test {
	public static void main(String[] args) {
		//while 반복제어문
		//다음 for문을 while문으로 바꾸어라.
		for(int a=0; a<3; a++) { //3번
			System.out.println(a);
		}
		//while문으로 변경
		int a=0;
		while(a<3) {
			System.out.println(a);
			a++;
		}
		
		//다음 while문에서 A가 출력되는 횟수를 써라.
		a=0;
		while(a<10) { //0,2,4,6,8 5번
			System.out.println("A");
			a+=2;
		}
		for(int i=0; i<10; i+=2) {
			System.out.println("A");
		}
		
		a=10;
		while(a>0) { //10번
			System.out.println("A");
			a--;
		}
		for(int i=10; i>0; i--) {
			System.out.println("A");
		}
		
		a=1;
		while(a<=5) { //1,3,5 3번
			System.out.println("A");
			a+=2;
		}
		for(int i=1; i<=5; i+=2) {
			System.out.println("A");
		}
		
		a=0;
		while(a>5) { //0번!
			System.out.println("A");
			a++;
		}
		for(int i=0; i>5; i++) {
			System.out.println("A");
		}
		
		a=5;
		while(a>0) { //무한루프
			System.out.println("A");
			a++;
		}
		for(int i=5; i>0; i++) { //무한루프
			System.out.println("A");
		}
		
		a=0;
		while(a<3) { //3번
			a++;
			System.out.println(a); // 1, 2, 3
		}
		for(int i=1; i<=3; i++) {
			System.out.println(i);
		}
	}
}
