package Hibernate_App_In_Gradle;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="q5991")
public class question {

	@Id
	@SequenceGenerator(name= "abcd", sequenceName="question", initialValue=1, allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="abcd")
	
	private int id;
	private String qname;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="qid")
	@OrderColumn(name="type")
	
	private List<Answer> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
}
