package com.dao;

import com.entity.TuosongfuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuosongfuwuVO;
import com.entity.view.TuosongfuwuView;


/**
 * 托送服务
 * 
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
public interface TuosongfuwuDao extends BaseMapper<TuosongfuwuEntity> {
	
	List<TuosongfuwuVO> selectListVO(@Param("ew") Wrapper<TuosongfuwuEntity> wrapper);
	
	TuosongfuwuVO selectVO(@Param("ew") Wrapper<TuosongfuwuEntity> wrapper);
	
	List<TuosongfuwuView> selectListView(@Param("ew") Wrapper<TuosongfuwuEntity> wrapper);

	List<TuosongfuwuView> selectListView(Pagination page,@Param("ew") Wrapper<TuosongfuwuEntity> wrapper);
	
	TuosongfuwuView selectView(@Param("ew") Wrapper<TuosongfuwuEntity> wrapper);
	

}
