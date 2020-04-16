package homework1;

public class Treadmill implements Run {
    private int lenght = 3;

    public void Run () {
        System.out.println("Пробежал по дорожке");
    }


    int getLenght () {
        return lenght;
    }
    void Treadmill (int lenght) {
        this.lenght = lenght; //
    }
}
