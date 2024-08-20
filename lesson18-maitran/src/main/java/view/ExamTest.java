package view;

import java.time.LocalDate;
import java.util.List;
import persistence.entities.Item;
import service.ItemService;
import service.ItemServiceImpl;
import utils.CollectionUtils;

public class ExamTest {

    private static ItemService itemService;

    static {
        itemService = new ItemServiceImpl();
    }

    public static void main(String[] args) {
        CollectionUtils.generate("1. Liệt kê các mặt hàng được bán trong ngày ?", 
                itemService.getItemsBySalesDate(LocalDate.of(2024, 8, 20)));

        CollectionUtils.generate("4. Liệt kê danh sách các mặt hàng của mỗi loại hàng", 
                itemService.getAll());
    }
}
