package com.he0303.test.service;

import com.he0303.test.dao.UserDao;
import com.he0303.test.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lhq
 * @version $Id: DUMMY $
 */
@Service
@Transactional(readOnly = true)
public class UserService {
	@Resource
	private UserDao userDao;


	public List<User>  getAll () {
		return userDao.getAll();
	}
}
