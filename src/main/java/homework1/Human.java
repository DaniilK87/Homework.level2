package homework1;

public class Human implements Jump, Run {
    private int HumanRun = 4;
    private int HumanJump = 5;

    public void Jump () {
        System.out.println("Человек прыгнул");
    }

    public void Run () {
        System.out.println("Человек побежал");
    }

    public int getHumanRun() {
        return HumanRun;
    }

    public int getHumanJump() {
        return HumanJump;
    }
}//
