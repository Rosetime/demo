package com.oracle.dao;

import java.util.List;

import com.oracle.domain.Stu;

public interface StuMapper {
	public List<Stu> search(Integer sid);
}
