package spring.DAO;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import spring.command.WriteCommand;

public class WriteDao extends SqlSessionDaoSupport {
	
	public int write(WriteCommand writeCommand){
		
		int check = getSqlSession().insert("board.write", writeCommand);
		
		return check;
		
	}
	
	public List<WriteCommand> getList() {
		
		List<WriteCommand> writeCommands = getSqlSession().selectList("board.getList");
		
		return writeCommands;
		
	}

}
