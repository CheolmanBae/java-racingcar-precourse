package racingcar;

public class CarValid {
	public static final int MIN_NO = 0;
	public static final int MAX_NO = 9;
	
	CarValid(int no){
		if(no < MIN_NO || no > MAX_NO) {
			throw new IllegalArgumentException("0이상 9이하의 숫자를 입력하세요.");
		}
	}
}
