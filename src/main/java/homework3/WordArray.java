package homework3;

import javax.sound.midi.Soundbank;
import java.util.*;

public class WordArray {

        public void WordArray () {
            ArrayList<String> arr = new ArrayList<>();
            arr.add("Москва");
            arr.add("Москва");
            arr.add("Москва");
            arr.add("Москва");
            arr.add("Спб");
            arr.add("Спб");
            arr.add("Уфа");
            arr.add("Самара");
            arr.add("Краснодар");
            arr.add("Казань");
            Set<String> set = new HashSet<>(arr);
            System.out.println(arr);
            System.out.println(set);


        }
}








