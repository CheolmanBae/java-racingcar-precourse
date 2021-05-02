package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	@DisplayName("자동차 이름의 길이 1이상 5이하")
	void nameLengthValid5 () {
		assertTrue(Car.nameLegnthValid10("user"));
		assertFalse(Car.nameLegnthValid10("usercar"));
	}
	
	@Test
	@DisplayName("전진하기 테스트")
	void go() {
		Car user = new Car("user");
		assertTrue(user.race(4).equals(CarStatus.GO));
		assertTrue(user.race(9).equals(CarStatus.GO));
		assertFalse(user.race(0).equals(CarStatus.GO));
		assertFalse(user.race(3).equals(CarStatus.GO));
	}
	
	@Test
	@DisplayName("정지하기 테스트")
	void stop() {
		Car user = new Car("user");
		assertTrue(user.race(0).equals(CarStatus.STOP));
		assertTrue(user.race(3).equals(CarStatus.STOP));
		assertFalse(user.race(4).equals(CarStatus.STOP));
		assertFalse(user.race(9).equals(CarStatus.STOP));
	}
}
