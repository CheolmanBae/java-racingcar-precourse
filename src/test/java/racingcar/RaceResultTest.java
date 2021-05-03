package racingcar;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RaceResultTest {

	@Test
	@DisplayName("가장 멀리간 차량의 거리")
	void winnerSearch() {
		Cars users = new Cars(Arrays.asList(new Car("user1"), new Car("user2"), new Car("user3")));
		users.racing(Arrays.asList(5,3,3));
		users.racing(Arrays.asList(5,3,3));
		RaceResult result = new RaceResult();
		assertTrue(result.winnerPoint(users) == 2) ;
	}
}
