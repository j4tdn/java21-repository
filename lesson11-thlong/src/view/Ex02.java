package view;

import java.math.BigDecimal;
import java.util.List;
import static java.util.Comparator.*;
import static model.DataModel.*;
import bean.CD;
import static utils.CollectionUtils.*;

public class Ex02 {
	public static void main(String[] args) {
		//Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD.
		List<CD> cds = mockCDs();
		addCd(cds, new CD(6, "A", "Lam Trường", 10, bd("100000")));
		generate("1. ", cds);
		
		//Tìm số lượng CD có trong danh sách.
		System.out.println(" 2. Số lượng trong ds: " + cds.size());
		
		//Tình tổng giá thành của các CD.
		
		System.out.println("3. Tổng giá thành " + totalSales(cds));
		totalSales(cds);
		
		//Viết phương thức sắp xếp danh sách giảm dần theo giá thành.
		cds.sort(comparing(CD::getGiaThanh, reverseOrder()));
		generate("4. Danh sách giảm dần theo giá thành. ", cds);
		
		//Viết phương thức sắp xếp danh sách tĕng dần theo mã CD.
		cds.sort(comparing(CD::getMaCD));
		generate("5. sắp xếp danh sách tĕng dần theo mã CD. ", cds);
		
		
		
	}

	public static void addCd(List<CD> cds, CD cd) {
		cds.add(cd);
	}
	
	public static BigDecimal totalSales(List<CD> cds) {
		BigDecimal total = BigDecimal.ZERO;
		
		for (CD cd: cds) {
			total = total.add(cd.getGiaThanh());
		}
		return total;
	}
	

}
