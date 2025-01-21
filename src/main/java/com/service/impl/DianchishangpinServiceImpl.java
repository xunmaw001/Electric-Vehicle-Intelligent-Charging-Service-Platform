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


import com.dao.DianchishangpinDao;
import com.entity.DianchishangpinEntity;
import com.service.DianchishangpinService;
import com.entity.vo.DianchishangpinVO;
import com.entity.view.DianchishangpinView;

@Service("dianchishangpinService")
public class DianchishangpinServiceImpl extends ServiceImpl<DianchishangpinDao, DianchishangpinEntity> implements DianchishangpinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianchishangpinEntity> page = this.selectPage(
                new Query<DianchishangpinEntity>(params).getPage(),
                new EntityWrapper<DianchishangpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianchishangpinEntity> wrapper) {
		  Page<DianchishangpinView> page =new Query<DianchishangpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianchishangpinVO> selectListVO(Wrapper<DianchishangpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianchishangpinVO selectVO(Wrapper<DianchishangpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianchishangpinView> selectListView(Wrapper<DianchishangpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianchishangpinView selectView(Wrapper<DianchishangpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
