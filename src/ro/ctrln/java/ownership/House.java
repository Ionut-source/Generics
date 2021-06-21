package ro.ctrln.java.ownership;

import ro.ctrln.java.ownership.annotations.Owner;
import ro.ctrln.java.ownership.annotations.Owners;

@Owners({
        @Owner(ownerName = "DEF SA", ownerType = OwnerType.COMPANY)
})
public class House extends Housing{
}
