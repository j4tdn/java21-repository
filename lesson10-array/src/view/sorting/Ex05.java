package view.sorting;
import static untils.ArrayUtils.*;
import java.util.Arrays;
import java.util.Comparator;
import static java.util.Comparator.*;
import bean.Item;

public class Ex05 {
	
	//xem lại
	public static void main(String[] args) {
	 Arrays.sort(Item, new Comparator<Item>() {
		 public int compare(Item i1, Item i2) {
			 return i1.getPrice().compareTo(i2.getPrice());
		 }
	});
	 // tăng dần theo store ID, và giảm dần theo ngày tạo
	 ge
	 
	 
	}
}
