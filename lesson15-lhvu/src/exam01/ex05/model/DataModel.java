	package exam01.ex05.model;
/*  102130174, Le Na, 7.8, Nu
102130125, Hoang Nam, 8.2, Nam
102130176, Van Cuong, 9.8, Nam
102130177, Van Cong, 6.8, Nam
102130178, Ngoc Nu, 9.1, Nu
102130180, Hoang Nhung, 7.8, Nu
*/

import java.util.Arrays;
import java.util.List;

import exam01.ex05.bean.GioiTinh;
import exam01.ex05.bean.Student;

public class DataModel {

	public DataModel() {
		
	}
	public static List<Student> getStudent(){
	
		return List.of(
					new Student(102130174, "Le Na",  7.8d, GioiTinh.GAI),
					new Student(102130125, "Hoang Nam",  8.2d, GioiTinh.TRAI),
					new Student(102130176, "Van Cuong",  9.8d,GioiTinh.TRAI),
					new Student(102130177, "Van Cong",  6.8d, GioiTinh.TRAI),
					new Student(102130180, "Ngoc Nu",  9.1d, GioiTinh.GAI),
					new Student(102130180, "Hoang Nhung",  7.8d, GioiTinh.GAI)
					);
				
	}
}
