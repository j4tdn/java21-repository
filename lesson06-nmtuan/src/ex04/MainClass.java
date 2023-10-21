package ex04;

	import java.util.Scanner;

	public class MainClass {
		public static void main(String[] args) {
			int number = inputNumber();
			String numberToString = convertNumberToString(number);
			System.out.println(number + " chuyển sang dạng chữ: " + numberToString);
		}

		private static int inputNumber() {
			int number = 1000;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("Vui lòng nhập số dương <1000: ");
				try {
					number = Integer.parseInt(sc.nextLine());
				} catch (NumberFormatException e) {
					System.out.println("Số gì kỳ vậy?");
				}
			} while (number >= 1000);
			return number;
		}

		private static String convertNumberToString(int number) {
			String[] numbersToString = { "không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín" };
			String tmpString = "";
			int count = 0;
			
			while (number > 0) {
				int addNumber = number % 10;
				switch (count) {
				case 0:
					tmpString = numbersToString[addNumber] + tmpString;
					break;
				case 1:
					
					tmpString = tmpString.replace("không", "");
					if (addNumber == 0 ) {
						tmpString = "lẻ " + tmpString;
					} else {
						if (addNumber == 1) {
							tmpString = "mười " + tmpString + ".";
						} else {
							tmpString = numbersToString[addNumber] + " mươi " + tmpString;
						}
					}
					
					tmpString = tmpString.replaceAll("một$", "mốt");
					
					if (addNumber != 0) {
						tmpString = tmpString.replaceAll("năm$", "lăm");
					}
					
					// nếu nó tmpString kết thúc bằng "lẻ " thì xóa nó
					tmpString = tmpString.replaceAll("lẻ $", "");
						
					break;
				case 2:
					tmpString = numbersToString[addNumber] + " trăm " + tmpString;
				}
				count++;
				number /= 10;
			}
			
			return tmpString;
		}
	}

