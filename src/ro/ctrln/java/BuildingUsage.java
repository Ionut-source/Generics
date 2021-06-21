package ro.ctrln.java;

public class BuildingUsage {

    public static void main(String[] args) {
        Building <String> building = new Building<>();
        building.setProperty("String");
        building.setProperty("StringOne");
        System.out.println(building.getProperty());

        Building<Integer> buildingOne = new Building<>();
        buildingOne.setProperty(1);
        buildingOne.setProperty(3);
        System.out.println(buildingOne.getProperty().byteValue());


        TestClass testClass = new TestClass();
        testClass.setName("TestName");
        Building<TestClass> buildingTwo = new Building<>();
        buildingTwo.setProperty(testClass);
        System.out.println(buildingTwo.getProperty().getName().length());
    }
}
