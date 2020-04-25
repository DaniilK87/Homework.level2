package homework2;



 class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String message) {
        super(message);
    }
}

class MyArraySizeException extends Exception {

    public MyArraySizeException(String message) {
        super(message);

    }
}

    class Main {

        public static void main(String[] args) {
            Object[][] arr;
            int sum = 0;
            try {
                arr = initArray(4,4);
            } catch (MyArraySizeException e) {
                e.printStackTrace();
                return;
            }
            for (int i = 0; i < arr.length; i++)
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        sum += (int) arr[i][j];
                    } catch (RuntimeException e) {
                        throw new MyArrayDataException("в ячейке [" + i + "],[" + j + "] тип данных не int." );
                    }
                }
            System.out.println("Сумма массива = " + sum);
        }

        public static Object[][] initArray(int x, int y) throws MyArraySizeException {
            if (x != 4 || y != 4) {
                throw new MyArraySizeException("Массив не может быть больше 4*4");
            }
            return new Object[][]{{1,2,3,4},{1,"a",3,4}};
        }
    }







