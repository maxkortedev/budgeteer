package org.wickedsource.budgeteer.service.person;

import org.joda.money.Money;

import java.io.Serializable;
import java.util.Date;

public class PersonBaseData implements Serializable {

    private Long id;

    private String name;

    private Money averageDailyRate;

    private Date lastBooked;

    public PersonBaseData() {
    }

    public PersonBaseData(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getAverageDailyRate() {
        return averageDailyRate;
    }

    public void setAverageDailyRate(Money averageDailyRate) {
        this.averageDailyRate = averageDailyRate;
    }

    public Date getLastBooked() {
        return lastBooked;
    }

    public void setLastBooked(Date lastBooked) {
        this.lastBooked = lastBooked;
    }
}
