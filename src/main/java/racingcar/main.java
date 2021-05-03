package racingcar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.printf("경주할 자동차의 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] st = br.readLine().split(",");
		List<Car> user = new ArrayList<>();
		int count = 0;
		List<Integer> round;
		
		for(int i = 0; i < st.length; i++) {
			user.add(new Car(st[i]));
		}
		
		Cars users = new Cars(user);
		
		System.out.printf("시도할 회수는 몇회인가요?\n");
		
		Scanner in = new Scanner(System.in);
		count = in.nextInt();
		
		System.out.printf("실행결과\n");
		
		for(int i = 0; i < count; i++) {
			round = random(user.size());
			users.racing(round);
		}
		
		RaceResult result = new RaceResult();
		result.winner(users);
		
		for(int i = 0; i < result.getRacer().size(); i++) {
			System.out.print(result.getRacer().get(i).getName());
			if(i != result.getRacer().size()-1) {
				System.out.print(", ");
			}
		}
		System.out.printf("가 최종 우승했습니다.\n");
		
		return;
		
	}
	
	public static List<Integer> random(int size) {
		List<Integer> round = new ArrayList<Integer>();
		for(int i = 0; i < size; i++) {
			round.add((int)(Math.random() * 10));
		}
		return round;
	}

}
