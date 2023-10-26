package java07;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.List;

public class Lesson04_DucThinh {
    public static void main(String[] args) {
        // Ngày hiện tại
        LocalDate currentDate = LocalDate.of(2022, 6, 7);

        // Số ngày để thực hiện dự án (110 ngày)
        int daysToComplete = 110;

        // Danh sách các ngày nghỉ lễ
        List<LocalDate> holidays = List.of(
            LocalDate.of(2022, 9, 2),  // Ngày Quốc khánh
            LocalDate.of(2022, 12, 25) // Ngày Noel
        );

        LocalDate deliveryDate = currentDate.plusDays(daysToComplete);

        // Duyệt qua các ngày và kiểm tra xem ngày đó có phải là Chủ nhật hoặc là một ngày nghỉ lễ hay không
        while (daysToComplete > 0) {
            if (deliveryDate.getDayOfWeek() == DayOfWeek.SUNDAY || holidays.contains(deliveryDate)) {
                deliveryDate = deliveryDate.plusDays(1);
            } else {
                deliveryDate = deliveryDate.plusDays(1);
                daysToComplete--;
            }
        }

        System.out.println("Ngày bàn giao sản phẩm cho khách hàng: " + deliveryDate);
    }
}


