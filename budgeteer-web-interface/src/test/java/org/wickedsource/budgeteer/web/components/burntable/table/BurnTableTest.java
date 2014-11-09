package org.wickedsource.budgeteer.web.components.burntable.table;

import org.apache.wicket.util.tester.WicketTester;
import org.junit.Test;
import org.wickedsource.budgeteer.service.record.WorkRecordFilter;
import org.wickedsource.budgeteer.web.AbstractWebTestTemplate;
import org.wickedsource.budgeteer.web.components.burntable.filter.FilteredRecordsModel;

public class BurnTableTest extends AbstractWebTestTemplate {

    @Test
    public void render() {
        WicketTester tester = getTester();
        BurnTable table = new BurnTable("table", new FilteredRecordsModel(new WorkRecordFilter(1l)));
        tester.startComponentInPage(table);
    }

}
