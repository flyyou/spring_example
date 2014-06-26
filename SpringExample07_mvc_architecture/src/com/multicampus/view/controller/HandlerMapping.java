package com.multicampus.view.controller;

import java.util.HashMap;

import com.multicampus.view.board.controller.GetBoardListController;

public class HandlerMapping {
	private HashMap<String, Controller> mappings;
	
	public HandlerMapping(){
		mappings = new HashMap<String, Controller>();
		initConfig();
	}

	private void initConfig() {
		mappings.put("/getBoardList.do", new GetBoardListController());
	}

	public Controller getController(String path) {
		return mappings.get(path);
	}
}
