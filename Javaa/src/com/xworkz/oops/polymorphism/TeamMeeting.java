package com.xworkz.oops.polymorphism;

public class TeamMeeting {
	public void invite(int meetingID, String password, String name) {
		System.out.println("Joined Team Meeting thru Microsoft Teams");
	}
	public void invite(String link, String password, String name) {
		System.out.println("Joined Team Meeting thru Zoom");
	}
	public void invite(long phonenumber, String password, String name) {
		System.out.println("Joined Team Meeting thru Cisco Webex");
	}

}
