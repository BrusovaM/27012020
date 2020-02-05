package Lesson_1;

public class LambdaApp {

    public static void main(String[] args) {

        Operationable op = new Operationable(){

            public int calculate(int x, int y){

                return x + y;
            }
        };

        int z = op.calculate(20, 10);
        System.out.println(z); // 30
    }
}

interface Operationable{
    int calculate(int x, int y);
}



//public class LambdaApp {
//
//    public static void main(String[] args) {
//
//        Operationable operation;
//        operation = (x,y)->x+y;
//
//        int result = operation.calculate(10, 20);
//        System.out.println(result); //30
//    }
//}
//interface Operationable{
//    int calculate(int x, int y);
//}
