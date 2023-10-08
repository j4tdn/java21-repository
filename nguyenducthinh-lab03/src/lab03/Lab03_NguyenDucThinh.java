package lab03;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab03_NguyenDucThinh {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Doctor> doctors = new ArrayList<>();
		while(true) {
			System.out.println("======== Doctor Management =======");
			System.out.println("1. Add Doctor.");
			System.out.println("2. Update Doctor.");
			System.out.println("3. Delete Doctor.");
			System.out.println("4. Search Doctor.");
			System.out.println("5. Exit.");
			int choice = Integer.parseInt(ip.nextLine());
			switch (choice) {
			case 1: 
				addDoctor(doctors);
				break;
			case 2:
				updateDoctor(doctors);
				break;
			case 3:
				deleteDoctor(doctors);
				break;
			case 4:
				searchDoctor(doctors);
				break;
			case 5: 
				System.out.println("Program is exiting...");
				System.exit(0);
			default:
				System.out.println("Choice must be in range[1,5], please input again");
			}
			
		}
	}
	
	// Hàm thêm doctor
	public static void addDoctor(ArrayList<Doctor> doctors) {
		System.out.println("=== Add Doctor ===");
		System.out.println("Enter Code: ");
		String code = ip.nextLine();
		System.out.println("Enter Name: ");
		String name = ip.nextLine();
		System.out.println("Enter Specialization: ");
		String specialization = ip.nextLine();
		System.out.println("Enter Availability: ");
		int availability = Integer.parseInt(ip.nextLine());
		
		Doctor doctor = new Doctor(code, name, specialization, availability);
		doctors.add(doctor);
		System.out.println("Add a new doctor successfully");
		System.out.println("=== List doctor now ====");
		displayDoctor(doctors);
	}
	
	//Hàm display doctor
	public static void displayDoctor(ArrayList<Doctor> doctors) {
		for(Doctor doctor : doctors) {
			System.out.println(doctor);
		}
	}
	
	//Hàm update doctor
	public static void updateDoctor(ArrayList<Doctor> doctors) {
		System.out.println("=== Update doctor ===");
		System.out.println("Enter code of doctor needed change info :");
		String codeSet = ip.nextLine();
		boolean check = false;
		for(Doctor doctor : doctors) {
			if(doctor.getCode().equalsIgnoreCase(codeSet)) {
				check = true;
				System.out.println("Enter new name for doctor: ");
				String newName = ip.nextLine();
				System.out.println("Enter new specialization for doctor: ");
				String newspecialization = ip.nextLine();
				System.out.println("Enter new availability for doctor: ");
				int availability = Integer.parseInt(ip.nextLine());
				
				doctor.setName(newName);
				doctor.setSpecialization(newspecialization);
				doctor.setAvailability(availability);
			}
		}
		if(!check) {
			System.out.println("Not find code doctor needed change");
		}else {
			System.out.println("Update doctor successfully");
		}
		System.out.println("=== List doctor now ===");
		displayDoctor(doctors);
	}
	
	// Hàm delete doctor
	public static void deleteDoctor(ArrayList<Doctor> doctors) {
		System.out.println("=== Delate Doctor ===");
		System.out.println("Enter code doctor needed delete: ");
		String codeToDelete = ip.nextLine();
		boolean check = false;
		
		for(Doctor doctor : doctors) {
			if(doctor.getCode().equalsIgnoreCase(codeToDelete)) {
				check = true;
				doctors.remove(doctor);
			}
		}
		if(!check) {
			System.out.println("Not find code doctor needed delete");
		}else {
			System.out.println("Delete doctor successfully");
		}
		System.out.println("List doctor now");
		displayDoctor(doctors);
	}
	
	//Hàm search doctor
	public static void searchDoctor(ArrayList<Doctor> doctors) {
		System.out.println("=== Search Doctor ===");
		System.out.println("Enter code search doctor : ");
		String codeToSearch = ip.nextLine();
		boolean check = false;
		
		for(Doctor doctor : doctors) {
			if(doctor.getCode().equalsIgnoreCase(codeToSearch)) {
				check = true;
				System.out.println("Found doctor: ");
				System.out.println(doctor);
			}
		}
		if(!check) {
			System.out.println("Not find code doctor ");
		}else {
			System.out.println("Search doctor successfully");
		}
	}
}
