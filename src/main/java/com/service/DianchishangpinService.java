package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianchishangpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianchishangpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianchishangpinView;


/**
 * 电池商品
 *
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
public interface DianchishangpinService extends IService<DianchishangpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianchishangpinVO> selectListVO(Wrapper<DianchishangpinEntity> wrapper);
   	
   	DianchishangpinVO selectVO(@Param("ew") Wrapper<DianchishangpinEntity> wrapper);
   	
   	List<DianchishangpinView> selectListView(Wrapper<DianchishangpinEntity> wrapper);
   	
   	DianchishangpinView selectView(@Param("ew") Wrapper<DianchishangpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianchishangpinEntity> wrapper);
   	

}

