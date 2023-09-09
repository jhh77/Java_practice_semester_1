
public class Test {
	public static void main(String[] ar) {
		//break  제어키워드
		//다음 각 코드에서의 출력 횟수를 써라
		for(int i=0; i<10; i++) { //6번
			if(i>5) {
				break;
			}
			System.out.println(i);
		}
		
		
		for(int i=0; i<10; i++) { //8번
			System.out.println(i);
			if(i==7) {
				break;
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) { //10번
				if(j==2) {
					break;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //16번
			for(int j=0; j<4; j++) {
				if(i==2) {
					break;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //8번
			for(int j=0; j<4; j++) {
				if(i==3 || j==2) {
					break;
				}
				System.out.println("A");
			}
		}
		
		//이중 for문 탈출
		//방법1
		for(int i=0; i<5; i++) { //2번
			for(int j=0; j<4; j++) {
				if(j==2) {
					i=10;
					break;
				}
				System.out.println("A");
			}
		}
		
		//방법2
		abc: for(int i=0; i<5; i++) { //2번
			for(int j=0; j<4; j++) {
				if(j==2) {
					break abc;
				}
				System.out.println("A");
			}
		}
		
		
	}
}
