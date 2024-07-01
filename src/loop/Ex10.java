package loop;

public class Ex10 {

	public static void main(String[] args) {

		// 중첩반복문(이중 for문)을 사용하여 구구단 만들기
		for (int dan = 2; dan <= 9; dan++) { // 2~9단
			
			for (int times = 1 ; times <= 9; times++) {
				
				System.out.println(dan + "X" + times + "=" + dan * times);
				
			}
			
			System.out.println(); // for문 두번째 종료 후 줄바꿈하기위해
			
		}

	}

}
