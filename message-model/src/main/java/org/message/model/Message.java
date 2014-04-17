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
package org.message.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 功能说明
 * 
 * @author 冯剑涛
 * @version 1.0
 * @since 2014年4月17日
 */
@Entity
@Table(name = "SYS_SMS")
public class Message implements Serializable {
	
	private static final long serialVersionUID = 302165869068501008L;

	/**
	 * ID
	 */
	@Id
    @Column(name = "ID")
	private long id;
	
	/**
	 * 电话号码
	 */
    @Column(name = "phone")
	private String phone;
	
    /**
     * 短信文本内容
     */
    @Column(name = "text")
	private String text;
	
    /**
     * 创建时间
     */
    @Column(name = "create_date")    
	private Date createDate;
	
    /**
     * 状态
     * 	0.未发送
     * 	1.已发送
     */
    @Column(name = "state")
	private int state;
	
    /**
     * 发送日期
     */
    @Column(name = "send_date")
	private Date sendDate;
	
    /**
     * 创建人名称
     */
    @Column(name = "create_user")
	private String createUser;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
}
