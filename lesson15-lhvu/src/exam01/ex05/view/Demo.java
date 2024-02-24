package exam01.ex05.view;
import static java.util.Comparator.*;
import java.util.Comparator;
import static exam01.ex05.utils.CollectionUtils.generate;
/*1. Sắp xếp danh sách sinh viên tăng dần theo ĐTB. Nếu DTB bằng nhau sắp xếp tăng dần
theo họ tên.
2. Viết hàm tìm kiếm danh sách sinh viên có ĐTB > 8
3. Viết hàm tìm kiếm toàn bộ các sinh viên NỮ
4. Tìm kiếm sinh viên chỉ xuất hiện một lần trong student.txt. Biết rằng 2 sinh viên được
phân biệt với nhau thông qua MSSV
*/
import java.util.List;

import exam01.ex05.bean.GioiTinh;
import exam01.ex05.bean.Student;
import exam01.ex05.model.DataModel;

public class Demo {

	public static void main(String[] args) {
		List<Student> student = DataModel.getStudent();
		generate("1. Sắp xếp sinh viên tăng dần theo điểm trung bình", student.stream()
		.filter(t -> t.getGrade() >0 )
		.sorted(comparing(Student::getGrade))
		.toList());
		
		generate("2.tìm kiếm danh sách sinh viên có ĐTB > 8", student.stream()
				.filter(t ->t.getGrade() > 8)
				.toList());
		
		generate("3.tìm kiếm toàn bộ các sinh viên NỮ" , student.stream()
				.filter(t -> t.getGender()== GioiTinh.GAI)
				.toList());
		
		
		
		
	}
}
