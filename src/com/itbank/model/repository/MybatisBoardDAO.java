package com.itbank.model.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itbank.domain.Board;
import com.itbank.exception.RegistFailException;
@Repository
public class MybatisBoardDAO implements BoardDAO{
	@Autowired
	private SqlSessionTemplate sessionTemplate;
	
	@Override
	public void insert(Board board) throws RegistFailException{
		int result=sessionTemplate.insert("Board.insert", board);
		if(result==0) {
			throw new RegistFailException("게시판 글 등록 실패");
		}
	}

	@Override
	public List selectAll() {
		List list=null;
		list=sessionTemplate.selectList("Board.selectAll");
		System.out.println("MybatisBoardDAO selectAll 호출됨");
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
