package conditional.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// 학생의 점수를 저장할 변수를 선언하고 0~99 사이의 값을 저장하세요.
		int j = 75;
		// 점수가 90~99 이면 "수"
		if(j >= 90 && j <= 99) {
			System.out.println("수");
		// 점수가 80~89 이면 "우"
		}else if(j >= 80){
			System.out.println("우");
		// 점수가 70~79 이면 "미"
		}else if(j >= 70) {
			System.out.println("미");
		// 그외는 "양"을 출력하세요.
		}else {
			System.out.println("양");
		}

	}

}
