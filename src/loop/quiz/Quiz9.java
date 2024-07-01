package loop.quiz;

public class Quiz9 {

	public static void main(String[] args) {

//		// 반복문 없이 작성
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		
//		// 반복문을 사용하여 작성
//		for (int i = 1; i <= 3; i++) {
//			System.out.println("*****");
//		}
//			
		// 중첩반복문을 사용하여 작성
		for (int i = 1; i <= 3; i++) { // 직사각형의 높이
			for (int j = 1; j <= 5; j++) { // 직사각형의 길이
				System.out.print("*");
			}
			System.out.println();
		
		}
	}

	}

