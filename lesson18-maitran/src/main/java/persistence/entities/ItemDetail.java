package persistence.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "T12_ITEM_DETAIL")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ItemDetail {

	@Id
	@Column(name = "C12_ITEM_DETAIL_ID")
	private Integer itemDetailId;

	@Column(name = "C12_SIZE_ID")
	private Integer sizeId;

	@Column(name = "C12_COLOR")
	private String color;

	@Column(name = "C12_SALES_PRICE")
	private BigDecimal salesPrice;

	@Column(name = "C12_AMOUNT")
	private Integer amount;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C12_ITEM_ID", referencedColumnName = "C01_ITEM_ID")
	private Item item;

	@Override
	public String toString() {
		return "ItemDetail [itemDetailId=" + itemDetailId + ", sizeId=" + sizeId + ", color=" + color + ", salesPrice="
				+ salesPrice + ", amount=" + amount + "]";
	}
}