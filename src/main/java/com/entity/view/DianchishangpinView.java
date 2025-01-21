package com.entity.view;

import com.entity.DianchishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电池商品
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
@TableName("dianchishangpin")
public class DianchishangpinView  extends DianchishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianchishangpinView(){
	}
 
 	public DianchishangpinView(DianchishangpinEntity dianchishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, dianchishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
