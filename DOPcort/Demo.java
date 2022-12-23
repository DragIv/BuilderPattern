package DOPcort;

import DOPcort.builders.CortBuilder;
import DOPcort.cort.Cort;


public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CortBuilder cortBuilder = new CortBuilder();


        director.constructVegan(cortBuilder);
        Cort cortinf = cortBuilder.getResult();
        System.out.println("\n built:\n" + cortinf.print());
    }

}