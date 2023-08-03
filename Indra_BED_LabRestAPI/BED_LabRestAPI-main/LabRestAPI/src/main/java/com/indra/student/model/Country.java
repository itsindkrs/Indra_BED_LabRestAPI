package com.indra.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "country")

@NoArgsConstructor
@Setter
@Getter
@ToString(exclude = "student")
@EqualsAndHashCode(exclude = "student")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String country;
	

	@ManyToOne
	@JoinColumn(name="student_id_fk", nullable = false)
	@JsonBackReference
	private Student student;



	public String getCountry() {
		return country;
	}


	public String setCountry(String country) {
		return this.country = country;
	}


	public void setStudent(Student student) {
		// TODO Auto-generated method stub
		
	}


	

}
