package factory;

import domain.Name;
//import util.Help;

public class NameFactory {

    public static Name createName (String firstName, String middleName, String lastName) {

        // if(Help.isEmpty(firstName) || Help.isEmpty(lastName))
           // return null;

        return new Name.Builder().setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
    }
}