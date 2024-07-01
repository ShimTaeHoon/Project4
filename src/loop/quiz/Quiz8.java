package loop.quiz;

public class Quiz8 {

	public static void main(String[] args) {
		
		// 구구단에서 짝수는 생략하고 홀수단만 출력하세요
//		for(int dan = 3; dan <= 9; dan = dan + 2) {
//			for(int time = 1; time <= 9; time++) {
//				System.out.println(dan + "X" + time + "=" + dan * time);
//			}
//		}
//	}
//}
		
		for(int dan = 2; dan <= 9; dan++) {
				for(int time = 1; time <= 9; time++) {
					if(dan % 2 == 0) {
						break;
					}
					System.out.println(dan + "X" + time + "=" + dan * time);
				}
				System.out.println();
			}
		}

	}

