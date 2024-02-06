package org.example;
public class Person {
    private int id;
    private static int id_gen=1;
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    public Person(){
        id=id_gen++;
    }
    public Person(String name, String surname, int age){
        this();
        setName(name);
        setSurname(surname);
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

