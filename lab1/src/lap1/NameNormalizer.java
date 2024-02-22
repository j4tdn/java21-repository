package lap1;

public class NameNormalizer {
    public static String normalizeName(String inputName) {
        // Chuyển đổi tất cả các ký tự thành chữ thường
        inputName = inputName.toLowerCase();

        // Chia tách tên thành các phần: họ, chữ lót, tên
        String[] nameParts = inputName.split(" ");

        StringBuilder normalizedBuilder = new StringBuilder();

        for (String part : nameParts) {
            // Kiểm tra xem phần có chữ cái hay không
            if (part.matches("[a-z]+")) {
                // Nếu là phần chữ cái, viết hoa ký tự đầu tiên và thêm vào chuỗi chuẩn hóa
                normalizedBuilder.append(Character.toUpperCase(part.charAt(0)))
                                 .append(part.substring(1)).append(" ");
            }
        }

        // Xóa ký tự trắng ở cuối chuỗi chuẩn hóa
        String normalizedName = normalizedBuilder.toString().trim();

        return normalizedName;
    }
}

