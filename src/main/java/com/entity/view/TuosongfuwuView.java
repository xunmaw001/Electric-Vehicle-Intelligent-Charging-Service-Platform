package com.entity.view;

import com.entity.TuosongfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 托送服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
@TableName("tuosongfuwu")
public class TuosongfuwuView  extends TuosongfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuosongfuwuView(){
	}
 
 	public TuosongfuwuView(TuosongfuwuEntity tuosongfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, tuosongfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
