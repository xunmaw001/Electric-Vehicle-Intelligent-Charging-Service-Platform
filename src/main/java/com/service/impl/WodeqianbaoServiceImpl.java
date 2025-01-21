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


import com.dao.WodeqianbaoDao;
import com.entity.WodeqianbaoEntity;
import com.service.WodeqianbaoService;
import com.entity.vo.WodeqianbaoVO;
import com.entity.view.WodeqianbaoView;

@Service("wodeqianbaoService")
public class WodeqianbaoServiceImpl extends ServiceImpl<WodeqianbaoDao, WodeqianbaoEntity> implements WodeqianbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodeqianbaoEntity> page = this.selectPage(
                new Query<WodeqianbaoEntity>(params).getPage(),
                new EntityWrapper<WodeqianbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodeqianbaoEntity> wrapper) {
		  Page<WodeqianbaoView> page =new Query<WodeqianbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodeqianbaoVO> selectListVO(Wrapper<WodeqianbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodeqianbaoVO selectVO(Wrapper<WodeqianbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodeqianbaoView> selectListView(Wrapper<WodeqianbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodeqianbaoView selectView(Wrapper<WodeqianbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
