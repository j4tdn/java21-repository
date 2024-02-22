package lap1;

public class BinaryToDecimalConverter {
    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int length = binaryString.length();

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(binaryString.charAt(i));
            decimal += digit * Math.pow(2, length - i - 1);
        }

        return decimal;
    }
}
