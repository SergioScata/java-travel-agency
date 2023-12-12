package org.lessons.java.travel.agency;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;

public class Vacanza {
    private String destination;
    private LocalDate startDate;
    private LocalDate endDate;

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }


    public Vacanza(String destination, LocalDate startDate, LocalDate endDate)throws IllegalArgumentException {
        validateDestination(destination);
        validateStartDate(startDate);
        validateEndDate(endDate);
        this.destination = destination;
        this.startDate = startDate;
        this.endDate = endDate;
    }




    private void validateDestination(String destination){
        if (destination == null || destination.isEmpty()){
            throw new IllegalArgumentException("destinazione non valida");
        }
    }

    private void validateStartDate(LocalDate startDate){
        if (startDate == null || startDate.isBefore(LocalDate.now())){
            throw new IllegalArgumentException("data di partenza non valida!");
        }
    }


    private void validateEndDate(LocalDate endDate) {
        if (endDate == null || endDate.isBefore(startDate)){
            throw new IllegalArgumentException("data di arrivo non valida!");
        }
    }

    public long totalDays(){
        long daysBetween =  DAYS.between(startDate, endDate);
        return  daysBetween;

    }

    @Override
    public String toString() {
        return "Hai prenotato una vacanza di " + totalDays()+ "giorni a " + destination +  "dal " + startDate + "al" + endDate;
    }
}

