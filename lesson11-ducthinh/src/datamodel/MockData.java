package datamodel;

import java.util.LinkedHashSet;
import java.util.Set;
import bean.CD;
import static utils.CollectionUtils. *;

public class MockData {
	public MockData() {
		
	}
	private static Set<CD> mockCDs() {
		var listCD = new LinkedHashSet<CD>();
		listCD.add(new CD(112, "Loại 1", "Ca sĩ A", 2, bd(15.6d)));
		listCD.add(new CD(21, "Loại 1", "Ca sĩ B", 4, bd(25.3d)));
		listCD.add(new CD(30, "Loại 2", "Ca sĩ C", 1, bd(5.6d)));
		listCD.add(new CD(400, "Loại 3", "Ca sĩ D", 2, bd(14d)));
		listCD.add(new CD(5, "Loại 2", "Ca sĩ E", 5, bd(55.6d)));
		listCD.add(new CD(666, "Loại 4", "Ca sĩ G", 3, bd(35.2d)));
		return listCD;
	}
	
}
