import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class HiB20 {

    public static void main(String[] args) {

        String str = "ABCC";
        String only ="";

        for (int i = 0; i <= str.length()-1; i++){

            char ch = str.charAt(i);
            int ch1  = str.indexOf(ch);
            int ch2 = str.lastIndexOf(ch);

            if (ch1==ch2){
                only+=ch;
            }
        }
        System.out.println(only);

    }
}
