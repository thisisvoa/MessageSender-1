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
package org.message.schedule;

import org.message.schedule.constant.ScheduleConstant;

import com.message.schedule.Schedule;
import com.message.schedule.ScheduleHelper;

/**
 * 功能说明
 * 
 * @author 冯剑涛
 * @version 1.0
 * @since 2014年4月17日
 */
public class ScheduleTest {
	
	public void testRegisterSchedule() {
		ScheduleHelper scheduleHelper = ScheduleHelper.createScheduleHelper();
		
		scheduleHelper.registerSchedule( new Schedule() {

			@Override
			public void run() {
				System.out.println("test");
			}
			
		}, ScheduleConstant.SECOND, ScheduleConstant.SECOND * 3);
	}
	
	public static void main(String[] args) {
		new ScheduleTest().testRegisterSchedule();
	}
}

