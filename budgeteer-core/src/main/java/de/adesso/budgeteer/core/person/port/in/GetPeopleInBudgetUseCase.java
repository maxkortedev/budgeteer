package de.adesso.budgeteer.core.person.port.in;

import de.adesso.budgeteer.core.person.domain.Person;

import java.util.List;

public interface GetPeopleInBudgetUseCase {
    List<Person> getPeopleInBudget(long budgetId);
}
