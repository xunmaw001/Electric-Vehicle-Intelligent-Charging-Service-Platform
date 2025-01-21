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


import com.dao.DiscusstuosongfuwuDao;
import com.entity.DiscusstuosongfuwuEntity;
import com.service.DiscusstuosongfuwuService;
import com.entity.vo.DiscusstuosongfuwuVO;
import com.entity.view.DiscusstuosongfuwuView;

@Service("discusstuosongfuwuService")
public class DiscusstuosongfuwuServiceImpl extends ServiceImpl<DiscusstuosongfuwuDao, DiscusstuosongfuwuEntity> implements DiscusstuosongfuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusstuosongfuwuEntity> page = this.selectPage(
                new Query<DiscusstuosongfuwuEntity>(params).getPage(),
                new EntityWrapper<DiscusstuosongfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusstuosongfuwuEntity> wrapper) {
		  Page<DiscusstuosongfuwuView> page =new Query<DiscusstuosongfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusstuosongfuwuVO> selectListVO(Wrapper<DiscusstuosongfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusstuosongfuwuVO selectVO(Wrapper<DiscusstuosongfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusstuosongfuwuView> selectListView(Wrapper<DiscusstuosongfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusstuosongfuwuView selectView(Wrapper<DiscusstuosongfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
