package conditional.quiz;

public class Quiz7 {

	public static void main(String[] args) {
		
		// char타입 변수를 선언하고 문자 b,c,d 중에서 하나를 입력하세요.
		// 문자에 해당하는 동물을 출력하세요.
		
		char test = 'd';
		switch(test) {
		case 'b': // animal == 'b'
			System.out.println("새");
			break;
		case 'c': // animal == 'c'
			System.out.println("고양이");
			break;
		case 'd': // animal == 'd'
			System.out.println("강아지");
			break;
		default:
			System.out.println("사람");
		}		
		
		
		//정수
		int sum = 1;
		
		switch(sum){
		case 1:
			System.out.println("test1");
			break;
		case 2:
			System.out.println("test2");
		default:
			System.out.println("땡");
		}

	}

}
