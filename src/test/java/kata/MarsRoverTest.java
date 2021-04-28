package kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Java6Assertions.assertThat;

class MarsRoverTest {
    @Test
    void should_move_forward_success_when_direction_is_north() {
        MarsRover rover = new MarsRover(2, 3, "N");
        rover.executeCommands("F");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(4);
    }

    @Test
    void should_move_forward_success_when_direction_is_east() {
        MarsRover rover = new MarsRover(2, 3, "E");
        rover.executeCommands("F");
        assertThat(rover.getX()).isEqualTo(3);
        assertThat(rover.getY()).isEqualTo(3);
    }

    @Test
    void should_move_back_success_when_direction_is_north() {
        MarsRover rover = new MarsRover(2, 3, "N");
        rover.executeCommands("B");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(2);
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
