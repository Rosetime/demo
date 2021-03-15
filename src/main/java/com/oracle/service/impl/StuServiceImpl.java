package com.oracle.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.oracle.dao.StuMapper;
import com.oracle.domain.Stu;
import com.oracle.service.StuService;

/**
 * 学生业务的实现类
 * 
 * @author Liuhaoyu
 *
 */
@Service
public class StuServiceImpl implements StuService {
	
	// 导入dao接口
	@Resource
	private StuMapper stuMapper;
	
	@Override
	public Stu search(Integer sid) {
		// TODO Auto-generated method stub
		Stu stu = null;
		stu = (Stu) this.stuMapper.search(sid);

		// 需要对stu对象进行友好性的判断
		if (stu != null) {
			
			System.out.println(stu.getSname());
		}
		return stu;
	}
}
