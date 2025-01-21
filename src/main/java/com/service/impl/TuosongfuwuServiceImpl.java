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


import com.dao.TuosongfuwuDao;
import com.entity.TuosongfuwuEntity;
import com.service.TuosongfuwuService;
import com.entity.vo.TuosongfuwuVO;
import com.entity.view.TuosongfuwuView;

@Service("tuosongfuwuService")
public class TuosongfuwuServiceImpl extends ServiceImpl<TuosongfuwuDao, TuosongfuwuEntity> implements TuosongfuwuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuosongfuwuEntity> page = this.selectPage(
                new Query<TuosongfuwuEntity>(params).getPage(),
                new EntityWrapper<TuosongfuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuosongfuwuEntity> wrapper) {
		  Page<TuosongfuwuView> page =new Query<TuosongfuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuosongfuwuVO> selectListVO(Wrapper<TuosongfuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuosongfuwuVO selectVO(Wrapper<TuosongfuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuosongfuwuView> selectListView(Wrapper<TuosongfuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuosongfuwuView selectView(Wrapper<TuosongfuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
