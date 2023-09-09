import java.util.Arrays;

//기본자료형 + 참조자료형 매개변수 전달

public class Test {
	public static void main(String[] ar) {
		//기본자료형 매개변수 전달(원본값 불변)
		int a=3;
		abc(a); //abc 메서드가 static 메서드가 아니면 오류. static 메서드는 static 메서드만 호출 가능
		System.out.println(a); //3 -> 이런거 시험문제로
		
		//참조자료형 매개변수 전달 (원본값 변경)
		int[] b = {1,2,3};
		bcd(b);
		System.out.println(Arrays.toString(b)); //[4, 5, 6] ->시험
		
	}
	public static void abc(int a) { //호출되면 int a; a(abc()의) = a(main의)
		a=a*2;
	}
	public static void bcd(int[] b) { //호출되면 int b[]; b(bcd()의) = b(main의)
		b[0]=4;
		b[1]=5;
		b[2]=6;
		
	}
}
