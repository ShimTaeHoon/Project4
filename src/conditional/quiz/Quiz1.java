package conditional.quiz;

public class Quiz1 {

	public static void main(String[] args) {

		// 조건문을 사용해서 변수의 값이 2의 배수거나 3의 배수라면
		// "2 또는 3의 배수입니다"를 출력하세요
		
		int a = 6;
		if(a % 2 == 0 || a % 3 == 0) {
			
			System.out.println("2또는 3의 배수입니다");
			
		}

	}

}
