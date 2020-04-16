package homework1;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Cat cat = new Cat();
        Human human = new Human();
        Treadmill treadmill = new Treadmill();
        Wall wall = new Wall();
        while (true) {
            if (robot.getRobotRun() < treadmill.getLenght() || robot.getRobotJump() < wall.getWall()) {
                System.out.println("Robot no action");
                break;
            } else if (robot.getRobotRun() > treadmill.getLenght() && robot.getRobotJump() > wall.getWall()) {
                robot.Run();
                treadmill.Run();
                robot.Jump();
                wall.Jump();
                break;
            }
        }
            while (true) {
                if (cat.getCatRun() < treadmill.getLenght() || cat.getCatJump() < wall.getWall()) {
                    System.out.println("Cat no action");
                    break;
                } else if (cat.getCatJump() > treadmill.getLenght() && cat.getCatJump() > wall.getWall()) {
                    cat.Run();
                    treadmill.Run();
                    cat.Jump();
                    wall.Jump();
                    break;

                }
            }

            while (true) {
                if (human.getHumanRun() < treadmill.getLenght() || human.getHumanJump() < wall.getWall()) {
                    System.out.println("People no action");
                    break;
                } else if (human.getHumanRun() > treadmill.getLenght() || human.getHumanJump() > wall.getWall()) {
                    human.Run();
                    treadmill.Run();
                    human.Jump();
                    wall.Jump();
                    break;
                }
            }


        }
    }
