
public class Test {
	public static void main(String[] ar) {
		//업캐스팅(upcasting): 생략해도 컴파일러가 대신 수행
		long a = 3; //int -> long
		float b = 5; //int -> float
		double c = 2.3F; //float -> double
		//double과 float 사이의 오차가 발생할 수 있음.
		
		//다운캐스팅(downcasting): 직접 캐스팅을 수행하여야 함.
		int d = (int)2.9; //double -> int
		float e = (float)3.2; //double -> float
		short f = 6; //int -> short 다운캐스팅 예외(단, 값의 범위 내에 있을 때)
		byte g = (byte)129; //int -> byte
		
		System.out.println(a); //3
		System.out.println(b); //5.0
		System.out.println(c); //2.3
		System.out.println(d); //2
		System.out.println(e); //3.2
		System.out.println(f); //6
		System.out.println(g); //-127
	}
}
