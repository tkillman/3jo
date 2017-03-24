package spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.DAO.WriteDao;
import spring.command.ListCommand;
import spring.command.WriteCommand;

@Controller
@RequestMapping("/update/writeForm.do")
public class writeController {

	@Autowired
	WriteDao writeDao;
	
	
	public void setWriteDao(WriteDao writeDao) {
		this.writeDao = writeDao;
	}


	@RequestMapping(method = RequestMethod.GET)
	public String form(Model model){
		
		WriteCommand writeCommand = new WriteCommand();
		
		model.addAttribute("writeCommand", writeCommand);
		return "writeForm";
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(WriteCommand writeCommand, Model model){
		
		//글을 집어넣고
		writeDao.write(writeCommand);
		

		//listCommand 객체를 넘겨준다
		ListCommand writeList = new ListCommand();
		
		
		writeList.setWriteCommands(writeDao.getList()); 
		writeList.setStartPage(1);
		writeList.setEndPage(2);
		writeList.setPageTotalNum(10);
		
		model.addAttribute("writeList", writeList);
		
		
		return "list";
		
	}
	
	
}
