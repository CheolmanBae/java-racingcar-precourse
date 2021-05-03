package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarsTest {
	
	@Test
	@DisplayName("차량 대수")
	void length() {
		Cars users = new Cars(Arrays.asList(new Car("user1"), new Car("user2"), new Car("user3")));
		assertTrue(users.length() == 3);
	}
	
}
