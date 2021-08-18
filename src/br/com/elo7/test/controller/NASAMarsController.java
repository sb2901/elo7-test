package br.com.elo7.test.controller;

import br.com.elo7.test.bean.Mars;
import br.com.elo7.test.bean.Planet;

public class NASAMarsController {

	private Planet planet;

	public void definePlanet(int width, int height) {
		planet = new Mars(width, height);
	}

	private void processListAction() {

	}

	private void createProbe() {

	}

}
