package bcd;

import abc.A; //ctrl + shift + O(알파벳): 자동 임포트

public class C {
	void cde() {
		//#객체 생성
		A a = new A(); 
		
		//멤버 사용
		//다른 패키지의 일반클래스에서는 public 멤버만 사용 가능
		System.out.println(a.a);
		//System.out.println(a.b); //오류
		//System.out.println(a.c); //오류
		//System.out.println(a.d); //오류
	}
}
