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

     public Doctor(String name, String surname, int age, boolean gender, String specialization, int roomNumber, boolean isAvailable, double salary) {
        super(name, surname, age, gender);
        setSpecialization(specialization);
        setRoomNumber(roomNumber);
        setAvailable(isAvailable);
        setSalary(salary);
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public double getSalary() {
        return salary;
    }
    
    @Override
    public double getPaymentAmount() {
        return salary; 
    }

    @Override
    public String toString() {
        return super.toString() + "Doctor{" +
                "id=" + id +
                ", specialization='" + specialization + '\'' +
                ", roomNumber=" + roomNumber +
                ", isAvailable=" + isAvailable +
                ", salary=" + salary +
                '}';
    }
}
