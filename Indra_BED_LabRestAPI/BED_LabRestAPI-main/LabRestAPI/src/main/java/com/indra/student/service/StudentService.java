package com.indra.student.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.indra.student.model.Student;
import com.indra.student.repository.StudentRepository;

@Service
public class StudentService {
	
	/*
	 * //data store private Set<Student> students = new HashSet<>();
	 */
	
	private final StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	public Student addStudent(Student student) {
		System.out.println("Saving the student to the set....");
		Student savedStudent = this.studentRepository.save(student);
		return savedStudent;
	}
	
	//method to return all the students
	public Set<Student> fetchAllStudents(){
		return new HashSet<>(this.studentRepository.findAll());
	}
	
	
	public Student fetchStudentById(long studentId) {
		return this.studentRepository
					.findById(studentId)
					.orElseThrow(() -> new IllegalArgumentException("invalid student id passed.."));
	}
	
	public void deleteStudentById(long studentId) {
		this.studentRepository.deleteById(studentId);
	}
	
	public Student updateStudent(long studentId, Student updatedStudent) {
		System.out.println("Passed in student is "+ updatedStudent);
		System.out.println("Passed student-id is :: "+ studentId);
		Student studentFromRepository = this.fetchStudentById(studentId);
		studentFromRepository.setFirstName(updatedStudent.getFirstName());
		studentFromRepository.setLastName(updatedStudent.getLastName());
		studentFromRepository.setCourse(updatedStudent.getCourse());
		studentFromRepository.setCountry(updatedStudent.getCountry());
		this.studentRepository.save(studentFromRepository);
		return studentFromRepository;
	}




}
