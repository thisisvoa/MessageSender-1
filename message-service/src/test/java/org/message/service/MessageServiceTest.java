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

import org.junit.Test;
import org.message.schedule.constant.ScheduleConstant;

import com.message.base.utils.SpringUtils;
import com.message.schedule.Schedule;
import com.message.schedule.ScheduleHelper;

/**
 * 功能说明
 * 
 * @author 冯剑涛
 * @version 1.0
 * @since 2014年4月17日
 */
public class MessageServiceTest {
	@Test
	public void testFindAllMessage() {
		//final MessageSendService massageSend = (MessageSendService)SpringUtils.getBean(MessageSendService.class);
		
		ScheduleHelper scheduleHelper = ScheduleHelper.createScheduleHelper();
		
		scheduleHelper.registerSchedule(new Schedule() {

			@Override
			public void run() {
				System.out.println("test");
			}
			
		}, ScheduleConstant.SECOND, ScheduleConstant.SECOND * 5);
		
		//massageSend.fetchMessageNotSend();	
	}

    public static void main(String[] args) {
        ScheduleHelper scheduleHelper = ScheduleHelper.createScheduleHelper();

        scheduleHelper.registerSchedule(new Schedule() {
            @Override
            public void run() {
                MessageSendService messageService = (MessageSendService)SpringUtils.getBean(MessageSendService.class);

                messageService.fetchMessageNotSend();
            }
        }, ScheduleConstant.SECOND, ScheduleConstant.SECOND * 5);
    }
}

