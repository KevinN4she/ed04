package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Mi trabajo
 * @author Kevin
 * @version 1
 * @since 9/03/2024
 * @see -
 */

class Contacto {
    private String name;
    private List<String> phones;

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }
}