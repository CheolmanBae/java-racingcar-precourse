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
	
}
