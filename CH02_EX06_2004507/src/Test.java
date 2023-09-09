
public class Test {
	public static void main(String[] ar) {
		//캐스팅
		System.out.println(3 + 2); //5
		System.out.println(3 - 2); //1
		System.out.println(3 * 2); //6
		System.out.println(3 / 2); //1
		System.out.println((double)3 / (double)2); //1.5
		System.out.println((double)3 / 2); //1.5
		System.out.println(3 / (double)2); //1.5
		System.out.println(3 / 2.0); //1.5 실제 필드에서 가장 많이 씀.
		System.out.println((double)(3 / 2)); //1.0
		System.out.println((int)3.4 + 2.9); //5.9
		System.out.println((int)(3.4 + 2.9)); //6
		System.out.println((double)((int)2.4 + (int)3.8)); //5.0
		
	}
}
