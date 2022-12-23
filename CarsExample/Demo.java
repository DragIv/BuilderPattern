package CarsExample;

import CarsExample.builders.CarManualBuilder;
import CarsExample.cars.Manual;


public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\n built:\n" + carManual.print());
    }

}