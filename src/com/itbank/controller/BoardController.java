package com.itbank.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.domain.Board;
import com.itbank.exception.RegistFailException;
import com.itbank.model.service.BoardService;

@Controller
@RequestMapping("board")
public class BoardController {
	Logger logger=Logger.getLogger(this.getClass().getName());
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String test(Model model) {
		logger.debug("게시판 목록 요청을 받았네요");
		List list=boardService.selectAll();
		model.addAttribute("boardList", list);
		return "board/list";
	}
	
	@RequestMapping(value="/write", method=RequestMethod.POST)
	public String insert(Board board) {
		boardService.insert(board);
		return "redirect:/board/list";
	}
	
	@ExceptionHandler(RuntimeException.class)
	public ModelAndView handleException(RuntimeException e) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("error", e);
		mav.setViewName("board/error");
		return mav;
	}
	
}



