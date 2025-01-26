package com.entity.model;

import com.entity.JiankongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 监控信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-09-08 14:49:58
 */
public class JiankongxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 监控封面
	 */
	
	private String jiankongfengmian;
		
	/**
	 * 监控视频
	 */
	
	private String jiankongshipin;
		
	/**
	 * 监控时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiankongshijian;
		
	/**
	 * 监控说明
	 */
	
	private String jiankongshuoming;
				
	
	/**
	 * 设置：监控封面
	 */
	 
	public void setJiankongfengmian(String jiankongfengmian) {
		this.jiankongfengmian = jiankongfengmian;
	}
	
	/**
	 * 获取：监控封面
	 */
	public String getJiankongfengmian() {
		return jiankongfengmian;
	}
				
	
	/**
	 * 设置：监控视频
	 */
	 
	public void setJiankongshipin(String jiankongshipin) {
		this.jiankongshipin = jiankongshipin;
	}
	
	/**
	 * 获取：监控视频
	 */
	public String getJiankongshipin() {
		return jiankongshipin;
	}
				
	
	/**
	 * 设置：监控时间
	 */
	 
	public void setJiankongshijian(Date jiankongshijian) {
		this.jiankongshijian = jiankongshijian;
	}
	
	/**
	 * 获取：监控时间
	 */
	public Date getJiankongshijian() {
		return jiankongshijian;
	}
				
	
	/**
	 * 设置：监控说明
	 */
	 
	public void setJiankongshuoming(String jiankongshuoming) {
		this.jiankongshuoming = jiankongshuoming;
	}
	
	/**
	 * 获取：监控说明
	 */
	public String getJiankongshuoming() {
		return jiankongshuoming;
	}
			
}
