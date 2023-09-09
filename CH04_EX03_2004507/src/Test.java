
public class Test {
	public static void main(String[] ar) {
		//switch <-> if
		int a=8;
		if(a>=9) {
			System.out.println("A");
		}
		else if(a==8) {
			System.out.println("B");
		}
		else if(a==7) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
		//#미션 1. 위의 코드를 switch로 바꾸어라.
		switch(a) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		default:
			System.out.println("D");
				
		}
		
		
		switch(a) {
		case 10:
			System.out.println("A");
			break;
		case 9:
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C"); //break이 없음
		case 6:
			System.out.println("D");
			break;
		}
		//#미션2. 위의 코드를 if로 바꾸어라
		if(a==10) {
			System.out.println("A");
		}
		else if((a==9) || (a==8)) {
			System.out.println("B");
		}
		else if(a==7) {
			System.out.println("C");
			System.out.println("D");
		}
		else if(a==6){ //else로 쓰면 안됨. 결과가 달라짐
			System.out.println("D");
		}
		
		
		
		a=85;
		if(a>=90) {
			System.out.println("A학점");
		}
		else if(a>=80) {
			System.out.println("B학점");
		}
		else if(a>=70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
		//#미션 3. 위의 코드를 switch로 바꾸어라
		//(단 case는 5개 이내로 사용할 것)
		switch(a/10) {
		case 10:
		case 9:
			System.out.println("A힉점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		default:
			System.out.println("F학점");
		}
		
	}
}
