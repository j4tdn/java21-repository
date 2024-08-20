package dao;

import org.hibernate.Session;

import dao.base.GenericDao;
import entity.ItemGroup;

public class HibernateCacheDao extends GenericDao implements CacheDao{

	@Override
	public void firstLevelCache() {
		// configuration: có sẵn của Hibernate
		// disable: Không thể disable
		// Scope: single transaction - single session
		
		System.out.println("Start First Level Cache");
		
		Session session1 = openSession();
		Session session2 = openSession();
		
		ItemGroup  group1 = session1.get(ItemGroup.class, 1);// lần đầu tiên: get từ database và sau đó lưu và First Level Cache
		System.out.println("group 1 -->" + group1);
		
		ItemGroup  group2 = session2.get(ItemGroup.class, 2); // lần đầu tiên: get từ database và sau đó lưu và First Level Cache
															//               : Vì đây là session2 chứ không phải session 1
		System.out.println("group 2 -->" + group2);
		
		ItemGroup  group3 = session1.get(ItemGroup.class, 2); // Nó sẽ vẫn get từ database vì session mới chỉ có itemGroup 1, còn itemGroup 2 thì chưa có
															// => nó vẫn sẽ vào database để get data
		
		System.out.println("group 3 -->" + group3);
		
		// session2.evict(group2);  evict: xóa đối tượng group2 ở vùng nhớ Cache
		// session2.clear();        clear: xóa tất cả đối tượng ở vùng nhớ Cache
		
		ItemGroup  group4 = session2.get(ItemGroup.class, 2);// Lần này nó get ra ItemGroup 2 trong session2, mà trong session2 này trước đó đã get ra ItemGroup2
															// => nó sẽ get data từ First Level Cache
		
		System.out.println("group 4 -->" + group4);
		
		System.out.println("Finish First Level Cache");
	}
	@Override
	public void secondLevelCache() {
		// configuration: không có sẵn, phải thêm, dùng thư viện từ bên ngoài
		// enable: không có sẵn, phải enable, có thể disable
		// Scope: single transaction - multiple session
		// Sử dụng khi: ứng dụng bị vấn đề về bad performance(hiệu suất thấp)
	}

}
