package ro.ctrln.java.ownership;

import ro.ctrln.java.ownership.annotations.Owners;

public class OwnersDatabase {

    private static Owner[] owners = new Owner[100];
    private static int index = 0;

    public static String getOwnerName(int index) {
        return owners[index].getName();
    }

    public static void addOwner(Owner owner) {
        owners[index] = owner;
        index++;
    }

    public static Owner[] getOwners() {
        return owners;
    }

    public static int getSize() {
        return index;
    }

    public static Owner getOwner(int index) {
        return owners[index];
    }
}

