package kata;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/10/10.
 */
public class AcceptanceTest {
    @Test
    void test() {
        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
        marsRover.executeCommands("ffbllr");
        assertThat(marsRover.getX()).isEqualTo(0);
        assertThat(marsRover.getY()).isEqualTo(1);
        assertThat(marsRover.getDirection()).isEqualTo(Direction.W);
    }

    /**
     * 行走的骨架最后可以移除了
     */
//    @Test
//    void walking_skeleton() {
//        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
//        marsRover.executeCommands("f");
//        assertThat(marsRover.getX()).isEqualTo(0);
//        assertThat(marsRover.getY()).isEqualTo(1);
//        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
//    }
//
//    @Test
//    void walking_skeleton_forward_twice() {
//        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
//        marsRover.executeCommands("ff");
//        assertThat(marsRover.getX()).isEqualTo(0);
//        assertThat(marsRover.getY()).isEqualTo(2);
//        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
//    }
//
//    @Test
//    void walking_skeleton_back() {
//        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
//        marsRover.executeCommands("b");
//        assertThat(marsRover.getX()).isEqualTo(0);
//        assertThat(marsRover.getY()).isEqualTo(-1);
//        assertThat(marsRover.getDirection()).isEqualTo(Direction.N);
//    }
//
//    @Test
//    void walking_skeleton_turn_left() {
//        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
//        marsRover.executeCommands("l");
//        assertThat(marsRover.getX()).isEqualTo(0);
//        assertThat(marsRover.getY()).isEqualTo(0);
//        assertThat(marsRover.getDirection()).isEqualTo(Direction.W);
//    }
//
//    @Test
//    void walking_skeleton_turn_right() {
//        MarsRover marsRover = new MarsRover(new Coordinate(0, 0), Direction.N);
//        marsRover.executeCommands("r");
//        assertThat(marsRover.getX()).isEqualTo(0);
//        assertThat(marsRover.getY()).isEqualTo(0);
//        assertThat(marsRover.getDirection()).isEqualTo(Direction.E);
//    }
//

}
