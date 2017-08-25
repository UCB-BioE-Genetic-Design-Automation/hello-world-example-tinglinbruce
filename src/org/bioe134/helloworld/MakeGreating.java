package org.bioe134.helloworld;

import org.bioe134.helloworld.model.Person;

/**
 *
 * @author J. Christopher Anderson
 */
public class MakeGreating {

    private String salutation;

    public void initiate() throws Exception {
        salutation = "Hi ";
    }

    public String run(Person person) throws Exception {
        return salutation + person.getName();
    }
}
