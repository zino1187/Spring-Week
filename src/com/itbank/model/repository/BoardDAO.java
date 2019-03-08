package com.itbank.model.repository;

import java.util.List;

import com.itbank.domain.Board;

public interface BoardDAO {
	public void insert(Board board);
	public List selectAll();
	public Board select(int board_id);
	public void reply(Board board);
	public void update(Board board);
	public void delete(int board_id);
}
