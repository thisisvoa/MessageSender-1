package org.message.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao {
    @Resource
    private SessionFactory sessionFactory;
    protected Logger log = LoggerFactory.getLogger(getClass());

    private SessionFactory getSessionFactory() {
        return this.sessionFactory;
    }

    /**
     * 获取会话
     * 
     * @return 数据库会话
     */
    public Session getSession() {
        Session session;
        
        session = getSessionFactory().getCurrentSession();
        
        if (session == null) {
            session = getSessionFactory().openSession();
        }
        
        return session;
    }
}
