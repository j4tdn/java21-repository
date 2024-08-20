package constant;

import dto.ItemDetailDto;
import dto.ItemDto;
import dto.ItemgroupDto;
import dto.OrderItemDto;

public class QueryConstants {
	
	private QueryConstants() {
	}
	
	public static final String GET_ALL_ITEM_BY_TODAY = ""
		    + "SELECT i.C01_ITEM_ID AS " + OrderItemDto.PROP_ITEM_ID + ", "
		    + "       i.C01_ITEM_NAME AS " + OrderItemDto.PROP_ITEM_NAME + ", "
		    + "       o.C03_ORDER_TIME AS " + OrderItemDto.PROP_ORDER_TIME + "\n"
		    + "FROM t01_item i\n"
		    + "JOIN t03_order o ON i.C01_ITEM_ID = o.C03_ITEM_ID\n"
		    + "WHERE DATE(o.C03_ORDER_TIME) = :date \n"
		    + "ORDER BY o.C03_ORDER_TIME DESC, i.C01_ITEM_ID ASC;";
	
	
	public static final String GET_EMPLOYEE_WITH_SALARY_GREATER_THAN_MANAGER = ""
			+ "SELECT e FROM Employee e WHERE e.salary > e.manager.salary";
	
	
	public static final String GET_ALL_ITEM_GROUP_INVENTORY = ""
	        + "SELECT g.C02_ITEM_GROUP_ID AS "+ItemgroupDto.PROP_ID+" , "
	        + "g.C02_ITEM_GROUP_NAME AS " +ItemgroupDto.PROP_NAME+ ", "
	        + "SUM(d.C12_AMOUNT) AS "+ ItemgroupDto.PROP_AMOUNT_OF_ITEMS +" "
	        + "FROM t02_item_group g "
	        + "JOIN t01_item i ON g.C02_ITEM_GROUP_ID = i.C01_ITEM_GROUP_ID "
	        + "JOIN t12_item_detail d ON i.C01_ITEM_ID = d.C12_ITEM_ID "
	        + "GROUP BY g.C02_ITEM_GROUP_ID, g.C02_ITEM_GROUP_NAME "
	        + "ORDER BY amountOfItems DESC";
	
	
	public static final String GET_ALL_ITEM_DETAIL = ""
		    + "SELECT it.C01_ITEM_ID AS " + ItemDetailDto.PROP_ITEM_ID + ", "
		    + "       it.C01_ITEM_NAME AS " + ItemDetailDto.PROP_ITEM_NAME + ", "
		    + "       it.C01_BUY_PRICE AS " + ItemDetailDto.PROP_BY_PRICE + ", "
		    + "       idt.C12_COLOR AS " + ItemDetailDto.PROP_COLOR + ", "
		    + "       idt.C12_SALES_PRICE AS " + ItemDetailDto.PROP_SALES_PRICE + ", "
		    + "       itg.C02_ITEM_GROUP_ID AS " + ItemDetailDto.PROP_ITEM_GROUP_ID + ", "
		    + "       itg.C02_ITEM_GROUP_NAME AS " + ItemDetailDto.PROP_ITEM_GROUP_NAME + " "
		    + "FROM t01_item it "
		    + "JOIN t02_item_group itg ON it.C01_ITEM_GROUP_ID = itg.C02_ITEM_GROUP_ID "
		    + "JOIN t12_item_detail idt ON it.C01_ITEM_ID = idt.C12_ITEM_ID "
		    + "ORDER BY it.C01_ITEM_ID, it.C01_ITEM_NAME, it.C01_BUY_PRICE, idt.C12_COLOR, idt.C12_SALES_PRICE, "
		    + "         itg.C02_ITEM_GROUP_ID, itg.C02_ITEM_GROUP_NAME;";
	
	
	public static final String GET_TOP3_SELLING_ITEM_BY_YEAR = ""
			+ "SELECT name\n"
			+ "FROM (\n"
			+ "    SELECT i.C01_ITEM_ID AS "+ItemDto.PROP_ID+", \n"
			+ "           i.C01_ITEM_NAME AS "+ItemDto.PROP_NAME+", \n"
			+ "           SUM(d.C12_AMOUNT) AS "+ItemDto.PROP_AMOUNT+"\n"
			+ "    FROM t01_item i\n"
			+ "    JOIN t12_item_detail d ON i.C01_ITEM_ID = d.C12_ITEM_ID\n"
			+ "    JOIN t03_order o ON d.C12_ITEM_ID = o.C03_ORDER_ID\n"
			+ "    WHERE YEAR(o.C03_ORDER_TIME) = :year\n"
			+ "    GROUP BY i.C01_ITEM_ID, i.C01_ITEM_NAME\n"
			+ "    ORDER BY "+ItemDto.PROP_AMOUNT+" DESC, "+ItemDto.PROP_ID+" DESC\n"
			+ "    LIMIT 3\n"
			+ ") AS top_items\n"
			+ "LIMIT 0, 1000;\n"
			+ "";
	
	
}