package dao;

import java.util.List;
import java.util.function.Function;

import javax.persistence.Cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import connection.DbConnection;

public class BaseHibernateDao {

    private static final Logger logger = LoggerFactory.getLogger(BaseHibernateDao.class);
    private SessionFactory sessionFactory;

    public BaseHibernateDao() {
        sessionFactory = DbConnection.getSessionFactory();
    }

    public Session openSession() {
        return sessionFactory.openSession();
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void clear2ndCache() {
        Cache cache = sessionFactory.getCache();
        cache.evictAll();
    }

    protected <T> T executeWithTransaction(Function<Session, T> function) {
        Session session = openSession();
        Transaction transaction = session.beginTransaction();
        T result = null;
        try {
            result = function.apply(session);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            logger.error("Transaction failed and rolled back.", e);
            e.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    protected <T> List<T> safeList(Query<?> query) {
        return (List<T>) query.getResultList();
    }
}
