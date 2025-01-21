package com.entity.view;

import com.entity.DiscussdianchishangpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电池商品评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-10 22:52:07
 */
@TableName("discussdianchishangpin")
public class DiscussdianchishangpinView  extends DiscussdianchishangpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdianchishangpinView(){
	}
 
 	public DiscussdianchishangpinView(DiscussdianchishangpinEntity discussdianchishangpinEntity){
 	try {
			BeanUtils.copyProperties(this, discussdianchishangpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
