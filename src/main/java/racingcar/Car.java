package racingcar;

public class Car {

	String name;
	int point = 0;
	
	public static final int MIN_LENGTH = 1;
	public static final int MAX_LENGTH = 5;
	public static final int GO_STOP_MIDDLE_VALUE = 4;
	
	public Car(String name) {
		if(nameLegnthValid5(name)){
			this.name = name;
		}
		if(!nameLegnthValid5(name)) {
			throw new IllegalArgumentException("1이상 5이하의 이름을 입력하세요.");
		}
	}

	public static boolean nameLegnthValid5(String carname) {
		if(carname.length() >= MIN_LENGTH && carname.length() <= MAX_LENGTH ) {
			return true;
		}
		return false; 
	}
	
	public CarStatus goStop(CarValid Valid) {
		if(Valid.getNo() >= GO_STOP_MIDDLE_VALUE) {
			go();
			return CarStatus.GO;
		}
		return CarStatus.STOP;
	}
	public void go() {
		this.point++;
	}

	public int getPoint() {
		return this.point;
	}
	
	public String getName() {
		return this.name;
	}

	public void setPoint(int point) {
		this.point = point;
		
	}
	
}
