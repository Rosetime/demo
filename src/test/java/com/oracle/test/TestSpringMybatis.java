package com.oracle.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oracle.dao.StuMapper;
import com.oracle.domain.Stu;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class TestSpringMybatis {
	
	@Autowired
	private StuMapper stumapper;

	@Test
	public void test() {
		List<Stu> stuList = stumapper.search(2);
		
		for (Stu stu : stuList) { 
			System.out.println(stu.getSid()+"\t"+stu.getSname()); 
			}
		
	}
}
