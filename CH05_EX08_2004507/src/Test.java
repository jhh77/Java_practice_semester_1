
public class Test {
	public static void main(String[] ar) { //args는 변수 이름으로 뭐가 되어도 됨
		
		System.out.println(ar.length); //0 배열의 길이가 0인 것
		System.out.println(ar[0]); //안녕
		System.out.println(ar[1]); //abc
		System.out.println(ar[2]); //2
		System.out.println(ar[3]); //2.4
		
		System.out.println(ar[0]+1); //안녕1
		System.out.println(ar[1]+1); //abc1
		System.out.println(ar[2]+1); //21
		System.out.println(ar[3]+1); //2.41
		//문자열이니까 문자열이 이어서 출력됨
		
		//String --> 기본자료형 바꾸기 (wrapper class 이용)
		// Boolean, Byte, Short, Integer, Long, Float, Double, Character - 대문자로 시작
		
		System.out.println(Integer.parseInt(ar[2])+1); //3 출력 ar[2]의 값을 정수로 바꾸어라
		System.out.println(Double.parseDouble(ar[3])+1); //3.4
		
		System.out.println(String.valueOf(3) + 1); //31
		System.out.println(3+""); //필드에서 제일 많이 쓰는 방법. 문자열로 바꾸는 방법
		
		//int[] a = new int[0];
		//System.out.println(a.length); //int[] a;만 하고 출력하면 이건 오류. a라는 객체를 만들지 않음(new int)
		
	}
}
