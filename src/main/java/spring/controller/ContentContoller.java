package spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spring.DAO.ContentDao;
import spring.command.WriteCommand;

@Controller
@RequestMapping("/contentView.do")
public class ContentContoller {
	
	@Autowired
	ContentDao contentDao;
	
	public void setContentDao(ContentDao contentDao) {
		this.contentDao = contentDao;
	}


	@RequestMapping(method = RequestMethod.GET)
	public String contentView(@RequestParam("num") int num, Model model) {
		
		WriteCommand writeCommand = new WriteCommand();
		
		writeCommand = contentDao.getContent(num);
		
		model.addAttribute("contentView", writeCommand);
		
		return "contentView";
	}

}
