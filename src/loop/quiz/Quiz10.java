package loop.quiz;

public class Quiz10 {

	public static void main(String[] args) {

		// 중첩반복문을 사용해서 삼각형을 그려보세요
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
			
		}

	}

}
