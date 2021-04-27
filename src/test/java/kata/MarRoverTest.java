package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class MarRoverTest {
    @Test
    public void should_move_farword_when_command_is_f()
    {

        MarsRover rover  = new MarsRover(2, 3, 'N');
        rover.receiveSingleCommand('F');
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(4);
    }

    @Test
    public void should_move_farword_when_command_is_ff()
    {

        MarsRover rover  = new MarsRover(2, 3, 'N');
        rover.receiveCommands("FF");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(5);
    }

    @Test
    public void should_move_farword_when_command_is_b()
    {

        MarsRover rover  = new MarsRover(2, 3, 'N');
        rover.receiveSingleCommand('B');
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(2);
    }

    @Test
    public void should_move_farword_when_command_is_bb()
    {

        MarsRover rover  = new MarsRover(2, 3, 'N');
        rover.receiveCommands("BB");
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(1);
    }

    @Test
    void should_turn_left_to_west_when_direction_is_north_and_command_is_l() {
        char direction = 'N';
        MarsRover rover = new MarsRover(2,3,direction);
        //rover.setDirection(direction);
        rover.receiveSingleCommand('L');
        assertThat(rover.getX()).isEqualTo(2);
        assertThat(rover.getY()).isEqualTo(3);
        assertThat(rover.getDirection()).isEqualTo('W');
    }
}
