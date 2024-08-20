

package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import persistence.dto.ItemDto;
import persistence.entities.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {

    @Override
    public List<ItemDto> getItemsBySalesDate(LocalDate date) {
        return executeWithTransaction(session -> {
        	String hql = "SELECT i FROM Item i " +
                    "JOIN i.orderDetails od " +
                    "JOIN od.order o " +
                    "WHERE DATE(o.orderTime) = :orderDate " +
                    "ORDER BY o.orderTime DESC, i.name ASC";

            Query<ItemDto> query = session.createQuery(hql, ItemDto.class);
            query.setParameter("orderDate", date.toString()); 

            return safeList(query);
        });
    }
    
    @Override
    public List<Item> getAll() {
        return executeWithTransaction(session -> {
            String hql = "FROM Item ORDER BY id ASC";
            Query<Item> query = session.createQuery(hql, Item.class);
            return safeList(query);
        });
    }
}
