package com.entity.view;

import com.entity.ChongdianzhuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 充电桩
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
@TableName("chongdianzhuang")
public class ChongdianzhuangView  extends ChongdianzhuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChongdianzhuangView(){
	}
 
 	public ChongdianzhuangView(ChongdianzhuangEntity chongdianzhuangEntity){
 	try {
			BeanUtils.copyProperties(this, chongdianzhuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
