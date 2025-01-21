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


import com.dao.DiscusschongdianzhuangDao;
import com.entity.DiscusschongdianzhuangEntity;
import com.service.DiscusschongdianzhuangService;
import com.entity.vo.DiscusschongdianzhuangVO;
import com.entity.view.DiscusschongdianzhuangView;

@Service("discusschongdianzhuangService")
public class DiscusschongdianzhuangServiceImpl extends ServiceImpl<DiscusschongdianzhuangDao, DiscusschongdianzhuangEntity> implements DiscusschongdianzhuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschongdianzhuangEntity> page = this.selectPage(
                new Query<DiscusschongdianzhuangEntity>(params).getPage(),
                new EntityWrapper<DiscusschongdianzhuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschongdianzhuangEntity> wrapper) {
		  Page<DiscusschongdianzhuangView> page =new Query<DiscusschongdianzhuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschongdianzhuangVO> selectListVO(Wrapper<DiscusschongdianzhuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschongdianzhuangVO selectVO(Wrapper<DiscusschongdianzhuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschongdianzhuangView> selectListView(Wrapper<DiscusschongdianzhuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschongdianzhuangView selectView(Wrapper<DiscusschongdianzhuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
