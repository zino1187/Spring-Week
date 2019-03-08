package com.itbank.model.service;

import java.util.List;

import com.itbank.domain.Board;

public interface BoardService {
	public void insert(Board board);
	public List selectAll();
	public Board select(int board_id);
	public void reply(Board board);
	public void update(Board board);
	public void delete(int board_id);

}
