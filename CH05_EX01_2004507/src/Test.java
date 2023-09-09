
public class Test {
	public static void main(String[] ar) {
		//1차원 배열
		
		//배열의 선언
		int[] a1;
		int a2[];
		
		//배열의 선언과 객체 대입 (힙메모리에 강제초기화 값 확인)
		int[] a = new int[3];
		double[] b = new double[3];
		String[] c = new String[3];
		boolean[] d = new boolean[3];
		
		System.out.println(a[0]); //0
		System.out.println(b[0]); //0.0(헷갈리지 않기)
		System.out.println(c[0]); //null
		System.out.println(d[0]); //false
	}
}
