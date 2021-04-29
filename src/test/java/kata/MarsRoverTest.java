package kata;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Java6Assertions.assertThat;

class MarsRoverTest {

    @ParameterizedTest
    @CsvSource({
            "2,3,N,2,4",
            "2,3,E,3,3",
            "2,3,S,2,2",
            "2,3,W,1,3",
    })
    void should_move_forward_success(int rawX, int rawY, String direction, int expectedX, int expectedY) {
        moveTo(rawX, rawY, direction, expectedX, expectedY, "F");
    }

    @ParameterizedTest
    @CsvSource({
            "2,3,N,2,2",
            "2,3,E,1,3",
            "2,3,S,2,4",
            "2,3,W,3,3",
    })
    void should_move_back_success(int rawX, int rawY, String direction, int expectedX, int expectedY) {
        moveTo(rawX, rawY, direction, expectedX, expectedY, "B");
    }

    private void moveTo(int rawX, int rawY, String direction, int expectedX, int expectedY, String command) {
        MarsRover rover = new MarsRover(rawX, rawY, direction);
        rover.executeCommands(command);
        assertThat(rover.getX()).isEqualTo(expectedX);
        assertThat(rover.getY()).isEqualTo(expectedY);
    }

    @ParameterizedTest
    @CsvSource({
            "N,W",
            "E,N",
            "S,E",
            "W,S",
    })
    void should_turn_left_success(String currentDirection, String expectedDirection) {
        turnTo("L", currentDirection, expectedDirection);
    }

    @ParameterizedTest
    @CsvSource({
            "E,S",
            "S,W",
            "W,N",
            "N,E",
    })
    void should_turn_right_success(String currentDirection, String expectedDirection) {
        turnTo("R", currentDirection, expectedDirection);
    }

    private void turnTo(String command, String currentDirection, String expectedDirection) {
        MarsRover rover = new MarsRover(2, 3, currentDirection);
        rover.executeCommands(command);
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo(expectedDirection);
    }

}
