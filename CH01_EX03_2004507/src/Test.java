
public class Test {
	public static void main(String[] ar) {
		//println()
		System.out.println("화면출력"); //화면출력
		System.out.println("화면" + "출력"); //화면출력
		System.out.println(3.8); //3.8
		System.out.println(3+5); //8
		System.out.println("화면" + 3); //화면3
		System.out.println("화면" + 3 + 5); //화면35
		System.out.println(3 + 5 + "화면"); //8화면
		
		//print()
		System.out.print("화면출력"); //화면출력
		System.out.print("화면" + "출력"); //화면출력
		System.out.print(3.8); //3.8
		System.out.print(3+5); //8
		System.out.print("화면" + 3); //화면3
		System.out.print("화면" + 3 + 5); //화면35
		System.out.print(3 + 5 + "화면"); //8화면
		
		//한줄 엔터
		System.out.print("\n"); //줄바꿈(enter)
		System.out.println(); //enter
		
		//printf()
		System.out.printf("제이름은 김동형입니다, 나이는 100살, 몸무게 10.2\n");
		System.out.printf("제이름은 홍길동입니다, 나이는 200살, 몸무게 20.4\n");
		System.out.printf("제이름은 %s입니다, 나이는 %d살, 몸무게 %f\n", "김동형", 100, 10.2);
		System.out.printf("제이름은 %s입니다, 나이는 %d살, 몸무게 %f\n", "홍길동", 200, 20.4);
		
		
	}
}
