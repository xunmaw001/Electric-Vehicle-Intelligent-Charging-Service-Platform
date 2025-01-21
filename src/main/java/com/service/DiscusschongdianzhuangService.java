package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschongdianzhuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschongdianzhuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschongdianzhuangView;


/**
 * 充电桩评论表
 *
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
public interface DiscusschongdianzhuangService extends IService<DiscusschongdianzhuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschongdianzhuangVO> selectListVO(Wrapper<DiscusschongdianzhuangEntity> wrapper);
   	
   	DiscusschongdianzhuangVO selectVO(@Param("ew") Wrapper<DiscusschongdianzhuangEntity> wrapper);
   	
   	List<DiscusschongdianzhuangView> selectListView(Wrapper<DiscusschongdianzhuangEntity> wrapper);
   	
   	DiscusschongdianzhuangView selectView(@Param("ew") Wrapper<DiscusschongdianzhuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschongdianzhuangEntity> wrapper);
   	

}

