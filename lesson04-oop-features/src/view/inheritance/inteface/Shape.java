package view.inheritance.inteface;

import view.inheritance.multiple.interfacee.Father;

public interface Shape extends Father{

	/* 
	  Trước Java8 - JDK 1.8 --> Hàm trong interface chỉ là hàm trừu tượng (chỉ có phần khai báo không có phần body )
	*/
	int s =10;
	void paint(); // bằng với " public abstract void paint();  " Mặt định có " public abstract "
	
	void cals();
	void coding();
}
