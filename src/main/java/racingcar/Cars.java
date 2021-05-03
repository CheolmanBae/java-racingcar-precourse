package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private final List<Car> cars;
	
	public Cars(List<Car> answers) {
		this.cars = mapCar(answers);
	}
	
	private List<Car> mapCar(List<Car> answers) {
		List<Car> cars = new ArrayList<>();
		for(int i = 0; i < answers.size(); i++) {
			cars.add(answers.get(i));
		}
		return cars;
	}
	
	public int length() {
		return cars.size();
	}

	public Car getCar(int index) {
		return this.cars.get(index);
	}
	
	public void racing(List<Integer> round) {
		for(int i = 0; i < round.size(); i++) {
			this.cars.get(i).goStop(new CarValid(round.get(i)));
		}
		name_print(this.cars);
	}

	void name_print(List<Car> cars) {
		for(int i = 0; i < cars.size(); i++) {
			System.out.printf(cars.get(i).getName() + " : ");
			score_print(cars.get(i));
		}
		System.out.printf("\n");
	}
	
	void score_print(Car car) {
		for(int i = 0; i < car.getPoint(); i++) {
			System.out.printf("-");
		}
		System.out.printf("\n");
	}

}
