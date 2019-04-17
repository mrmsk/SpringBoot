package com.stu.main.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "stuTable")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty("rno")
	private Integer rno;
	@JsonProperty("name")
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="subId")
	@JsonProperty("subjects")
	private List<Subjects> subjects;
	
	
	
	

	/*public Student(Integer rno, String name, List<Subjects> subjects) {
		super();
		this.rno = rno;
		this.name = name;
		this.subjects = subjects;
	}*/

	public Integer getRno() {
		return rno;
	}

	public void setRno(Integer rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Subjects> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subjects> subjects) {
		this.subjects = subjects;
	}

}
