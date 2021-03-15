package com.oracle.service;

import com.oracle.domain.Stu;

/**
 * 学生业务
 * @author Liuhaoyu
 *
 */
public interface StuService {
	
	/**
	 * 业务方法，查询某一个学生信息
	 */
	public Stu search(Integer sid);
	
}
