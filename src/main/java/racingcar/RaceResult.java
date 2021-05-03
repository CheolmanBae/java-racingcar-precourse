package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RaceResult {
	public List<Car> result;

	public RaceResult(){
		this.result = new ArrayList<>();
	}
	

	
	public void winner(Cars users) {
		int point = winnerPoint(users);
		List<Car> result = new ArrayList<>();
		for(int i = 0; i < users.length(); i++) {
			if(users.getCar(i).getPoint() == point) {
				result.add(users.getCar(i));
			}
		}
		this.result = result;
	}
	
	public int winnerPoint(Cars users) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < users.length(); i++) {
			if(max < users.getCar(i).getPoint()) {
				max = users.getCar(i).getPoint();
			}
		}
		return max;
	}
	
	public List<Car> getRacer() {
		return this.result;
	}
}
