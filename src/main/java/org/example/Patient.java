package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Patient extends Person implements Payable{
    private int id;
    private String diagnosis;
    private boolean isOnReecord;
    private String bloodType;
    private boolean isVaccinated;
    private String chronicDiseases;
    private boolean isInsurance;

    @Override
    public double getPaymentAmount() {
        if(!isInsurance){
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
