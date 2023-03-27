package com.itlee.quickstart;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itlee.quickstart.dao.UserDao;
import com.itlee.quickstart.domin.User;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.print.Book;
import java.util.List;

@SpringBootTest
class QuickstartApplicationTests {

	@Autowired
	private UserDao userDao;

	@Test
	void testSave(){
		User user = new User();
		user.setId(6);
		user.setName("张三");
		user.setAge(18);
		user.setEmail("123@qq.com");
		userDao.insert(user);
	}
	@Test
	void testUpdate() {
		User user = new User();
		user.setId(6);
		user.setName("张三1");
		user.setAge(19);
		user.setEmail("456@qq.com");
		userDao.updateById(user);
	}

	@Test
	void testDelete(){
		userDao.deleteById(6);
	}

	@Test
	void testGetAll(){
		List<User> users = userDao.selectList(null);
		System.out.println(users);
	}

	@Test
	void testGetPage() {
		IPage page = new Page(2, 3);
		IPage pages =  userDao.selectPage(page,null);
		System.out.println(pages.getPages());
		System.out.println(pages.getCurrent());
		System.out.println(pages.getSize());
		System.out.println(pages.getTotal());
		System.out.println(pages.getRecords());
	}

	@Test
	void testGetBy(){
		String name = "jon";
		LambdaQueryWrapper<User> qw = new LambdaQueryWrapper<>();
		qw.like(Strings.isNotEmpty(name), User::getName, name);
		userDao.selectList(qw);
	}
}
