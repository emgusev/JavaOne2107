package lesson6;


import lesson5.Car;

public class OopDemoApp {

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        for (int i=0 ; i< cars.length; i++) {
            cars[i] = new Car("red", "Audi A" + (i+1));
        }


        for (int i=0 ; i< cars.length; i++) {
            System.out.println(cars[i]);
        }

        //foreach
         for (Car car : cars) {
             car.summaryInfo();
             car.setYear(2020);
             System.out.println(car);
         }


         Car.summaryInfo();


    }
}
