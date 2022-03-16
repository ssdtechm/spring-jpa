package com.ssd.jpa.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ssd.jpa.entity.Student;
import com.ssd.jpa.repogitory.StudentRepository;

import java.util.List;

@SpringBootTest
public class StudentRepogitoryTest {

	    @Autowired
	    private StudentRepository studentRepository;

	    @Test
	    public void saveStudent() {
	        Student student = Student.builder()
	                .emailId("shabbir@gmail.com")
	                .firstName("Shabbir")
	                .lastName("Dawoodi")
	                //.guardianName("Nikhil")
	                //.guardianEmail("nikhil@gmail.com")
	                //.guardianMobile("9999999999")
	                .build();

	        studentRepository.save(student);
	    }

//	    @Test
//	    public void saveStudentWithGuardian() {
//
//	        Student student = Student.builder()
//	                .firstName("Shivam")
//	                .emailId("shivam@gmail.com")
//	                .lastName("Kumar")
//	               
//	                .build();
//
//	        studentRepository.save(student);
//
//	    }
//	    
//	    @Test
//	    public void printAllStudent() {
//	        List<Student> studentList =
//	                studentRepository.findAll();
//
//	        System.out.println("studentList = " + studentList);
//	    }
//	    
//	    @Test
//	    public void printStudentByFirstName() {
//	        
//	        List<Student> students =
//	                studentRepository.findByFirstName("shivam");
//
//	        System.out.println("students = " + students);
//	    }
//
//	    @Test
//	    public void printStudentByFirstNameContaining() {
//
//	        List<Student> students =
//	                studentRepository.findByFirstNameContaining("sh");
//
//	        System.out.println("students = " + students);
//	    }
//	    
//	    @Test
//	    public void printStudentBasedOnGuardianName(){
//	        List<Student> students =
//	                studentRepository.findByGuardianName("Nikhil");
//	        System.out.println("students = " + students);
//	    }
//
//	    @Test
//	    public void printgetStudentByEmailAddress() {
//	        Student student =
//	                studentRepository.getStudentByEmailAddress(
//	                        "shabbir@gmail.com"
//	                );
//
//	        System.out.println("student = " + student);
//	    }
//
//	    @Test
//	    public void printgetStudentFirstNameByEmailAddress() {
//	        String firstName =
//	                studentRepository.getStudentFirstNameByEmailAddress(
//	                        "shivam@gmail.com"
//	                );
//	        System.out.println("firstName = " + firstName);
//	    }
//	    
//	    @Test
//	    public void printgetStudentByEmailAddressNative(){
//	        Student student =
//	                studentRepository.getStudentByEmailAddressNative(
//	                        "shivam@gmail.com"
//	                );
//
//	        System.out.println("student = " + student);
//	    }
//
//	    @Test
//	    public void printgetStudentByEmailAddressNativeNamedParam() {
//	        Student student =
//	                studentRepository.getStudentByEmailAddressNativeNamedParam(
//	                        "shivam@gmail.com"
//	                );
//
//	        System.out.println("student = " + student);
//	    }
//
//	    @Test
//	    public void updateStudentNameByEmailIdTest() {
//	        studentRepository.updateStudentNameByEmailId(
//	                "shabbir dawoodi",
//	                "shabbir@gmail.com");
//	    }
}
