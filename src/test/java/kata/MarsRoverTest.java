package kata;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MarsRoverTest {
    @Test
    public void should_move_forward_to_x_is_2_and_y_is_4_when_direction_is_north_given_commands_is_f() {
        MarsRover rover = new MarsRover(2, 3, "N");
        rover.executeCommands("F");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(4);
    }

    @Test
    public void should_move_forward_to_x_is_3_and_y_is_3_when_direction_is_east_given_commands_is_f() {
        MarsRover rover = new MarsRover(2, 3, "E");
        rover.executeCommands("F");
        assertThat(rover.getX()).isEqualTo(3);
        assertThat(rover.getY()).isEqualTo(3);
    }

    @Test
    public void should_move_forward_to_x_is_2_and_y_is_5_given_commands_is_ff() {
        MarsRover rover = new MarsRover(2, 3, "N");
        rover.executeCommands("FF");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(5);
    }

    @Test
    public void should_move_back_to_x_is_2_and_y_is_2_given_commands_is_b() {
        MarsRover rover = new MarsRover(2, 3, "N");
        rover.executeCommands("B");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(2);
    }

    @Test
    public void should_move_back_x_2_and_y_1_given_commands_is_bb() {
        MarsRover rover = new MarsRover(2, 3, "N");
        rover.executeCommands("BB");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(1);
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
