package lesson09_exam;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
	private static JFrame frame;
	private static JTextArea resultArea;
	private static JPanel panel;
	private static List<String> permutationsList;

	public static void main(String[] args) {
		frame = new JFrame("Time Functions");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 500);

		panel = new JPanel();
		frame.add(panel);

		resultArea = new JTextArea(10, 30);
		resultArea.setEditable(false);
		panel.add(resultArea);

		permutationsList = new ArrayList<>();

		addFunctionButton("1. Đếm số phần tử chung", e -> countCommonElements());
		addFunctionButton("2. Số Hạnh Phúc – Happy Number", e -> numberHappy());
		addFunctionButton("3. Level của số tự nhiên", e -> levelNumber());
		addFunctionButton("4. Tìm tất cả các hoán vị của chuỗi String", e -> stringPermutation());
		frame.setVisible(true);
	}

	private static void addFunctionButton(String label, ActionListener listener) {
		JButton button = new JButton(label);
		button.addActionListener(listener);
		panel.add(button);
	}

	private static void countCommonElements() {

		String string01 = JOptionPane
				.showInputDialog("Nhập vào mảng thứ nhất gồm n phần tử cách nhau bởi dấu phẩy (4<n<40)	");
		String string02 = JOptionPane
				.showInputDialog("Nhập vào mảng thứ hai gồm n phần tử cách nhau bởi dấu phẩy (4<n<40)	");

		String[] arr01 = string01.split(" ");
		String[] arr02 = string02.split(" ");
		String a = "";
		if (arr01.length > 40 || arr01.length < 4)
			a = a.concat("Mảng thứ nhất không đứng số lượng (4<n<40) \n");
		if (arr02.length > 40 || arr02.length < 4)
			a = a.concat("Mảng thứ hai không đứng số lượng (4<n<40) \n");
		if (a.equals("")) {
			String[] tmp = findCommonElements(arr01, arr02);

			for (int i = 0; i < tmp.length; i++) {
				a = a.concat(tmp[i]).concat(" ");
			}
		}
		resultArea.setText("Các phần tử chung của 2 mảng là:" + a);
	}

// hàm để làm câu 1 (tìm mảng chung trong 2 mảng )
	public static String[] findCommonElements(String[] array1, String[] array2) {
		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();

		for (String element : array1) {
			set1.add(element);
		}

		for (String element : array2) {
			set2.add(element);
		}

		set1.retainAll(set2);

		String[] result = new String[set1.size()];
		int index = 0;
		for (String element : set1) {
			result[index++] = element;
		}

		return result;
	}

	private static void numberHappy() {

		String number = JOptionPane.showInputDialog("Nhập vào số cần kiểm tra số hạnh phúc:");
		if (isHappyNumber(number))
			resultArea.setText(number + " là số hạnh phúc");
		else
			resultArea.setText(number + " không phải là số hạnh phúc");
	}

	// hàm kiểm tra số hạnh phúc cho bài 2

	public static boolean isHappyNumber(String numStr) {
		int num = Integer.parseInt(numStr);

		int slow = num;
		int fast = num;

		do {
			slow = calculateSquareSum(slow);
			fast = calculateSquareSum(calculateSquareSum(fast));

			if (fast == 1) {
				return true;
			}
		} while (slow != fast);

		return false;
	}

	// hàm tính tổng ch bài 2
	public static int calculateSquareSum(int num) {
		int sum = 0;

		while (num > 0) {
			int digit = num % 10;
			sum += digit * digit;
			num /= 10;
		}

		return sum;
	}

	private static void levelNumber() {

		String dobStr = JOptionPane.showInputDialog("Nhập vào một mảng số nguyên gồm n (3 < n < 20) phần tử.");
		String[] arr = dobStr.split(" ");
		if (arr.length > 20 || arr.length < 3)
			resultArea.setText("Mảng từ 3 đến 20 kí tự cần nhập lại.");
		if (arr.length <= 20 && arr.length >= 3) {
			int[] arrInt = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				arrInt[i] = Integer.parseInt(arr[i]);
			}

			sortByLevel(arrInt);
		}
	}

	// hàm bài 3
	public static void sortByLevel(int[] array) {
		Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);

		Arrays.sort(arr, Comparator.comparingInt(Main::countDivisors));

		for (int i = 0; i < array.length; i++) {
			array[i] = arr[i];
		}
		String result = "";

		for (int num : array) {
			result = result.concat(String.valueOf(num)).concat(" ");
		}

		resultArea.setText("Leval của các số tự nhiên được nhập là ." + result);
	}

	// loại các phần từ giống nhau trong mảng

	public static int countDivisors(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		return count;
	}

	private static void stringPermutation() {
		String string = JOptionPane.showInputDialog("Nhập vào string cần tìm hoán vị:");
		permutationsList.clear();
		generatePermutations("", string);

		String[] string01 = removeDuplicates(permutationsList.toArray(new String[0]));

		resultArea.setText("Các hoán vị duy nhất của chuỗi là:\n");
		for (String permutation : string01) {
			resultArea.append(permutation + "\n");
		}
	}

	// đệ quy
	private static void generatePermutations(String prefix, String string) {
		int n = string.length();

		if (n == 0) {
			permutationsList.add(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				generatePermutations(prefix + string.charAt(i), string.substring(0, i) + string.substring(i + 1, n));
			}
		}
	}

	
	// xóa các kí tự trùng lặp
	private static String[] removeDuplicates(String[] array) {
		Set<String> set = new HashSet<>(Arrays.asList(array));

		String[] uniqueArray = set.toArray(new String[0]);

		return uniqueArray;
	}
}
