package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdianchishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdianchishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdianchishangpinView;


/**
 * 电池商品评论表
 *
 * @author 
 * @email 
 * @date 2022-04-10 22:52:07
 */
public interface DiscussdianchishangpinService extends IService<DiscussdianchishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdianchishangpinVO> selectListVO(Wrapper<DiscussdianchishangpinEntity> wrapper);
   	
   	DiscussdianchishangpinVO selectVO(@Param("ew") Wrapper<DiscussdianchishangpinEntity> wrapper);
   	
   	List<DiscussdianchishangpinView> selectListView(Wrapper<DiscussdianchishangpinEntity> wrapper);
   	
   	DiscussdianchishangpinView selectView(@Param("ew") Wrapper<DiscussdianchishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdianchishangpinEntity> wrapper);
   	

}

