// File: Item.java
package bean;

public class Item {
    private String storeId;
    private String referenceStoreId;
    private String stockPreviousDay;
    private String expectedSales;
    private String isSelected;

    public Item(String storeId, String referenceStoreId, String stockPreviousDay, String expectedSales, String isSelected) {
        this.storeId = storeId;
        this.referenceStoreId = referenceStoreId;
        this.stockPreviousDay = stockPreviousDay;
        this.expectedSales = expectedSales;
        this.isSelected = isSelected;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getReferenceStoreId() {
        return referenceStoreId;
    }

    public void setReferenceStoreId(String referenceStoreId) {
        this.referenceStoreId = referenceStoreId;
    }

    public String getStockPreviousDay() {
        return stockPreviousDay;
    }

    public void setStockPreviousDay(String stockPreviousDay) {
        this.stockPreviousDay = stockPreviousDay;
    }

    public String getExpectedSales() {
        return expectedSales;
    }

    public void setExpectedSales(String expectedSales) {
        this.expectedSales = expectedSales;
    }

    public String getIsSelected() {
        return isSelected;
    }

    public void setIsSelected(String isSelected) {
        this.isSelected = isSelected;
    }
}
