package net.zinlinphyo.simplehabitmedation.events;

import net.zinlinphyo.simplehabitmedation.data.vo.HomeScreenVO;

import java.util.List;

public class DataReadyEvent {
	private List<HomeScreenVO> loadHomeScreen;

	public DataReadyEvent(List<HomeScreenVO> loadHomeScreen){
		this.loadHomeScreen = loadHomeScreen;
	}

	public List<HomeScreenVO> getLoadHomeScreen(){
		return loadHomeScreen;
	}
}
