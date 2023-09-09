
public class Test {
	public static void main(String[] ar) {
		//for 반복제어문
		int a;
		for(a=0; a<10; a++) {
			System.out.println(a);
		}
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		// 다음  for문에서 A가 몇 번 찍히는지 말하라.
		for(int i=0; i<10; i++) { //10번
			System.out.println("A");
		}
		for(int i=10; i>0; i--) { //10번
			System.out.println("A");
		}
		for(int i=1; i<=5; i++) { //5번
			System.out.println("A");
		}
		for(int i=0; i<10; i+=2) { //0,2,4,6,8 5번
			System.out.println("A");
		}
		for(int i=0; i<10; i+=3) { //0,3,6,9 4번
			System.out.println("A");
		}
		for(int i=0; i>10; i++) { //0번
			System.out.println("A");
		}
		for(int i=5; i>0; i++) { //무한번(무한루프)
			System.out.println("A");
		}//컴파일러는 얘가 무한루프인지 모름
		
		//명시적 무한루프
//		for(int i=0; ;i++) { //무한번
//			System.out.println("A");
//		}
		//위에가 무한루프인 것을 알기 때문에 밑에 코드가 오류가 난다. 
		//절대 실행될 수 없는 코드이기 때문에
		for(;;) { //무한번 (무한루프)
			System.out.println("A");
		}
	}
}
