package com.entity.view;

import com.entity.WodeqianbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的钱包
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
@TableName("wodeqianbao")
public class WodeqianbaoView  extends WodeqianbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodeqianbaoView(){
	}
 
 	public WodeqianbaoView(WodeqianbaoEntity wodeqianbaoEntity){
 	try {
			BeanUtils.copyProperties(this, wodeqianbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
