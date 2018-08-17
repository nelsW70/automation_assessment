package com.assessment.model;

import java.util.List;

public class TotalInformation {

	private PersonalDetails personalDetails;
	private List<Questions> questions;
	private String message1;
	private String message1Color;
	private String message2;
	private String message2Color;
	private String message3;
	private String message3color;
	private String message4;
	private String message4color;
	
	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}
	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}
	public List<Questions> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public String getMessage1Color() {
		return message1Color;
	}
	public void setMessage1Color(String message1Color) {
		this.message1Color = message1Color;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public String getMessage2Color() {
		return message2Color;
	}
	public void setMessage2Color(String message2Color) {
		this.message2Color = message2Color;
	}
	public String getMessage3() {
		return message3;
	}
	public void setMessage3(String message3) {
		this.message3 = message3;
	}
	public String getMessage3color() {
		return message3color;
	}
	public void setMessage3color(String message3color) {
		this.message3color = message3color;
	}
	public String getMessage4() {
		return message4;
	}
	public void setMessage4(String message4) {
		this.message4 = message4;
	}
	public String getMessage4color() {
		return message4color;
	}
	public void setMessage4color(String message4color) {
		this.message4color = message4color;
	}
	
	@Override
	public String toString() {
		return "TotalInformation [personalDetails=" + personalDetails + ", questions=" + questions + ", message1="
				+ message1 + ", message1Color=" + message1Color + ", message2=" + message2 + ", message2Color="
				+ message2Color + ", message3=" + message3 + ", message3color=" + message3color + ", message4="
				+ message4 + ", message4color=" + message4color + "]";
	}
	
	
	


	
	
}
