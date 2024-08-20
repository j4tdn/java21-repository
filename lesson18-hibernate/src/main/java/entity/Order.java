package entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "t03_order")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Order {
	
	@Id
	@Column(name = "C03_ORDER_ID")
	Integer id;
	
	@Column(name = "C03_ORDER_TIME")
	LocalDateTime time;
	
	@Column(name = "C03_DELIVERY_FEE")
	BigDecimal deliveryFee;
	
	@Column(name = "C03_DELIVERY_ADDRESS")
	String address;
	
	@Column(name = "C03_RECEIVER_PHONE")
	String phone;
	
	@Column(name = "C03_TOTAL_OF_MONEY")
	BigDecimal totalOfMoney;
	
}
