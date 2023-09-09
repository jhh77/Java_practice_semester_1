
public class Test {
	public static void main(String[] ar) {
		//String 메서드
		String a = "abc abc bcd cde"; //0~14 인덱스
		
		//length() : 길이
		System.out.println(a.length()); //15
		
		//charAt() : 인덱스 번호에 해당하는 문자가 무엇인지
		System.out.println(a.charAt(2)); //c
		
		//indexOf(), lastIndexOf() : 문자 찾기(앞,뒤에서부터) / 시작 위치 지정 가능
		System.out.println(a.indexOf("bc")); //1
		System.out.println(a.lastIndexOf("bc")); //8
		System.out.println(a.indexOf("bc", 3)); //5
		System.out.println(a.lastIndexOf("bc", 7)); //5 방향 잘 보기
		
		//String.valueOf() : static(정적) 메서드
		System.out.println(String.valueOf(2.3)+3.1); //2.33.1
		
		//concat() : 문자열 연결 
		System.out.println("방가".concat("땡큐")); //방가땡큐
		
		
	}
}
