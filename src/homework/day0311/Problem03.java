package homework.day0311;

class Snail {
	
	int position = 0;
	int time= 0;
	
	void up() {
		position += 5;
		time++;
	}
	
	void down() {
		if(position < 50)
			position -= 1;
		else
			position -= 2;
		System.out.printf("[%d시간후] 달팽이의 높이 : %dM\n", time, position);
	}
}


public class Problem03 {
	public static void main(String[] args) {
		
		// 클래스를 이용한 풀이
		Snail sn = new Snail();
		
		while(sn.position < 100) {
			sn.up();
			sn.down();			
		}
		
		
		/*
		 	일반 풀이
		int time = 0;
		int height = 0;
		
		while(true) {
			time++;
			height += 5;
			
			// 달팽이가 100M를 넘는 즉시 출력하고 반복문 종료
			if(height >= 100) {
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM", time, height);
				break;
			}
			
			// 달팽이가 아직 100M를 넘지 않은 경우
			if(height < 50) {
				height -= 1;
			} else {
				height -= 2;
			}
			
			System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", time, height);
		}
			*/
		
			
			/* 교수님 코드
				int height = 0, time = 0;
			
				while( (height += 5) < 100) {
					height += height < 50 ? -1 : -2;
					System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", ++time, height);
				}
				System.out.printf("[%d시간후] 달팽이가 올라간 총 높이 : %dM\n", ++time, height);
			*/
		
	}
}

