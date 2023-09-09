
public class Test {
	public static void main(String[] ar) {
		//a ---> [1.1, 2.2]
		
		//float으로 배열 만들면 캐스팅 해줘야함.
		//방법 1
		//double[] a = new double[2]; //여기까지만 하면 0.0이 들어감
		double[] a;
		a = new double[2];
		a[0] = 1.1;
		a[1] = 2.2;
		
		//방법 2
		//double[] b = new double[] {1.1, 2.2};
		double[] b;
		b = new double[] {1.1, 2.2};
		
		//방법 3 - 선언과 객체 대입 분리 불가
		double[] c = {1.1, 2.2}; //코드 분리할 수 없음.
	}
}
