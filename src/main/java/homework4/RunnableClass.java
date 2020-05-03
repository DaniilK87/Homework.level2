package homework4;

public class RunnableClass  {
    static final int SIZE = 10000000;
    static final int HALF = SIZE/2;
    static int [] arr = new int[HALF];

    public synchronized void threadOne () {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(1);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Время" + " " + startTime);
        System.out.println();
    }

   public  synchronized void  threadTwo () {
       long startTime = System.currentTimeMillis();
       for (int i = 0; i < arr.length; i++) {
           arr[i] = (int) (arr[i] * Math.sin(0.2f + i/5) * Math.cos(0.2f + i/5) * Math.cos(0.4f + i/2));
           System.out.print(arr[i]);
           try {
               Thread.sleep(5);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       long timeSpent = System.currentTimeMillis() - startTime;
       System.out.println("Время" + " " + startTime);
       System.out.println();
   }

    public static void main(String[] args) {
        RunnableClass rnc = new RunnableClass();
        new Thread(() -> rnc.threadOne()).start();
        new Thread(() -> rnc.threadTwo()).start();

    }
}

