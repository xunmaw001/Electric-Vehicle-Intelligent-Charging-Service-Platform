package com.entity.view;

import com.entity.DiscusstuosongfuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 托送服务评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 22:52:07
 */
@TableName("discusstuosongfuwu")
public class DiscusstuosongfuwuView  extends DiscusstuosongfuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstuosongfuwuView(){
	}
 
 	public DiscusstuosongfuwuView(DiscusstuosongfuwuEntity discusstuosongfuwuEntity){
 	try {
			BeanUtils.copyProperties(this, discusstuosongfuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
