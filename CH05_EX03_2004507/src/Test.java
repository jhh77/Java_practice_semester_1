
public class Test {
	public static void main(String[] ar) {
		//기본자료형 vs 참조자료형
		
		int a=3;
		int b=a;
		a=5;
		System.out.println(a); //5
		System.out.println(b); //3
		
		int[] c={1,2,3};
		int[] d=c;
		d[0]=7; d[1]=8; d[2]=9;
		System.out.println(c[0]); //7
		System.out.println(c[1]); //8
		System.out.println(c[2]); //9
		System.out.println(d[0]); //7
		System.out.println(d[1]); //8
		System.out.println(d[2]); //9
	}
}
