package com.human.character;

public class Pikachu implements Character {
	private int experience=40; //경험치
	private int energy=50;
	private int level=1;
	
	
	@Override
	public void eat() {
		energy+=25;

	}

	@Override
	public void sleep() {
		energy+=10;

	}

	@Override
	public void play() {
		energy-=30;
		experience+=30;
	}

	@Override
	public void train() {
		energy-=20;
		experience+=20;
	}

	@Override
	public void levelUp() {
		if(experience>60) {
			experience-=40;
			level++;
			System.out.println("Level Up!");
		}

	}

	@Override
	public boolean endGame() {
		boolean returnValue=true;
		if(level>4) {
			System.out.println("피카추가 완전히 성장했습니다!");
			returnValue=false;
		}else if(energy<0) {
			System.out.println("피카추가 굶어 죽었습니다.");
			returnValue=false;
		}
		return returnValue;
	}

	@Override
	public void printInfo() {
		System.out.println("=======================================");
		System.out.println("         피카추 정보입니다. ");
		System.out.println("		level: "+ level);
		System.out.println("		energy: "+ energy);
		System.out.println("		experience: "+ experience);
		System.out.println("=======================================");
	}
	
	

}
