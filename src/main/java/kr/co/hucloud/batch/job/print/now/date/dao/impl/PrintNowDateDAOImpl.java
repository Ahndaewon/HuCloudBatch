package kr.co.hucloud.batch.job.print.now.date.dao.impl;

import kr.co.hucloud.batch.job.print.now.date.dao.PrintNowDateDAO;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

public class PrintNowDateDAOImpl extends SqlSessionDaoSupport implements PrintNowDateDAO {

	@Override
	public String getNowDate() {
		//return getSqlSession().selectOne("printNowDateDAO.getSystemDate");
		return "!!!";
	}
	
}
