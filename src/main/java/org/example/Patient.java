package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Patient extends Person implements Payable, Referralable {
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
    public void getReferral(String diagnosis){
        HashMap<String, String> diagToDoc = new HashMap<String, String>();
        diagToDoc.put("schizophrenia", "psychiatrist");
        diagToDoc.put("personality disorders", "psychiatrist");
        diagToDoc.put("Autism", "psychiatrist");
        diagToDoc.put("sociophobia", "psychotherapist");
        diagToDoc.put("ADHD", "psychotherapist");
        diagToDoc.put("depression", "psychotherapist");
        diagToDoc.put("neurosis", "neurologist");
        System.out.println("You must go to the" + diagToDoc.get(diagnosis));
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
