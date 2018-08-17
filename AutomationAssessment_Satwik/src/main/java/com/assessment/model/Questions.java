package com.assessment.model;

import java.util.List;

public class Questions {

	private String question;
	private List<String> answer;
	private boolean option1;
	private boolean option2;
	private boolean option3;
	private boolean option4;
	private boolean option5;
	private boolean option6;
	private boolean option7;
	private String other1="";
	private String other2="";
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswer() {
		return answer;
	}
	public void setAnswer(List<String> answer) {
		this.answer = answer;
	}
	
	public boolean getOption1() {
		return option1;
	}
	public void setOption1(boolean option1) {
		this.option1 = option1;
	}
	public boolean getOption2() {
		return option2;
	}
	public void setOption2(boolean option2) {
		this.option2 = option2;
	}
	public boolean isOption3() {
		return option3;
	}
	public void setOption3(boolean option3) {
		this.option3 = option3;
	}
	public boolean isOption4() {
		return option4;
	}
	public void setOption4(boolean option4) {
		this.option4 = option4;
	}
	public boolean isOption5() {
		return option5;
	}
	public void setOption5(boolean option5) {
		this.option5 = option5;
	}
	public boolean isOption6() {
		return option6;
	}
	public void setOption6(boolean option6) {
		this.option6 = option6;
	}
	public boolean isOption7() {
		return option7;
	}
	public void setOption7(boolean option7) {
		this.option7 = option7;
	}
	public String getOther1() {
		return other1;
	}
	public void setOther1(String other1) {
		this.other1 = other1;
	}
	public String getOther2() {
		return other2;
	}
	public void setOther2(String other2) {
		this.other2 = other2;
	}
	@Override
	public String toString() {
		return "Questions [question=" + question + ", answer=" + answer + ", option1=" + option1 + ", option2="
				+ option2 + ", option3=" + option3 + ", option4=" + option4 + ", option5=" + option5 + ", option6="
				+ option6 + ", option7=" + option7 + ", other1=" + other1 + ", other2=" + other2 + "]";
	}

	
	
	
}
