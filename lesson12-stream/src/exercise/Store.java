package exercise;

import java.math.BigDecimal;
import java.util.Objects;

public class Store {

	private Integer storedId;
	private Integer referenceStoreId;
	private BigDecimal stockPreviousDay;
	private BigDecimal expectedSales;
	private boolean isSelected;
	private Integer warehouseAllocationAmount;
	
	public Store() {
	}

	public Store(Integer storedId, Integer referenceStoreId, BigDecimal stockPreviousDay, BigDecimal expectedSales,
			boolean isSelected, Integer warehouseAllocationAmount) {
		this.storedId = storedId;
		this.referenceStoreId = referenceStoreId;
		this.stockPreviousDay = stockPreviousDay;
		this.expectedSales = expectedSales;
		this.isSelected = isSelected;
		this.warehouseAllocationAmount = warehouseAllocationAmount;
	}

	public Integer getStoredId() {
		return storedId;
	}

	public void setStoredId(Integer storedId) {
		this.storedId = storedId;
	}

	public Integer getReferenceStoreId() {
		return referenceStoreId;
	}

	public void setReferenceStoreId(Integer referenceStoreId) {
		this.referenceStoreId = referenceStoreId;
	}

	public BigDecimal getStockPreviousDay() {
		return stockPreviousDay;
	}

	public void setStockPreviousDay(BigDecimal stockPreviousDay) {
		this.stockPreviousDay = stockPreviousDay;
	}

	public BigDecimal getExpectedSales() {
		return expectedSales;
	}

	public void setExpectedSales(BigDecimal expectedSales) {
		this.expectedSales = expectedSales;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	public Integer getWarehouseAllocationAmount() {
		return warehouseAllocationAmount;
	}

	public void setWarehouseAllocationAmount(Integer warehouseAllocationAmount) {
		this.warehouseAllocationAmount = warehouseAllocationAmount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(getExpectedSales(), isSelected, getReferenceStoreId(), getStockPreviousDay(), getStoredId(),
				getWarehouseAllocationAmount());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
//		if (obj == null)
//			return false;
		if(!(obj instanceof Store)) {
			return false;
		}
		Store that = (Store) obj;
		return Objects.equals(getExpectedSales(), that.expectedSales) 
				&& isSelected == that.isSelected
				&& Objects.equals(getReferenceStoreId(), that.referenceStoreId)
				&& Objects.equals(getStockPreviousDay(), that.stockPreviousDay) 
				&& Objects.equals(getStoredId(), that.storedId)
				&& Objects.equals(getWarehouseAllocationAmount(), that.warehouseAllocationAmount);
	}

	@Override
	public String toString() {
		return "Store [storedId=" + storedId + ", referenceStoreId=" + referenceStoreId + ", stockPreviousDay="
				+ stockPreviousDay + ", expectedSales=" + expectedSales + ", isSelected=" + isSelected
				+ ", warehouseAllocationAmount=" + warehouseAllocationAmount + "]";
	}
	
	
}
