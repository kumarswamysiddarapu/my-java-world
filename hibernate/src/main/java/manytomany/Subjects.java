package manytomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Subjects {
	@Id
	private Integer sub_id;
	private String sub_name;
	
	public Integer getSub_id() {
		return sub_id;
	}
	public void setSub_id(Integer sub_id) {
		this.sub_id = sub_id;
	}
	public String getSub_name() {
		return sub_name;
	}
	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

}
