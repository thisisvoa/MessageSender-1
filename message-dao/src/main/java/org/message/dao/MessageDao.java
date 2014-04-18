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
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
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

	/**
	 * 查询所有消息
	 * 
	 * @return									消息列表
	 */
	public List<Message> findAllMessage() {
		Session session = getSession();

		Criteria cQuery = session.createCriteria(Message.class);

		return cQuery.list();
	}

	/**
	 * 查询特定数目的消息
	 * 
	 * @param messageCount						要查询的消息数目
	 * @return									消息列表
	 */
	public List<Message> findSpecificCountMessage(int messageCount) {
		Session session = getSession();

		Criteria cQuery = session.createCriteria(Message.class);
		// set search count first - 0 / max - messageCount
		cQuery.setFirstResult(0);
		cQuery.setMaxResults(messageCount < 0 ? 10 : messageCount);
		// set state equals 1
		cQuery.add(Restrictions.eq( "state" , 1 ));
		
		return cQuery.list();
	}

}
