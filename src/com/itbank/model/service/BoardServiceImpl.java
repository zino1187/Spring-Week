package com.itbank.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.itbank.domain.Board;
import com.itbank.exception.RegistFailException;
import com.itbank.model.repository.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	@Qualifier("mybatisBoardDAO")
	private BoardDAO boardDAO;
	
	@Override
	public void insert(Board board) throws RegistFailException{
		boardDAO.insert(board);
	}

	@Override
	public List selectAll() {
		System.out.println("BoardServiceImpl selectAll »£√‚µ ");
		List list=null;
		list=boardDAO.selectAll();
		return list;
	}

	@Override
	public Board select(int board_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reply(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Board board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int board_id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
