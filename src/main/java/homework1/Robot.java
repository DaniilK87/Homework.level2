package homework1;


public class Robot implements Run, Jump {
    private int RobotRun = 2;
    private int RobotJump = 1;

    public void Run () {
        System.out.println("Робот побежал");
    }

    int getRobotRun () {
        return RobotRun;
    }

    public void Jump () {
        System.out.println("Робот прыгнул");
    }

    int getRobotJump () {
        return RobotJump;
    }


}










