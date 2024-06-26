package conditional;

public class Ex1 {

	public static void main(String[] args) {

		// 학생의 나이가 8살 이상이면 '학교에 다닙니다' 출력하기
		int age = 10; // age변수도 main함수 블럭{}이 종료되면 소멸됨
		if ( age >= 8 ) {
			System.out.println("학교에 다닙니다");
		}
		
		// 블록의 의미
		if ( age >= 8 ) {
			int temp = 0; //temp는 블록이 끝나기 전까지만 존재
						  //블록을 벗어나면 사라짐 ▼
						  //스코프 ( 변수를 감싸는 블럭 )
			System.out.println();
		}
		
		// System.out.println(temp); // 변수가 소멸되어 에러남
		
	}

}
