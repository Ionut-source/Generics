package ro.ctrln.java.ownership;

import ro.ctrln.java.ownership.annotations.Owner;
import ro.ctrln.java.ownership.annotations.Owners;

import java.lang.annotation.Annotation;

public class BuildingOwnersDatabase {

    public static void main(String[] args) {

        scanClass(Block.class);

        scanClass(Duplex.class);

        scanClass(House.class);

        scanClass(Apartment.class);

        scanClass(SingleRoom.class);

        scanClass(Studio.class);

        for (int index = 0; index < OwnersDatabase.getSize(); index++) {
            System.out.println(OwnersDatabase.getOwner(index));
        }
    }

    public static void scanClass(Class housingClass) {
        for (Annotation annotation : housingClass.getAnnotations()) {
            if (annotation instanceof Owners) {
                Owners owners = (Owners) annotation;
                for (Owner ownerAnnotation : owners.value()) {
                    ro.ctrln.java.ownership.Owner owner = new ro.ctrln.java.ownership.Owner(ownerAnnotation.ownerName(), ownerAnnotation.ownerType());
                    OwnersDatabase.addOwner(owner);
                }
            }
        }
    }
}
