package ro.ctrln.java.ownership;

import ro.ctrln.java.ownership.annotations.Owner;

//@Owner(ownerName = OwnersDatabase.getOwnerNama(0)) - aici avem o eraore de compilare pt ca valorile adnotarilor trebuie sa fie constante
@Owner(ownerName = "John", ownerType = OwnerType.PERSON)
@Owner(ownerName = "Companie SRL", ownerType = OwnerType.COMPANY)
public class Apartment extends LivingSpace{
}
