package homework1;

public class Wall implements Jump {
    private int Wall = 3;

  public void Jump () {
      System.out.println("Перепрыгнул стену");
  }

    int getWall () {
        return Wall;
    } //
}
