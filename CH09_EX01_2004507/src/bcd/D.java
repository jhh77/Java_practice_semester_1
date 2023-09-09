package bcd;

import abc.A;

public class D extends A { //다른 패키지이기 때문에 그냥 A만 쓸 수 없음.(그래서 임포트 함)
	void def() {
		//protected는 다른 패키지라도 자식 클래스는 사용 가능
		System.out.println(a);
		System.out.println(b);
		//System.out.println(c); //오류
		//System.out.println(d); //오류
		
	}
}
