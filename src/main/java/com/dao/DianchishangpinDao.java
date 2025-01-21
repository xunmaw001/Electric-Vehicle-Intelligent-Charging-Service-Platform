package com.dao;

import com.entity.DianchishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianchishangpinVO;
import com.entity.view.DianchishangpinView;


/**
 * 电池商品
 * 
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
public interface DianchishangpinDao extends BaseMapper<DianchishangpinEntity> {
	
	List<DianchishangpinVO> selectListVO(@Param("ew") Wrapper<DianchishangpinEntity> wrapper);
	
	DianchishangpinVO selectVO(@Param("ew") Wrapper<DianchishangpinEntity> wrapper);
	
	List<DianchishangpinView> selectListView(@Param("ew") Wrapper<DianchishangpinEntity> wrapper);

	List<DianchishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DianchishangpinEntity> wrapper);
	
	DianchishangpinView selectView(@Param("ew") Wrapper<DianchishangpinEntity> wrapper);
	

}
