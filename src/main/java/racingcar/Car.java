package racingcar;

public class Car {

	String name;
	CarValid state;
	
	public static final int MIN_LENGTH = 1;
	public static final int MAX_LENGTH = 5;
	
	public static final int GO_STOP_MIDDLE_VALUE = 4;
	
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
		this.state = new CarValid(no);
		if(no >= GO_STOP_MIDDLE_VALUE) {
			return CarStatus.GO;
		}
		return CarStatus.STOP;
	}

}
