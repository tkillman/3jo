package spring.DAO;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring.command.WriteCommand;

public class WriteDao extends SqlSessionDaoSupport {
	
	public int write(WriteCommand writeCommand){
		
		int check = getSqlSession().insert("board.write", writeCommand);
		
		return check;
		
	}

}
