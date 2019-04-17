package com.stu.main.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CollectionType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "Subject")

public class Subjects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int subId;
	@JsonProperty("subjectName")
	private List <String> subjectname;
	@ManyToOne()
	@JoinColumn(name="rno")
	private  Student stu;
	
	


	public List<String> getSubjectname() {
		return subjectname;
	}

	public void setSubjectname(List<String> subjectname) {
		this.subjectname = subjectname;
	}

	public Student getStu() {
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}


}
