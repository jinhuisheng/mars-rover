package kata;

public class MarsRover {

    private  int x;
    private  int y;

    public MarsRover(int x, int y, char direction) {

        this.x = x;
        this.y = y;
    }

    public void receiveSingleCommand(char command) {
        if(Character.toUpperCase(command) == 'B')
        {
            y = y - 1;
        }
        else {
            y = y + 1;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void receiveCommands(String commands) {
        for(char command: commands.toCharArray())
        {
            receiveSingleCommand(command);
        }
    }
}
