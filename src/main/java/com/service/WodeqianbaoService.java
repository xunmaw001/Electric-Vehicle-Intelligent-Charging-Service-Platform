package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodeqianbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodeqianbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodeqianbaoView;


/**
 * 我的钱包
 *
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
public interface WodeqianbaoService extends IService<WodeqianbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodeqianbaoVO> selectListVO(Wrapper<WodeqianbaoEntity> wrapper);
   	
   	WodeqianbaoVO selectVO(@Param("ew") Wrapper<WodeqianbaoEntity> wrapper);
   	
   	List<WodeqianbaoView> selectListView(Wrapper<WodeqianbaoEntity> wrapper);
   	
   	WodeqianbaoView selectView(@Param("ew") Wrapper<WodeqianbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodeqianbaoEntity> wrapper);
   	

}

