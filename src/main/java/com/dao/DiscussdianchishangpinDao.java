package com.dao;

import com.entity.DiscussdianchishangpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdianchishangpinVO;
import com.entity.view.DiscussdianchishangpinView;


/**
 * 电池商品评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-10 22:52:07
 */
public interface DiscussdianchishangpinDao extends BaseMapper<DiscussdianchishangpinEntity> {
	
	List<DiscussdianchishangpinVO> selectListVO(@Param("ew") Wrapper<DiscussdianchishangpinEntity> wrapper);
	
	DiscussdianchishangpinVO selectVO(@Param("ew") Wrapper<DiscussdianchishangpinEntity> wrapper);
	
	List<DiscussdianchishangpinView> selectListView(@Param("ew") Wrapper<DiscussdianchishangpinEntity> wrapper);

	List<DiscussdianchishangpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdianchishangpinEntity> wrapper);
	
	DiscussdianchishangpinView selectView(@Param("ew") Wrapper<DiscussdianchishangpinEntity> wrapper);
	

}
