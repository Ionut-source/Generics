package ro.ctrln.java.ownership;

import ro.ctrln.java.ownership.annotations.Owner;

@Owner(ownerName = "ABC SRL", ownerType = OwnerType.COMPANY)
@Owner(ownerName = "AZERTY SA" , ownerType = OwnerType.COMPANY)
public class Duplex extends Housing{
}
