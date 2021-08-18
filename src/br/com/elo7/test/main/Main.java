package br.com.elo7.test.main;

import br.com.elo7.test.bean.Direction;

public class Main {

	public static void main(String... args) {
		System.out.println("TEste");
	///	System.out.println(Direction.W.next());
		//System.out.println(Direction.W.previous());
		System.out.println(Direction.valueOf("N").getIncrement());
		System.out.println(Direction.valueOf("E").getIncrement());
		System.out.println(Direction.valueOf("S").getIncrement());
		System.out.println(Direction.valueOf("W").getIncrement());
		System.out.println();
		System.out.println();
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
	}
	
	public void startPl
}
