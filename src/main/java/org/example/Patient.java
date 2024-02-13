package org.example;

public class Patient extends Person implements Payable{
    private int id;
    private String diagnosis;
    private boolean isOnReecord;
    private String bloodType;
    private boolean isVaccinated;
    private String chronicDiseases;
    private boolean isInsurance;

    public Patient(int id, String name, String surname, int age, boolean gender, String diagnosis, boolean isOnReecord, boolean isVaccinated, String chronicDiseases, String bloodType){
        super(name, surname, age, gender);
        setId(id);
        setBloodType(bloodType);
        setChronicDiseases(chronicDiseases);
        setDiagnosis(diagnosis);
        setInsurance(isInsurance);
        setOnReecord(isOnReecord);
        setVaccinated(isVaccinated);
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setDiagnosis(String diagnosis) {

        this.diagnosis = diagnosis;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setChronicDiseases(String chronicDiseases) {
        this.chronicDiseases = chronicDiseases;
    }

    public void setInsurance(boolean insurance) {
        isInsurance = insurance;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public void setOnReecord(boolean onReecord) {
        isOnReecord = onReecord;
    }

    public int getId() {
        return id;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getChronicDiseases() {
        return chronicDiseases;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public boolean isInsurance() {
        return isInsurance;
    }

    public boolean isOnReecord() {
        return isOnReecord;
    }

    @Override
    public double getPaymentAmount() {
        if(isInsurance == false){
            return 20000;
        }
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() +"Patient{" +
                "id=" + id +
                ", diagnosis='" + diagnosis + '\'' +
                ", isOnReecord=" + isOnReecord +
                ", bloodType='" + bloodType + '\'' +
                ", isVaccinated=" + isVaccinated +
                ", chronicDiseases='" + chronicDiseases + '\'' +
                ", isInsurance=" + isInsurance +
                '}';
    }
}
