import java.util.Arrays;

public class Test {
	public static void main(String[] ar) {
		//String 클래스의 객체 생성 2가지 방법
		//방법 1
		String a = new String("안녕");
		
		//방법 2
		String b = "안녕";
		
		//String 클래스의 두가지 특징
		//특징 1: 객체의 내용을 바꿀 수 없다.
		//일반적인 참조자료형의 특징
		int[] c = new int[] {1,2,3};
		int[] d = c;
		c[0] = 4; c[1] = 5; c[2] = 6;
		System.out.println(Arrays.toString(c)); //배열 원소 출력 [4, 5, 6]
		System.out.println(Arrays.toString(d)); //배열 원소 출력 [4, 5, 6]
		
		//String 클래스의 특징
		String e = new String("방가");
		String f = e;
		e = "땡큐";
		System.out.println(e); //땡큐
		System.out.println(f); //방가
		
		//특징 2: 리터럴로 생성된 객체는 문자열이 동일한 경우 객체를 공유한다.
		String aa = new String("Hello");
		String bb = new String("Hello");
		String cc = "Hello";
		String dd = "Hello";
		String ee = "hello"; //대문자, 소문자 잘 보기
		System.out.println(aa==bb); //false
		System.out.println(aa==cc); //false
		System.out.println(aa==dd); //false
		System.out.println(aa==ee); //false
		System.out.println(bb==cc); //false
		System.out.println(bb==dd); //false
		System.out.println(bb==ee); //false
		System.out.println(cc==dd); //true
		System.out.println(cc==ee); //false
		System.out.println(dd==ee); //false
		

		
	}
}
