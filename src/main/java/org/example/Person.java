package org.example;

public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(int id, String name, String surname, int age, boolean gender){
        set Id(id);
        setName(name);
        setSurname(surname);
        setGender(gender);
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName(){

        return surname;
    }
    
    public String getSurname(){
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

