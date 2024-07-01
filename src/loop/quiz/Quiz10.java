package loop.quiz;

public class Quiz10 {

	public static void main(String[] args) {

		// 중첩반복문을 사용해서 삼각형을 그려보세요
		for(int star = 1; star <= 5; star++) {
			for(int star2 = 1; star2 <= star; star2++) {
				System.out.print("*");
			}
				System.out.println();
		}
	
	}

}
