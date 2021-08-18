package br.com.elo7.test.bean;

import br.com.elo7.test.constants.Constants;

public class Probe {

	private int x;
	private int y;
	private Direction direction;
	private Planet planet;

	public Probe(int x, int y, Direction direction, Planet planet) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.planet = planet;
	}

	private void move() {

		int xToVerify = getX();
		int yToVerify = getY();

		switch (direction) {
		case N:
		case S:
			xToVerify = direction.getIncrement();
			break;
		case W:
		case E:
			yToVerify = direction.getIncrement();
			break;
		// default:
		// throw new IllegalArgumentException("Unexpected value: " + direction);
		// TODO: Lançar exception??
		}

		if (planet.canMove(xToVerify, yToVerify)) {
			setX(xToVerify);
			setY(yToVerify);
		} else {
			// TODO: Lançar exception??
		}

	}

	public void doAction(String action) {
		if (Constants.MOVE.equalsIgnoreCase(action)) {
			move();
		} else {
			switchDirection(action);
		}
	}

	private void switchDirection(String action) {
		if (Constants.LEFT.equalsIgnoreCase(action)) {
			direction = direction.previous();
		} else {
			direction = direction.next();
		}
	}

	private String showPosition() {
		return String.format("%d %d %s", getX(), getY(), getDirection().getValue());
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
