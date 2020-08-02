import java.util.ArrayList;
import java.util.Collection;

public class Batch20 {

    public static void main(String[] args) {


            ArrayList<Integer> list = new ArrayList<>();

            list.add(7);
            list.add(8);
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(6);
            list.add(11);
            list.add(2);
            list.add(9);




            ArrayList<Integer> uniquesNumber = new ArrayList<>();

            for (Integer element : list) {
                Integer count = 0;
                for (Integer each : list) {
                    if (each == element) {
                        count++;
                    }
                }
                if (count==1){
                    uniquesNumber.add(element);
                }

            }
        System.out.println(uniquesNumber);

        }
    }




