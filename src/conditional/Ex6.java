package conditional;

public class Ex6 {

	public static void main(String[] args) {

		String rank = "1"; 
		// 변수와 값이 일치하는 case문을 실행한다
		switch (rank) {
		case "1":
			System.out.println("메달의 색은 금입니다");
			break;
		case "2":
			System.out.println("메달의 색은 은입니다");
			break;
		case "3": // rank == "3"
			System.out.println("메달의 색은 동입니다");
			break;
		default:
			System.out.println("메달이 없습니다");
			break;

		}
		
		// switch문은 실수타입을 사용할 수 없음!
		// float, double은 사용할 수 없음

		// float r = 1.1f;
		
		// switch (r) { //에러남
		// case 1.5f:
		// break;
		}
		
}