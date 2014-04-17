/* 
 * 创建日期 2014年4月17日
 *
 * 成都天和软件公司
 * 电话：028-85425861 
 * 传真：028-85425861-8008 
 * 邮编：610041 
 * 地址：成都市武侯区航空路6号丰德万瑞中心B座1001 
 * 版权所有
 */
package org.message.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.message.model.Message;
import org.springframework.stereotype.Repository;

/**
 * 功能说明
 * 
 * @author 冯剑涛
 * @version 1.0
 * @since 2014年4月17日
 */
@Repository
@SuppressWarnings("all")
public class MessageDao extends BaseDao {
	
	public List<Message> findAllMessage() {
		Session session = getSession();
		
		Criteria cQuery = session.createCriteria(Message.class);
		
		return cQuery.list();
	}
	
}

