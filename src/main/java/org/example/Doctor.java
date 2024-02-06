package org.example;
public class Doctor extends Person implements Payable {
    private int id;
    private static int id_gen = 1;
    private String specialization;
    private int roomNumber;
    private boolean isAvailable;
    private double salary;

    public Doctor() {
        id = id_gen++;
    }
}
