package kata;

import org.junit.jupiter.api.Test;

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

    @Test
    void should_turn_left_to_west_given_direction_is_north() {
        MarsRover rover = new MarsRover(2, 3, "N");
        rover.executeCommands("L");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo("W");
    }

    @Test
    void should_turn_left_to_north_given_direction_is_east() {
        MarsRover rover = new MarsRover(2, 3, "E");
        rover.executeCommands("L");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo("N");
    }

    @Test
    void should_turn_left_to_east_given_direction_is_south() {
        MarsRover rover = new MarsRover(2, 3, "S");
        rover.executeCommands("L");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo("E");
    }

    @Test
    void should_turn_left_to_south_given_direction_is_west() {
        MarsRover rover = new MarsRover(2, 3, "W");
        rover.executeCommands("L");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo("S");
    }

    @Test
    void should_turn_right_to_south_given_direction_is_east() {
        MarsRover rover = new MarsRover(2, 3, "E");
        rover.executeCommands("R");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo("S");
    }

    @Test
    void should_turn_right_to_east_given_direction_is_south() {
        MarsRover rover = new MarsRover(2, 3, "S");
        rover.executeCommands("R");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo("W");
    }

    @Test
    void should_turn_right_to_north_given_direction_is_west() {
        MarsRover rover = new MarsRover(2, 3, "W");
        rover.executeCommands("R");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo("N");
    }

    @Test
    void should_turn_right_to_east_given_direction_is_north() {
        MarsRover rover = new MarsRover(2, 3, "N");
        rover.executeCommands("R");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo("E");
    }


}
