package Ex04;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
        ArrayList<Personel> personelList = new ArrayList<>();

        Director gd = new Director("Võ Văn A",    LocalDate.of(1970, 01, 01), 2.0, 0.5);
        personelList.add(gd);

        Manager tp1 = new Manager("Nguyễn Văn B", LocalDate.of(1980, 05, 05), 1.5, 0.3, "Phong A");
        Manager tp2= new Manager("Lê Văn C",      LocalDate.of(1985, 10, 10), 1.6, 0.4, "Phong B");
        personelList.add(tp1);
        personelList.add(tp2);

        Staff nv1 = new Staff("Trần Văn D",        LocalDate.of(1990, 02, 15), 1.0,  "Phong A", tp1);
        Staff nv2 = new Staff("Lý Văn E",          LocalDate.of(1995, 03, 20), 1.2,  "Phong B", tp2);
        Staff nv3 = new Staff("Nguyễn Thị Hồng F", LocalDate.of(1992, 02, 25), 1.25, "Phong B", tp1);
        Staff nv4 = new Staff("Trần Thị G",        LocalDate.of(1997, 05, 30), 1.1,  "Phong A", tp2);
        Staff nv5 = new Staff("Nguyễn Văn H",      LocalDate.of(1988, 06, 05), 1.3,  "Phong B", tp1);
        Staff nv6 = new Staff("Lê Thị I",          LocalDate.of(1993, 07, 10), 1.32, "Phong A", tp2);
        personelList.add(nv1);
        personelList.add(nv2);
        personelList.add(nv3);
        personelList.add(nv4);
        personelList.add(nv5);
        personelList.add(nv6);
        
        System.out.println("Hiển thị thông tin nhân sự trong công ty: ");
        for(Personel ps : personelList) {
        	System.out.println(ps);
        }
        System.out.println("\n========================================================================================================\n");
        
        System.out.println("\nThống kê số lượng nhân viên được quản lý bởi từng trưởng phòng:");
        for (Personel ps : personelList) {
            if (ps instanceof Manager) {
                Manager manager = (Manager) ps;
                int count = 0;
                for (Personel nv : personelList) {
                    if (nv instanceof Staff && ((Staff) nv).getManager() == manager) {
                        count++;
                    }
                }
                System.out.println("Trưởng phòng " + manager.getFullName() + " quản lý " + count + " nhân viên.");
            }
        }
        
        System.out.println("\nMức lương của từng loại nhân sự:");
        for (Personel ps : personelList) {
            double Salary = ps.calcSalary();
            String typePersonel = ps instanceof Director ? "Giám đốc" : ps instanceof Manager ? "Trưởng phòng" : "Nhân viên";
            System.out.println(typePersonel + " " + ps.getFullName() + ": " + Salary);
        }
	}
	
}
