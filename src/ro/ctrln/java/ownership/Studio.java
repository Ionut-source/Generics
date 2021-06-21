package ro.ctrln.java.ownership;

import ro.ctrln.java.ownership.annotations.Owner;
import ro.ctrln.java.ownership.annotations.Owners;

@Owners({
        @Owner(ownerName = "Lisa", ownerType = OwnerType.PERSON),
        @Owner(ownerName = "Company SA" , ownerType = OwnerType.COMPANY),
        @Owner(ownerName = "Company Subsidiary SA" , ownerType = OwnerType.COMPANY)

} )
public class Studio extends LivingSpace{
}
