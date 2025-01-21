package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstuosongfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstuosongfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstuosongfuwuView;


/**
 * 托送服务评论表
 *
 * @author 
 * @email 
 * @date 2022-04-10 22:52:07
 */
public interface DiscusstuosongfuwuService extends IService<DiscusstuosongfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstuosongfuwuVO> selectListVO(Wrapper<DiscusstuosongfuwuEntity> wrapper);
   	
   	DiscusstuosongfuwuVO selectVO(@Param("ew") Wrapper<DiscusstuosongfuwuEntity> wrapper);
   	
   	List<DiscusstuosongfuwuView> selectListView(Wrapper<DiscusstuosongfuwuEntity> wrapper);
   	
   	DiscusstuosongfuwuView selectView(@Param("ew") Wrapper<DiscusstuosongfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstuosongfuwuEntity> wrapper);
   	

}

