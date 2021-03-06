package jp.bctech.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exercise {
	@Id
	Long id;
	Long chapterId;
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	String answer;
	Integer type;
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setChapterId(Long chapterId) {
		this.chapterId = chapterId;
	}
	
	public Long getChapterId() {
		return chapterId;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	
	public String getOption1() {
		return option1;
	}
	
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	
	public String getOption2() {
		return option2;
	}
	
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	
	public String getOption3() {
		return option3;
	}
	
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	
	public String getOption4() {
		return option4;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setType(Integer type) {
		this.type = type;
	}
	
	public Integer getType() {
		return type;
	}
}
