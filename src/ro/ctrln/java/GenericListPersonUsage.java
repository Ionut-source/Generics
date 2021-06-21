package ro.ctrln.java;

public class GenericListPersonUsage {

    public static void main(String[] args) {

        GenericList<Person> persons = new GenericList<>();

        persons.addElement(new Person("Lisa"));
        persons.addElement(new Person("John"));
        persons.addElement(new Person("Eric"));

        System.out.println("Marimea persons este: " + persons.getSize());

        persons.removeElement(2);
        System.out.println("Marimea persons dupa stergere este: " + persons.getSize());

        for (int index = 0; index < persons.getSize(); index++) {
            System.out.println("Persoana de pe pozitia " + index + "este: " + persons.getElement(index));
        }
    }
}
