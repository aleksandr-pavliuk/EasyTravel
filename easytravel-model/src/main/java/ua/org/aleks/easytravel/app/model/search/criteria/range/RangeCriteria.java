package ua.org.aleks.easytravel.app.model.search.criteria.range;

import ua.org.aleks.easytravel.app.infra.exeption.flow.InvalidParameterException;
import ua.org.aleks.easytravel.app.infra.util.Checks;

/**
 * Pagination parameters for data retrieval operations
 * @author admin
 *
 */
public class RangeCriteria {
    /**
     * Page index(0-based)
     */
    private final int page;

    /**
     * Number of elements per page
     */
    private final int rowCount;

    public RangeCriteria(final int page, final int rowCount) {
        Checks.checkParameter(page >= 0, "Incorrect page index:" + page);
        Checks.checkParameter(rowCount >= 0, "Incorrect row count:" + rowCount);

        this.page = page;
        this.rowCount = rowCount;
    }

    public int getPage() {
        return page;
    }

    public int getRowCount() {
        return rowCount;
    }
}
