package com.entity.vo;

import com.entity.DianchishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 电池商品
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
public class DianchishangpinVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 电池封面
	 */
	
	private String dianchifengmian;
		
	/**
	 * 电池容量
	 */
	
	private String dianchirongliang;
		
	/**
	 * 单价
	 */
	
	private Integer danjia;
		
	/**
	 * 品牌
	 */
	
	private String pinpai;
		
	/**
	 * 电池简介
	 */
	
	private String dianchijianjie;
				
	
	/**
	 * 设置：电池封面
	 */
	 
	public void setDianchifengmian(String dianchifengmian) {
		this.dianchifengmian = dianchifengmian;
	}
	
	/**
	 * 获取：电池封面
	 */
	public String getDianchifengmian() {
		return dianchifengmian;
	}
				
	
	/**
	 * 设置：电池容量
	 */
	 
	public void setDianchirongliang(String dianchirongliang) {
		this.dianchirongliang = dianchirongliang;
	}
	
	/**
	 * 获取：电池容量
	 */
	public String getDianchirongliang() {
		return dianchirongliang;
	}
				
	
	/**
	 * 设置：单价
	 */
	 
	public void setDanjia(Integer danjia) {
		this.danjia = danjia;
	}
	
	/**
	 * 获取：单价
	 */
	public Integer getDanjia() {
		return danjia;
	}
				
	
	/**
	 * 设置：品牌
	 */
	 
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	
	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}
				
	
	/**
	 * 设置：电池简介
	 */
	 
	public void setDianchijianjie(String dianchijianjie) {
		this.dianchijianjie = dianchijianjie;
	}
	
	/**
	 * 获取：电池简介
	 */
	public String getDianchijianjie() {
		return dianchijianjie;
	}
			
}
