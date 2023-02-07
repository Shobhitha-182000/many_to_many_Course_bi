package many_to_many_Course_bi_dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int s_id;
	private String name;
	private long phone;
	@ManyToMany
	@JoinTable(joinColumns = @JoinColumn(name="c_id"),inverseJoinColumns = @JoinColumn(name="s_id"))
	private List<Course>course;
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [s_id=" + s_id + ", name=" + name + ", phone=" + phone + ", course=" + course + "]";
	}
	
}
