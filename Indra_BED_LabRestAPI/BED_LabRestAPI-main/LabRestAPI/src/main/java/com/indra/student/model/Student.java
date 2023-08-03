package com.indra.student.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@ToString
@EqualsAndHashCode

@Entity
@Table(name="students")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String Course;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonManagedReference
	private Set<Course> course;
	
	/*
	 * public void addCourse(Object object) { if (this.course == null) { this.course
	 * = new HashSet<>(); } this.course.add(object); object.setStudent(this); }
	 */
	public Object getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setFirstName(Object firstName) {
		// TODO Auto-generated method stub
		
	}

	public Object getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLastName(Object lastName) {
		// TODO Auto-generated method stub
		
	}

	public Object getCourse() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCourse(Object course2) {
		// TODO Auto-generated method stub
		
	}

	public Object getCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setCountry(Object country) {
		// TODO Auto-generated method stub
		
	}

}
