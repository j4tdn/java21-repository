package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Session;

import dao.base.GenericDao;
import persistence.entities.ItemGroup;

public class HibernateCacheDao extends GenericDao implements CacheDao {

	/*
	 SessionFactory(sessions)
	 
	 Session
	 
	 getCurrentSession()
	 
	 openSession()
	 
	 
	 1st level cache
	 + được cấu hình tự động bởi jpa/hibernate - ko thể disable
	 + lưu trữ trong phạm vi của một session
	 + --> các session khác ko thể dùng được
	 
	 2nd level cache
	 + cần provider để cấu hình, quản lý việc lưu trữ cho 2nd cache --> ehcache
	   --> cần thư việc, cấu hình
	 + lưu trữ trong phạm vi của session factory
	 + --> các session có thể trao đổi dữ liệu lẫn nhau
	 */
	
	
	@Override
	public void firstLevelCache() {
		System.out.println("Start: Test 1st level cache");

		Session s1 = openSession();
		Session s2 = openSession();

		ItemGroup group1 = s1.get(ItemGroup.class, 1); // get from database -> store into 1st cache
		System.out.println("group 1: " + group1);

		ItemGroup group2 = s2.get(ItemGroup.class, 2); // get from database -> store into 1st cache
		System.out.println("group 2: " + group2);
		
		ItemGroup group773 = s2.get(ItemGroup.class, 3); // get from database -> store into 1st cache
		System.out.println("group 773: " + group773);

		ItemGroup group3 = s1.get(ItemGroup.class, 1); // get from cache
		System.out.println("group 3: " + group3);

		// hạn chế: đảm bảo 100% lấy từ database, k quan tâm đến cache
		// s2.evict(group2);
		s2.clear();

		ItemGroup group4 = s2.get(ItemGroup.class, 2); //get from database
		System.out.println("group 4: " + group4);
		
		ItemGroup group5 = s2.get(ItemGroup.class, 3); // get from cache
		System.out.println("group 5: " + group5);

		System.out.println("Finish: Test 1st level cache");
	}

	@Override
	public void secondLevelCache() {
		System.out.println("Start: Test 2st level cache");

		Session s1 = openSession();
		Session s2 = openSession();
		Session s3 = openSession();
		Session s4 = openSession();

		ItemGroup group1 = s1.get(ItemGroup.class, 1); // get from db -> store into 1st, 2nd cache
		System.out.println("group 1: " + group1 + "\n");

		ItemGroup group2 = s2.get(ItemGroup.class, 2); // get from db -> store into 1st, 2nd cache
		System.out.println("group 2: " + group2 + "\n");

		ItemGroup group3 = s4.get(ItemGroup.class, 2); // get from cache
		System.out.println("group 3: " + group3 + "\n");

		ItemGroup group4 = s2.get(ItemGroup.class, 2); // get from cache
		System.out.println("group 4: " + group4 + "\n");

		doTask(5);

		ItemGroup group5 = s3.get(ItemGroup.class, 1); // get from cache
		System.out.println("group 5: " + group5 + "\n");

		System.out.println("Finish: Test 2nd level cache");
	}

	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
