package view.sorting.ad;
import bean.Item;
import static untils.ArrayUtils.*;
import static java.util.Comparator.*;
import java.util.Arrays;
public class Ex03QuickSrt_Item_SimpleCase {

		/*
		 * với những trương hợp đơn giản như
		 * -> sắp xếp tăng dần giảm dần theo 1 hoặc nhiều thuộc tính
		 * +null first, lát cho elements
		 * --> Áp dụng sort có sẵn ngắn gọn hơn như bên dưới
		 * 
		 * Với những trường hợp
		 * + sắp xếp điều kiện if else phực tạp theo logic
		 *	--> Arrays.sort (elements, (t1, t2) -> ..
		 */
		public static void main(String[] args) {
			Arrays.sort(items, comparing(Item::getPrice));
			generate("1. Sort items by price[asc]", items);
			items = DataModel.mockItems_NullValues();
			Arrays.sort(items, 
					nullsLast(comparing(Item::getStoreId)
					.thenComparing(Item::getPrice))
					);
		
			generate("2. Sort items by storeId[asc], createAt[dec]", items);
			//sorting with Collator
		}
}
