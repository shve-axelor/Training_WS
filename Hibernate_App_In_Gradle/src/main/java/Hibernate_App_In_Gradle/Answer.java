package Hibernate_App_In_Gradle;

import javax.persistence.*;


@Entity
@Table(name="ans5991")
public class Answer {
	@Id
	@SequenceGenerator(name= "abcd",sequenceName="answer", initialValue=100, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="abcd")
	
	private int id;
	private String answername;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswername() {
		return answername;
	}
	public void setAnswername(String answername) {
		this.answername = answername;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	private String postedBy;

}
