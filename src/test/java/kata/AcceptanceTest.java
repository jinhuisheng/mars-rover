package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AcceptanceTest {
    @Test
    void should_execute_commands_success() {
        MarsRover rover = new MarsRover(2, 3, "N");
        rover.executeCommands("FBFFFLLRFBBB");
        assertThat(rover.getX()).isEqualTo(4);
        assertThat(rover.getY()).isEqualTo(6);
        assertThat(rover.getDirection()).isEqualTo("W");
    }
}
