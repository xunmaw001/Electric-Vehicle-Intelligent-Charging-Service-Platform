package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussdianchishangpinDao;
import com.entity.DiscussdianchishangpinEntity;
import com.service.DiscussdianchishangpinService;
import com.entity.vo.DiscussdianchishangpinVO;
import com.entity.view.DiscussdianchishangpinView;

@Service("discussdianchishangpinService")
public class DiscussdianchishangpinServiceImpl extends ServiceImpl<DiscussdianchishangpinDao, DiscussdianchishangpinEntity> implements DiscussdianchishangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdianchishangpinEntity> page = this.selectPage(
                new Query<DiscussdianchishangpinEntity>(params).getPage(),
                new EntityWrapper<DiscussdianchishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdianchishangpinEntity> wrapper) {
		  Page<DiscussdianchishangpinView> page =new Query<DiscussdianchishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdianchishangpinVO> selectListVO(Wrapper<DiscussdianchishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdianchishangpinVO selectVO(Wrapper<DiscussdianchishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdianchishangpinView> selectListView(Wrapper<DiscussdianchishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdianchishangpinView selectView(Wrapper<DiscussdianchishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
