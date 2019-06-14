package Hibernate_App_In_Gradle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regularemployee103")
@PrimaryKeyJoinColumn(name="ID")
public class regular_emp extends employee {
	
	@Column(name="salarys")
	private float salarys;
	
	@Column(name="bonus")
	private int bonus;

	public float getSalarys() {
		return salarys;
	}

	public void setSalarys(float salarys) {
		this.salarys = salarys;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}
