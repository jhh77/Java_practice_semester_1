
public class Test {
	public static void main(String[] args) {
		//do-while
		int a;
		
		a=0;
		while(a<3) { //3번
			System.out.println(a);
			a++;
		}
		
		a=0;
		do{ //3번
			System.out.println(a);
			a++;
		}
		while(a<3);
		
		
		
		a=0;
		while(a<1) { //1번
			System.out.println(a);
			a++;
		}
		
		a=0;
		do{ //1번
			System.out.println(a);
			a++;
		}
		while(a<1);
		
		
		
		a=0;
		while(a<0) { //0번
			System.out.println(a);
			a++;
		}
		
		a=0;
		do{ //1번
			System.out.println(a);
			a++;
		}
		while(a<0);
	}
}
