package day_02;

import java.util.LinkedHashMap;

public class MapPractice {

    public static void main(String[] args) {
        String[] namesGroup1 = {"Oliver", "Jack", "Noah", "Breanna", "Shay","James", "Conor", "Jake", "John"};
        Integer[] salariesGroup1 = {11000, 105000, 95000, 85000, 100000, 90000, 78000, 118000, 98000};

        LinkedHashMap<String, Integer> group1 = new LinkedHashMap<>();

        for(int i= 0; i < namesGroup1.length; i++){
            group1.put( namesGroup1[i], salariesGroup1[i]  );
        }


        System.out.println(group1);



    }

}