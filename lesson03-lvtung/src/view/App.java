package view;

import java.time.LocalDateTime;
import bean.Customer;
import bean.Item;
import bean.ItemDetail;
import bean.Order;
import utils.OrderUtils;

public class App {

    public static void main(String[] args) {
        Customer customer1 = new Customer("KH1", "Z.Zidane", "012345678", "France");
        Customer customer2 = new Customer("KH2", "H.Kane", "012345678", "England");

        Item item1 = new Item("SS10+", "Android", "Black", 620);
        Item item2 = new Item("SS20+", "Android", "Green", 840);
        Item item3 = new Item("IP4", "IOS", "White", 280);
        Item item4 = new Item("IP12", "IOS", "Black", 880);
        Item item5 = new Item("WP8+", "WindowPhone", "Blue", 560);

        Order order1 = new Order(customer1, new ItemDetail[]{
            new ItemDetail(item1, 3),
            new ItemDetail(item4, 5),
            new ItemDetail(item2, 1)
        }, LocalDateTime.of(2023, 5, 8, 10, 10, 10));

        Order order2 = new Order(customer2, new ItemDetail[]{
            new ItemDetail(item3, 2),
            new ItemDetail(item5, 1)
        }, LocalDateTime.of(2023, 5, 7, 20, 10, 12));

        Order order3 = new Order(customer2, new ItemDetail[]{
            new ItemDetail(item4, 1)
        }, LocalDateTime.of(2023, 5, 8, 9, 28, 32));

        System.out.println("Tổng tiền: " + OrderUtils.export(order1));
        System.out.println("Tổng tiền: " + OrderUtils.export(order2));
        System.out.println("Tổng tiền: " + OrderUtils.export(order3));
    }
}
