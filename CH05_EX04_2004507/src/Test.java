
public class Test {
	public static void main(String[] ar) {
		//배열 값의 출력
		
		int[] a= new int[] {2,4,6,8,10};
		System.out.println(a.length); //5
		
		//배열 값의 출력 (일반 for문)
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]); //2,4,6,8,10
		}
		
		//배열 값의 출력 (for-each문)
		for(int m:a) {
			System.out.println(m);
		}
	}
}
