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
package com.message.schedule;

import java.util.Timer;

/**
 * 功能说明
 * 
 * @author 冯剑涛
 * @version 1.0
 * @since 2014年4月17日
 */
public class ScheduleHelper {
	private Timer timer;
	
	public ScheduleHelper() {
		this.timer = new Timer();
	}
	
	public static ScheduleHelper createScheduleHelper() {
		return new ScheduleHelper();
	}
	
	public void registerSchedule(Schedule schedule, long time, long peroid) {
		timer.schedule(schedule, time, peroid);
	}
}

