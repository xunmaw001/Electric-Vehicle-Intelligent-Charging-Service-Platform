package com.dao;

import com.entity.DiscusschongdianzhuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschongdianzhuangVO;
import com.entity.view.DiscusschongdianzhuangView;


/**
 * 充电桩评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-10 22:52:06
 */
public interface DiscusschongdianzhuangDao extends BaseMapper<DiscusschongdianzhuangEntity> {
	
	List<DiscusschongdianzhuangVO> selectListVO(@Param("ew") Wrapper<DiscusschongdianzhuangEntity> wrapper);
	
	DiscusschongdianzhuangVO selectVO(@Param("ew") Wrapper<DiscusschongdianzhuangEntity> wrapper);
	
	List<DiscusschongdianzhuangView> selectListView(@Param("ew") Wrapper<DiscusschongdianzhuangEntity> wrapper);

	List<DiscusschongdianzhuangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschongdianzhuangEntity> wrapper);
	
	DiscusschongdianzhuangView selectView(@Param("ew") Wrapper<DiscusschongdianzhuangEntity> wrapper);
	

}
