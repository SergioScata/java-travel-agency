package org.lessons.java.travel.agency;

import java.time.LocalDate;

public class ViaggioNozze extends Vacanza{

    private String chosenTreatment;

    public String getChosenTreatment() {
        return chosenTreatment;
    }

    public void setChosenTreatment(String chosenTreatment) {
        this.chosenTreatment = chosenTreatment;
    }

    public ViaggioNozze(String destination, LocalDate startDate, LocalDate endDate, String chosenTreatment) throws IllegalArgumentException {
        super(destination, startDate, endDate);
        this.chosenTreatment = chosenTreatment;
    }

    @Override
    public String toString() {
        return super.toString() + " Trattamento scelto: " + chosenTreatment;
    }
}

