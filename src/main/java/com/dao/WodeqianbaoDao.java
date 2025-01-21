package com.dao;

import com.entity.WodeqianbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodeqianbaoVO;
import com.entity.view.WodeqianbaoView;


/**
 * 我的钱包
 * 
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
public interface WodeqianbaoDao extends BaseMapper<WodeqianbaoEntity> {
	
	List<WodeqianbaoVO> selectListVO(@Param("ew") Wrapper<WodeqianbaoEntity> wrapper);
	
	WodeqianbaoVO selectVO(@Param("ew") Wrapper<WodeqianbaoEntity> wrapper);
	
	List<WodeqianbaoView> selectListView(@Param("ew") Wrapper<WodeqianbaoEntity> wrapper);

	List<WodeqianbaoView> selectListView(Pagination page,@Param("ew") Wrapper<WodeqianbaoEntity> wrapper);
	
	WodeqianbaoView selectView(@Param("ew") Wrapper<WodeqianbaoEntity> wrapper);
	

}
