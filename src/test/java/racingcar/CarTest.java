package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	@DisplayName("자동차 이름의 길이 1이상 5이하")
	void nameLengthValid5 () {
		assertTrue(Car.nameLegnthValid5("user"));
		assertFalse(Car.nameLegnthValid5("usercar"));
	}
	
	@Test
	@DisplayName("전진하기 테스트")
	void go() {
		Car user = new Car("user1");
		assertTrue(user.goStop(new CarValid(4)).equals(CarStatus.GO));
		assertTrue(user.goStop(new CarValid(9)).equals(CarStatus.GO));
		assertFalse(user.goStop(new CarValid(0)).equals(CarStatus.GO));
		assertFalse(user.goStop(new CarValid(3)).equals(CarStatus.GO));
	}
	
	@Test
	@DisplayName("정지하기 테스트")
	void stop() {
		Car users = new Car("user1");
		assertTrue(users.goStop(new CarValid(0)).equals(CarStatus.STOP));
		assertTrue(users.goStop(new CarValid(3)).equals(CarStatus.STOP));
		assertFalse(users.goStop(new CarValid(4)).equals(CarStatus.STOP));
		assertFalse(users.goStop(new CarValid(9)).equals(CarStatus.STOP));
	}
	
}
