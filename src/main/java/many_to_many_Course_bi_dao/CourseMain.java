package many_to_many_Course_bi_dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import many_to_many_Course_bi_dto.Course;
import many_to_many_Course_bi_dto.Student;

public class CourseMain {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setS_id(1);
		s1.setName("arjun");
		s1.setPhone(782348732);
		
		Student s2=new Student();
		s2.setS_id(2);
		s2.setName("ram");
		s2.setPhone(358975909);
		
		Student s3=new Student();
		s3.setS_id(3);
		s3.setName("raj");
		s3.setPhone(8956977447l);
		
		Course c1=new Course();
		c1.setC_id(111);
		c1.setCourse_name("java");
		c1.setDuration("2 months");
		
		Course c2=new Course();
		c2.setC_id(222);
		c2.setCourse_name("Advance java");
		c2.setDuration("1.5 months");
		
		Course c3=new Course();
		c3.setC_id(333);
		c3.setCourse_name("sql");
		c3.setDuration("1 months");
		
		
		List<Student>students=new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		List<Student>students1=new ArrayList<Student>();
		students1.add(s1);
		students1.add(s2);
		 
		List<Student>students3=new ArrayList<Student>();
		students3.add(s3);
		
		List<Course>courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c3);
		courses.add(c2);
		
		List<Course>courses1=new ArrayList<Course>();
		courses1.add(c2);
		
		s1.setCourse(courses);
		s2.setCourse(courses);
		s3.setCourse(courses1);
		
		c1.setStudents(students);
		c2.setStudents(students);
		c3.setStudents(students3);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
		
		entityTransaction.commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
