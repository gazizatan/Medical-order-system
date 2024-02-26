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
    private String gender;
    private int age;
    private String role;

    @Override
    public String toString() {
        return id + ": " + name + " " + surname + " - " + gender + ", " + role + ", " + age;
    }
}

