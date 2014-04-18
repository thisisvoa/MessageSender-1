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
package org.message.service;

import java.util.List;

import org.message.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能说明
 * 	短消息发送服务
 * 
 * @author 冯剑涛
 * @version 1.0
 * @since 2014年4月17日
 */
@Service
public class MessageSendService {
	
	@Autowired
	private MessageService messageService;
	
	public void fetchMessageNotSend() {
		List<Message> messageLi = messageService.findMessagesNotSend(10);
		
		for(Message message : messageLi) {
			System.out.println(message.getText());
			System.out.println(message.getState());
		}
	}
}

