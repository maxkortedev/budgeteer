package org.wickedsource.budgeteer.web.pages.budgets.weekreport;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;
import org.wickedsource.budgeteer.service.budget.BudgetTagFilter;
import org.wickedsource.budgeteer.web.AbstractWebTestTemplate;
import org.wickedsource.budgeteer.web.BudgeteerSession;
import org.wickedsource.budgeteer.web.pages.budgets.weekreport.multi.MultiBudgetWeekReportPage;

import java.util.Collections;

public class MultiBudgetWeekReportPageTest extends AbstractWebTestTemplate {

    @Test
    public void testSingleBudget() {
        WicketTester tester = getTester();
        BudgetTagFilter filter = new BudgetTagFilter(Collections.EMPTY_LIST, 1l);
        BudgeteerSession.get().setBudgetFilter(filter);
        tester.startPage(MultiBudgetWeekReportPage.class);
        tester.assertRenderedPage(MultiBudgetWeekReportPage.class);
    }

}
