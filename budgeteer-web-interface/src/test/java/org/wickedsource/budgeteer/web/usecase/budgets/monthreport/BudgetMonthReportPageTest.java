package org.wickedsource.budgeteer.web.usecase.budgets.monthreport;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;
import org.wickedsource.budgeteer.service.budget.BudgetTagFilter;
import org.wickedsource.budgeteer.web.AbstractWebTestTemplate;
import org.wickedsource.budgeteer.web.BudgeteerSession;

public class BudgetMonthReportPageTest extends AbstractWebTestTemplate {

    @Test
    public void testSingleBudget() {
        WicketTester tester = getTester();
        BudgetTagFilter filter = new BudgetTagFilter();
        BudgeteerSession.get().setBudgetFilter(filter);
        tester.startPage(BudgetMonthReportPage.class);
        tester.assertRenderedPage(BudgetMonthReportPage.class);
    }
}
