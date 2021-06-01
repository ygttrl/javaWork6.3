package JavaWork.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;


@Data
@Entity
@Table(name="jobpositions")

public class jobposition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;	
	
	@Column(name="jobtitlename")
	private String jobtitlename;
	
	public jobposition() {}
	
	public jobposition(int id, String jobtitlename) {
		super();
		this.id = id;
		this.jobtitlename = jobtitlename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobtitlename() {
		return jobtitlename;
	}

	public void setJobtitlename(String jobtitlename) {
		this.jobtitlename = jobtitlename;
	}
	
	
	
	
	
	
}
