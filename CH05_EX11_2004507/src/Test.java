import java.util.Arrays;

public class Test {
	public static void main(String[] ar) {
		//String 메서드 2
		String a = "안녕, 방가, 땡큐, 감사";
		
		//replace : 문자열 교체
		System.out.println(a.replace("방가", "Hello")); //a 자체가 바뀜
		
		//split() : 구분자로 문자열 쪼개기
		String[] b = a.split(",");
		System.out.println(Arrays.toString(b));
		
		//substring()
		System.out.println(a.substring(4, 6)); //방가 
		
		//equals(), equalsIgnoreCase()
		String c = "Java";
		String d = "Java";
		String e = "java";
		System.out.println(c==d); //true
		System.out.println(c==e); //false
		System.out.println(d==e); //false
		System.out.println(c.equals(d)); //true
		System.out.println(c.equals(e)); //false
		System.out.println(c.equalsIgnoreCase(e)); //true
		
		
		//미션 1: 다음의 파일이름에서 확장명을 제외하고 파일이름만 출력하라. (단 파일이름의 길이는 변할 수 있다.)
		String aa = "abcde.jpg";
		System.out.println(aa.substring(0, aa.lastIndexOf(".")));
		
		//미션 2: 다음 문자열에서 이름과 나이만을 출력해라 (단, 이름 한줄, 나이 한줄의 코드로 출력)
		String bb = "영화 [홍길동]에서 주인공의 나이는 [16]살이다";
		System.out.println(bb.substring(bb.indexOf("[")+1, bb.indexOf("]")));
		System.out.println(bb.substring(bb.lastIndexOf("[")+1, bb.lastIndexOf("]")));
		
		
		//미션 3: 다음 문자열에서 사용금액만 출력해라 (한줄의 코드로 출력)
		String cc = "신한카드 결제금액 200원입니다.";
		System.out.println(cc.substring(cc.lastIndexOf(" ")+1, cc.lastIndexOf("원")+1));
				
		
	}
}
