package com.dao;

import com.entity.DiscusstuosongfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstuosongfuwuVO;
import com.entity.view.DiscusstuosongfuwuView;


/**
 * 托送服务评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-10 22:52:07
 */
public interface DiscusstuosongfuwuDao extends BaseMapper<DiscusstuosongfuwuEntity> {
	
	List<DiscusstuosongfuwuVO> selectListVO(@Param("ew") Wrapper<DiscusstuosongfuwuEntity> wrapper);
	
	DiscusstuosongfuwuVO selectVO(@Param("ew") Wrapper<DiscusstuosongfuwuEntity> wrapper);
	
	List<DiscusstuosongfuwuView> selectListView(@Param("ew") Wrapper<DiscusstuosongfuwuEntity> wrapper);

	List<DiscusstuosongfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstuosongfuwuEntity> wrapper);
	
	DiscusstuosongfuwuView selectView(@Param("ew") Wrapper<DiscusstuosongfuwuEntity> wrapper);
	

}
