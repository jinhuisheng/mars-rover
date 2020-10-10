package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class MarsRoverTest {
    @Test
    void should_be_W_Given_direction_is_N_when_turn_left() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
        marsRover.turnLeft();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.W);
    }

    @Test
    void should_be_S_Given_direction_is_W_when_turn_left() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.W);
        marsRover.turnLeft();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.S);
    }

    @Test
    void should_be_E_Given_direction_is_S_when_turn_left() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.S);
        marsRover.turnLeft();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.E);
    }

    @Test
    void should_be_N_Given_direction_is_E_when_turn_left() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.E);
        marsRover.turnLeft();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
    }

    @Test
    void should_be_E_Given_direction_is_N_when_turn_right() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
        marsRover.turnRight();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.E);
    }

    @Test
    void should_be_N_Given_direction_is_W_when_turn_right() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.W);
        marsRover.turnRight();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
    }

    @Test
    void should_be_W_Given_direction_is_S_when_turn_right() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.S);
        marsRover.turnRight();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.W);
    }

    @Test
    void should_be_S_Given_direction_is_E_when_turn_right() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.E);
        marsRover.turnRight();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.S);
    }

    @Test
    void should_be_success_Given_direction_is_N_when_forward() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
        marsRover.forward();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
    }

    @Test
    void should_be_success_Given_direction_is_S_when_forward() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.S);
        marsRover.forward();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(-1);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.S);
    }

    @Test
    void should_be_success_Given_direction_is_E_when_forward() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.E);
        marsRover.forward();
        assertThat(marsRover.getX()).isEqualTo(1);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.E);
    }

    @Test
    void should_be_success_Given_direction_is_W_when_forward() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.W);
        marsRover.forward();
        assertThat(marsRover.getX()).isEqualTo(-1);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.W);
    }


    @Test
    void should_be_success_Given_direction_is_N_when_back() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
        marsRover.back();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(-1);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
    }

    @Test
    void should_be_success_Given_direction_is_S_when_back() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.S);
        marsRover.back();
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.S);
    }

    @Test
    void should_be_success_Given_direction_is_E_when_back() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.E);
        marsRover.back();
        assertThat(marsRover.getX()).isEqualTo(-1);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.E);
    }

    @Test
    void should_be_success_Given_direction_is_W_when_back() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.W);
        marsRover.back();
        assertThat(marsRover.getX()).isEqualTo(1);
        assertThat(marsRover.getY()).isEqualTo(0);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.W);
    }
}
