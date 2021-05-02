package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	@DisplayName("자동차 이름의 길이 1이상 5이하")
	void nameLengthValid5 () {
		assertTrue(Car.nameLegnthValid10("user1"));
		assertFalse(Car.nameLegnthValid10("usercar"));
	}
	
	@Test
	@DisplayName("전진하기 테스트")
	void go() {
		Car user = new Car("user1");
		assertTrue(user.race(3).equals(CarStatus.GO));
	}
}
