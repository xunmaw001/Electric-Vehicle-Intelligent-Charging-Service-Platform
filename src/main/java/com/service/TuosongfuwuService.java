package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuosongfuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuosongfuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuosongfuwuView;


/**
 * 托送服务
 *
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
public interface TuosongfuwuService extends IService<TuosongfuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuosongfuwuVO> selectListVO(Wrapper<TuosongfuwuEntity> wrapper);
   	
   	TuosongfuwuVO selectVO(@Param("ew") Wrapper<TuosongfuwuEntity> wrapper);
   	
   	List<TuosongfuwuView> selectListView(Wrapper<TuosongfuwuEntity> wrapper);
   	
   	TuosongfuwuView selectView(@Param("ew") Wrapper<TuosongfuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuosongfuwuEntity> wrapper);
   	

}

