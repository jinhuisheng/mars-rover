package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class MarsRoverTest {
    @Test
    void init_marsRover_success() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
    }

    @Test
    void should_be_W_given_N_when_turn_left() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        marsRover.turnLeft();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.W);
    }

    @Test
    void should_be_S_given_W_when_turn_left() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        marsRover.turnLeft();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.S);
    }

    @Test
    void should_be_E_given_S_when_turn_left() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        marsRover.turnLeft();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.E);
    }

    @Test
    void should_be_N_given_E_when_turn_left() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        marsRover.turnLeft();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
    }

    @Test
    void should_be_E_given_N_when_turn_right() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        marsRover.turnRight();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.E);
    }

    @Test
    void should_be_S_given_E_when_turn_right() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        marsRover.turnRight();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.S);
    }

    @Test
    void should_be_W_given_S_when_turn_right() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        marsRover.turnRight();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.W);
    }

    @Test
    void should_be_N_given_W_when_turn_right() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        marsRover.turnRight();
        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
    }

    @Test
    void should_forward_right_when_direction_is_North() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        marsRover.forward();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(1);
    }

    @Test
    void should_forward_right_when_direction_is_South() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        marsRover.forward();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(-1);
    }

    @Test
    void should_forward_right_when_direction_is_West() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        marsRover.forward();
        assertThat(marsRover.getX()).isEqualTo(-1);
        assertThat(marsRover.getY()).isEqualTo(0);
    }

    @Test
    void should_forward_right_when_direction_is_East() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        marsRover.forward();
        assertThat(marsRover.getX()).isEqualTo(1);
        assertThat(marsRover.getY()).isEqualTo(0);
    }

    @Test
    void should_back_right_when_direction_is_North() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.N);
        marsRover.back();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(-1);
    }

    @Test
    void should_back_right_when_direction_is_South() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.S);
        marsRover.back();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(1);
    }

    @Test
    void should_back_right_when_direction_is_West() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.W);
        marsRover.back();
        assertThat(marsRover.getX()).isEqualTo(1);
        assertThat(marsRover.getY()).isEqualTo(0);
    }

    @Test
    void should_back_right_when_direction_is_East() {
        MarsRover marsRover = new MarsRover(0, 0, Direction.E);
        marsRover.back();
        assertThat(marsRover.getX()).isEqualTo(-1);
        assertThat(marsRover.getY()).isEqualTo(0);
    }

}
