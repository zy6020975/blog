package group.zhouyang.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import group.zhouyang.blog.mapper.UserMapper;
import group.zhouyang.blog.model.User;
import group.zhouyang.blog.model.UserExample;
import group.zhouyang.blog.model.UserExample.Criteria;
import group.zhouyang.blog.service.IUserService;
import lombok.extern.slf4j.Slf4j;

/** 
* @描述:
* @author 周阳 
* @date 创建时间：2018年5月18日 下午4:58:03
* @version v1.0
*/
@Service
@Slf4j
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void save(User t) {
		userMapper.insert(t);
		log.debug("插入成功！");
	}

	@Override
	public void saveAll(List<User> t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(List<User> t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> findById(int id) {
		UserExample userExample = new UserExample();
		Criteria criteria = userExample.createCriteria();
		criteria.andIdEqualTo(id);		
		return userMapper.selectByExample(userExample);
	}

}
