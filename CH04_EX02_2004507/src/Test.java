
public class Test {
	public static void main(String[] ar) {
		//switch
		int a = 2;
		switch(a) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		default:
			System.out.println("D");
		}
		
		char b = 'B';
		switch(b) {
		case 'A':
			System.out.println("A");
		case 'B':
			System.out.println("B");
		case 'C':
			System.out.println("C");
		default:
			System.out.println("D");
		}
		
		String c = "베리";
		switch(c) {
		case "땡큐":
			System.out.println("A");
		case "베리":
			System.out.println("B");
		case "감사":
			System.out.println("C");
		default:
			System.out.println("D");
		}
	}
}
