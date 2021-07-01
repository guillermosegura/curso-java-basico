package com.axity.course.oop.interfaces;

import java.time.LocalDateTime;

public interface Interviewer {

	void conductInterview();

	default void submitInterviewStatus() {
		System.out.println("Accept");
	}

	static void bookConferenceRoom(LocalDateTime dateTime, int duration) {
		System.out.println("Book conference room from " + dateTime + " to " + dateTime.plusMinutes(duration));
	}
}
