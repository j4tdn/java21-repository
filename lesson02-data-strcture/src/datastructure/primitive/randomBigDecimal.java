package datastructure.primitive;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class randomBigDecimal {
public static void main(String[] args) {
	double a=1.44, b=10.43;
	// chuyển đổi từ float/double về bigdecimal .
	// bigdecimal thay thế hoàn toàn cho float/double .
	// hàm multiply là nhân a với b xong mới rút gọn
	BigDecimal bdcm = BigDecimal.valueOf(a)
			.multiply(BigDecimal.valueOf(b))
			.setScale(4, RoundingMode.HALF_UP);
	// Hàm setScale giúp rút số thập phân về 4 chữ số
	System.out.println(bdcm);
}
}
