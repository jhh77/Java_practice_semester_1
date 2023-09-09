
public class Test {
	public static void main(String[] ar) {
		//continue  제어키워드
		//다음 각 코드에서의 출력 횟수를 써라
		for(int i=0; i<10; i++) { //6번
			if(i>5) {
				continue;
			}
			System.out.println(i);
		}
		
		
		for(int i=0; i<10; i++) { //9번 -> 10번
			System.out.println(i); //출력위치 잘 보기
			if(i==7) {
				continue;
			}
		}
		
		for(int i=0; i<5; i++) { //15번
			for(int j=0; j<4; j++) { 
				if(j==2) {
					continue;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //16번
			for(int j=0; j<4; j++) {
				if(i==2) {
					continue;
				}
				System.out.println("A");
			}
		}
		
		for(int i=0; i<5; i++) { //12번
			for(int j=0; j<4; j++) {
				if(i==3 || j==2) {
					continue;
				}
				System.out.println("A");
			}
		}
		

		//방법1
		for(int i=0; i<5; i++) { //3번
			for(int j=0; j<4; j++) {
				if(j==2) {
					i=10;
					continue;
				}
				System.out.println("A");
			}
		}
		
		//방법2
		abc: for(int i=0; i<5; i++) { //10번
			for(int j=0; j<4; j++) {
				if(j==2) {
					continue abc;
				}
				System.out.println("A");
			}
		}
		
		//시험
		for(int i=0; i<10; i++) {
			if(i%2==1) {//홀수면 올려라
				continue;
			}
			System.out.println(i); //0,2,4,6,8
		}
		
		//시험
		for(int i=0; ; i++) { //0,2,4,6,8 나오게 만들어라
			if(i%2==1) {
				continue;
			}
			if(i>8) {
				break;
			}
			System.out.println(i); //0,2,4,6,8
		}
	}
}
