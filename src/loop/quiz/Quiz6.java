package loop.quiz;

public class Quiz6 {

	public static void main(String[] args) {
		
		// for문을 사용해 1부터 100까지 더하세요.
		// 단 중간에, 합이 500이 넘어가면 중단합니다.
		// for문이 종료되기 전 num과 sum의 값을 출력하세요 ***
		// * break를 사용할 것
		int num;
		int sum = 0;
		for(num = 1; num <= 100; num++) {
			sum = sum + num;
			System.out.println("num :" + num);
			System.out.println("sum :" + sum);
			if(sum >= 500) {
				break;
			}
			
		}
		
	}

}
