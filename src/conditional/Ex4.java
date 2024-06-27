package conditional;

public class Ex4 {

	public static void main(String[] args) {

		int rank = 3;

		// 변수와 값이 일치하는 case문을 실행한다
		switch (rank) {
		case 1:
			System.out.println("메달의 색은 금입니다");
			break;
		case 2:
			System.out.println("메달의 색은 은입니다");
			break;
		case 3: // rank == 3 < 조건식과 같은 의미
			System.out.println("메달의 색은 동입니다");
			break;
		default: // 변수와 일치하는 값이 없으면
			System.out.println("메달이 없습니다");

		}

	}

}
