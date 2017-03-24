package spring.DAO;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring.command.WriteCommand;

public class ContentDao extends SqlSessionDaoSupport {
	
	public WriteCommand getContent(int num) {
		
		WriteCommand writeCommand;
		
		writeCommand = getSqlSession().selectOne("content.getContent", num);
		
		return writeCommand;
	}

}
