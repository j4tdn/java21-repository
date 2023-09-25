package view.polymorphism.object;

public class Square extends Shape {

		 @Override //bắt đầu ghi đè bấm ctrl + space chọn paint calS
		void paint() {
			System.out.println("Square --> paint");
		}
		 @Override
		void calS() {
			// TODO Auto-generated method stub
			 System.out.println("Square --> calS");
		}
		 void setBackground() {
			 System.out.println("Square --> SetBackground");
		 }

	}

