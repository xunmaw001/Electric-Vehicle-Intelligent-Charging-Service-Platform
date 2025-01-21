package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 电池商品
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
@TableName("dianchishangpin")
public class DianchishangpinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DianchishangpinEntity() {
		
	}
	
	public DianchishangpinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 电池型号
	 */
					
	private String dianchixinghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：电池型号
	 */
	public void setDianchixinghao(String dianchixinghao) {
		this.dianchixinghao = dianchixinghao;
	}
	/**
	 * 获取：电池型号
	 */
	public String getDianchixinghao() {
		return dianchixinghao;
	}
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
