
public class Test {
	public static void main(String[] ar) {
		//2차원 배열의 원소 출력
//		1 2
//		3
//		4 5 6
		
		int[][] a = {{1,2}, {3}, {4,5,6}};
		
		//일반 for문을 이용하여 원소출력
		for(int i=0; i < a.length; i++) { //3바퀴
			for(int j=0; j < a[i].length; j++) { //2바퀴 1바퀴 3바퀴
				System.out.println(a[i][j]);
			}
		}
		
		//for-each문을 이용하여 원소출력
		for(int[] m : a) {
			for(int k : m) {
				System.out.println(k);
			}
		}
		
	}
}
