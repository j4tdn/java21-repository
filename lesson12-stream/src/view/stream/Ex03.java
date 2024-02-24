package view.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static utils.CollectionUtils.*;
import bean.Dish;
import model.DataMode;

public class Ex03 {
	
	public static void main(String[] args) {
		
		List<Dish> menu = DataMode.mockDishes();
		
		
		//Duyệt từng phần tử trong menu
		//Nếu phần từ nào có name chưa tồn tại trong noneOverlapNames
		// --> thỏa mãn: lấy phần tử đó ra
		//			   : đồng thời đưa nam đó vào nonOverLapNames để lần sau xuất hiện nữa thì sẽ không lấy
		
		//Set<String> nonOverlapNames = new HashSet<>();
		
		//equals , hashCode --> muốn distinct theo tt gì phải orverride euqals, hashcode theo
	    // : euqals hashcode thường mình sẽ orverride tt dùng để phân biệt các đối tượng	
		//List<Dish> distincValue = menu.stream()
		//.distinct()
			//	.filter(d-> nonOverlapNames.add(d.getName()))
	//	.collect(Collectors.toList());
		
		//Cách 1: Distinct by Key (set, nếu có n phần tử trùng nó luôn chọn thằng đầu tiên
		generate("2. Danh sacsh dĩa thức ăn", menu);
		
		generate("2. Liệt kê các đĩa thức ăn không trùng nhau theo thuộc tính???", 
				distintByKey(menu, d -> d.getName())); 
		//hoặc code	distintByKey(menu, Dish::getName())); 
		
		//Cách 2: Dùng để distinct danh sách theo thuộc tính, chọn được phần từ đầu cuối khi thuộc tính trùng nhau
		Collection<Dish> collection = menu.stream() // Stream<Dish>
		.collect(Collectors.toMap(Dish::getName, Function.identity(), (e1, e2) -> e1)) //Map<String, Dish>  chọn phần tử cuối, nếu chọn phần tử đầu sửa thành -> e2
		.values(); // lấy value trong Map ra			 Function.identity() dùng hàm có sẵn t trả về t t->t
		
		generate("2.2 Liệt kê các đĩa thức ăn không trùng nhau theo thuộc tính???" , collection);
		
		// lấy tất cả trừ 2 tử đầu tiên dùng hàm .skip(2)
		// lấy 3 phần tử giữa dùng . limit(3)
	}
	
	//static method
	//Function<T, T> f = Class.itslef();
	private static <T> Function<T, T> itself(){
		return t-> t;
	}
	
	//static method refrerence 
	private static <T> T itself (T t) {
		return t;
	}
	
	private static <R> List<Dish> distintByKey (List<Dish> elements, Function<Dish, R> keyExTractor){
		Set<R> nonOverLapKeys = new HashSet<>();
		
		return elements.stream()
						.filter(d-> nonOverLapKeys.add(keyExTractor.apply(d)))
				.collect(Collectors.toList());
		
	}
}
