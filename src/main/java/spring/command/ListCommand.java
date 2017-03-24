package spring.command;

import java.util.List;

public class ListCommand {

	private List<WriteCommand> writeCommands;
	private int pageTotalNum;
	private int startPage;
	private int endPage;
	
	
	public void setWriteCommands(List<WriteCommand> writeCommands) {
		this.writeCommands = writeCommands;
	}
	public int getPageTotalNum() {
		return pageTotalNum;
	}
	public void setPageTotalNum(int pageTotalNum) {
		this.pageTotalNum = pageTotalNum;
	}
	public int getStartPage() {
		return startPage;
	}
	public List<WriteCommand> getWriteCommands() {
		return writeCommands;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	
	
	
	
	
}
