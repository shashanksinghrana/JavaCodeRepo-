package co.io.test;

import java.awt.Color;

public enum Suit {
	DIAMOND(Color.BLACK),
	HEART(Color.BLACK),
	SPADE(Color.BLACK),
	CLUB(Color.BLACK);
	
	private Color color;
	
	Suit(Color color){
		this.color = color;
	}
	@Override
	public String toString(){
		return "Suit{"+"color="+color+'}';
	}
	public static void main(String[] args) {
		
	}
	
}
