package ro.ctrln.java.ownership.annotations;


import ro.ctrln.java.ownership.OwnerType;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * In adnotari putem sa folosim doar urmatoarele tipuri:
 * a. un tip de data primitiv
 * b. String
 * c. Class sau o invocare a unei clase
 * d. un tip enumerat - enum
 * e. o alta adnotare
 * f. un array din cele anterioare
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Owners.class)
public @interface Owner {
    String ownerName();
    OwnerType ownerType();

}
