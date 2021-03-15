package com.oracle.test;

import java.io.IOException; 
import java.util.List;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession; 
import org.apache.ibatis.session.SqlSessionFactory; 
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.oracle.dao.StuMapper; 
import com.oracle.domain.Stu;

public class TestMybatis {
	@Test 
	public void testsearch() throws IOException {
		String resource="mybatis-config.xml";
			SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
			SqlSession session=sf.openSession();
			List<Stu> stuList=session.getMapper(StuMapper.class).search(2);
			for (Stu stu : stuList) { 
				System.out.println(stu.getSid()+"\t"+stu.getSname()); 
				}
	}

}
