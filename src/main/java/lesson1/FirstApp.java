package lesson1;

public class FirstApp {

    //однострочный комментарий
    //однострочный комментарий2

    /*
     * что-то
     * что занимает
     * нессколько строк
     */



    //TODO: emgusev расскажи ребятам про переменные


    public static void main(String[] args) {
        System.out.println("Hello, Java!");
        //type name = value;

        //Целочисленные
        byte btype = 10; //8 bit -> 2^8 -> 256  [-128,127]
        short stype = 167;//16bit [-2^15, 2^15-1]
        int itype = 1800;//32bit  //default
        long ltype = 180000000;//64

        //с плавающей точкой
        float ftype = 1.5f; //32bit
        double dtype = 1.5; //64 bit //default

        //логический
        boolean bool = false;


    }
}
