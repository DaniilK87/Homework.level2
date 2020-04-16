package homework1;

public class Cat implements Run, Jump {
    private int CatRun = 2;
    private int CatJump = 5;

    public void Run() {
        System.out.println("Кот побежал");
    }

    public void Jump () {
        System.out.println("Кот прыгнул");
    }

    public int getCatRun() {
        return CatRun;
    }

    public int getCatJump() {
        return CatJump;
    }
}
