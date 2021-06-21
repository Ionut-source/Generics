package ro.ctrln.java.ownership;

import ro.ctrln.java.ownership.annotations.Owner;
import ro.ctrln.java.ownership.annotations.Owners;

@Owners({
        @Owner(ownerName = "Double SA", ownerType = OwnerType.COMPANY)
})

public class SingleRoom extends  LivingSpace {
}
