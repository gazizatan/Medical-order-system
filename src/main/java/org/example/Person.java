package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Person {
    private int id;
    private String name;
    private String surname;
    private boolean gender;

    @Override
    public String toString() {
        return id + ": " + name + " " + surname + " - " + (gender ? "male" : "female");
    }
}

