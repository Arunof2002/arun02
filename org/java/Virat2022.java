package org.java;

public class Virat2022 extends ViratKohli {
	
	@Override
	public void Profession() {
		System.out.println("He is also play for Ipl for Royal Challegers Bangalore");
		super.Profession();
	}
	@Override
	public void Advertisemet() {
		System.out.println("He is also Brand Ambassador of Audi cars");
		super.Advertisemet();
	}
	
	@Override
	public void Century() {
		System.out.println("He currently scored his 71 century and maiden T20 hundred in Asiacup 2022");
		super.Century();
	}
	
public static void main(String[] args) {
	Virat2022 vi=new Virat2022();
	vi.Profession();
	vi.Advertisemet();
	vi.Century();
	
}
}
