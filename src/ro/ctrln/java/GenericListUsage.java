package ro.ctrln.java;

import java.math.BigDecimal;

public class GenericListUsage {

    public static void main(String[] args) {

        GenericList<BigDecimal> bigDecimals = new GenericList<>();
        bigDecimals.addElement(BigDecimal.valueOf(2));
        bigDecimals.addElement(new BigDecimal("2.45"));
        bigDecimals.addElement(new BigDecimal("2.39"));
        bigDecimals.addElement(new BigDecimal("2.58"));
        System.out.println("Elementul de pe pozitia 0 este: " + bigDecimals.getElement(0));
        System.out.println("Elementul de pe pozitia 1 este: " + bigDecimals.getElement(1));
        System.out.println("Elementul de pe pozitia 2 este: " + bigDecimals.getElement(2));
        System.out.println("Elementul de pe pozitia 3 este: " + bigDecimals.getElement(3));

        System.out.println("Marimea bigDecimals dupa adaugarea elementelor este: " + bigDecimals.getSize());

        bigDecimals.removeElement(2);
        System.out.println("Elementul de pe pozitia 0 este: " + bigDecimals.getElement(0));
        System.out.println("Elementul de pe pozitia 1 este: " + bigDecimals.getElement(1));
        System.out.println("Elementul de pe pozitia 2 este: " + bigDecimals.getElement(2));
        System.out.println("Marimea bigDecimals dupa stergerea elementului de pe pozitia 2 este: " + bigDecimals.getSize());

        GenericList<String> strings = new GenericList<>();
        strings.addElement("one");
        strings.addElement("two");
        strings.addElement("three");
        System.out.println("Marimea strings dupa adaugaerea elementelor este: " + strings.getSize());
        strings.removeElement(0);
        strings.removeElement(0);
        strings.removeElement(0);
        System.out.println("Marimea strings dupa stergerea elementelor este: " + strings.getSize());


        for (int index = 0; index < bigDecimals.getSize(); index++) {
            System.out.println("Elementul de pe pozitia" + index + "este: " + bigDecimals.getElement(index));
        }
    }
}
