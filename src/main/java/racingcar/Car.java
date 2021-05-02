package racingcar;

public class Car {

	String name;
	
	public static final int MIN_LENGTH = 1;
	public static final int MAX_LENGTH = 5;
	
	public Car(String name) {
		this.name = name;
	}

	public static boolean nameLegnthValid10(String carname) {
		if(carname.length() >= MIN_LENGTH && carname.length() <= MAX_LENGTH ) {
			return true;
		}
		return false;
		
	}

	public Object race(int no) {
		// TODO Auto-generated method stub
		return CarStatus.GO;
	}

}
