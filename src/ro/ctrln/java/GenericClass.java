package ro.ctrln.java;

import java.math.BigDecimal;
import java.util.ArrayList;

public class GenericClass {
    public static void main(String[] args) {
        
        ArrayList <BigDecimal> objectList = new ArrayList<>();
        BigDecimal[] bigDecimalVector = new BigDecimal[100];

        
//        objectList.add(new Object());
//        objectList.add("String");
//        objectList.add(1);
        objectList.add(new BigDecimal(3.5));
        objectList.add(BigDecimal.valueOf(2));

        bigDecimalVector[0] = new BigDecimal(2);
       // bigDecimalVector[1] = Integer.valueOf(1); -> in acest vector putem adauga doar elemente de tip BigDecimal

        System.out.println(objectList.get(0));
        System.out.println(objectList.get(1));
//        System.out.println(objectList.get(2));
//        System.out.println(objectList.get(3));
        
        BigDecimal bigDecimal = objectList.get(0);
        System.out.println("BigDecimal:" + bigDecimal);
        
        String stringElement = objectList.get(1).toString();
        System.out.println("String: " + stringElement);

//        String astringElement = String.valueOf (objectList.get(2));
//        System.out.println("aStringElement:" + astringElement);
    }
}
