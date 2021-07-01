package com.axity.course.oop.interfaces;

public class Manager extends Employee implements Interviewer, Trainable {
	private int teamSize;

	public void reportProjectStatus() {
		System.out.println("Report project status");
	}

	@Override
	public void attendTraining() {
		System.out.println("Manager - attend training");

	}

	@Override
	public void conductInterview() {
		System.out.println("Manager - conduct interview");

	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

}
