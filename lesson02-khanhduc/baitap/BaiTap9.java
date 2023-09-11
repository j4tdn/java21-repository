package baitap;

public class BaiTap9 {
	    public static boolean laSoNguyenTo(int N) {
	        if (N <= 1) {
	            return false;
	        }
	        if (N <= 3) {
	            return true;
	        }
	        if (N % 2 == 0 || N % 3 == 0) {
	            return false;
	        }

	        for (int i = 5; i * i <= N; i += 6) {
	            if (N % i == 0 || N % (i + 2) == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        int soLuongSNTCanTim = 0;
	        int soHienTai = 2;

	        while (soLuongSNTCanTim < 200) {
	            if (laSoNguyenTo(soHienTai)) {
	                soLuongSNTCanTim++;
	                if (soLuongSNTCanTim == 200) {
	                    System.out.println("Số nguyên tố thứ 200 là: " + soHienTai);
	                }
	            }
	            soHienTai++;
	        }
	    }
	}


