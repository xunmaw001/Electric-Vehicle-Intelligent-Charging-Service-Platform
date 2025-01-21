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
 * 配送信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
@TableName("peisongxinxi")
public class PeisongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeisongxinxiEntity() {
		
	}
	
	public PeisongxinxiEntity(T t) {
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
					
	private String danjia;
	
	/**
	 * 数量
	 */
					
	private String shuliang;
	
	/**
	 * 金额
	 */
					
	private String jine;
	
	/**
	 * 品牌
	 */
					
	private String pinpai;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 收货地址
	 */
					
	private String shouhuodizhi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 下单时间
	 */
					
	private String xiadanshijian;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	/**
	 * 物流状态
	 */
					
	private String wuliuzhuangtai;
	
	/**
	 * 物流详情
	 */
					
	private String wuliuxiangqing;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	public void setDanjia(String danjia) {
		this.danjia = danjia;
	}
	/**
	 * 获取：单价
	 */
	public String getDanjia() {
		return danjia;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：金额
	 */
	public void setJine(String jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public String getJine() {
		return jine;
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
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：收货地址
	 */
	public void setShouhuodizhi(String shouhuodizhi) {
		this.shouhuodizhi = shouhuodizhi;
	}
	/**
	 * 获取：收货地址
	 */
	public String getShouhuodizhi() {
		return shouhuodizhi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：下单时间
	 */
	public void setXiadanshijian(String xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	/**
	 * 获取：下单时间
	 */
	public String getXiadanshijian() {
		return xiadanshijian;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
	/**
	 * 设置：物流状态
	 */
	public void setWuliuzhuangtai(String wuliuzhuangtai) {
		this.wuliuzhuangtai = wuliuzhuangtai;
	}
	/**
	 * 获取：物流状态
	 */
	public String getWuliuzhuangtai() {
		return wuliuzhuangtai;
	}
	/**
	 * 设置：物流详情
	 */
	public void setWuliuxiangqing(String wuliuxiangqing) {
		this.wuliuxiangqing = wuliuxiangqing;
	}
	/**
	 * 获取：物流详情
	 */
	public String getWuliuxiangqing() {
		return wuliuxiangqing;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
