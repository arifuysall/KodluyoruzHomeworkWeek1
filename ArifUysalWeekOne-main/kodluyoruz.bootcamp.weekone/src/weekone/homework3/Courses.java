package weekone.homework3;

import java.time.LocalDate;
import java.util.ArrayList;

public class Courses {
	private String courseName;
	private int capacity;
	private int numberOfStudent;
	private ArrayList<Student> students = new ArrayList<>();
	 
	
	public Courses(String courseName) {
		super();
		this.courseName = courseName;
		this.capacity = 40;
	}


	public Courses(String className, int capacity) {
		super();
		this.courseName = className;
		this.capacity = capacity;
	}


	public String getCourseName() {
		return courseName;
	}

	public int getNumberOfStudents() {
		
		numberOfStudent = students.size();
		return students.size();
		
	}

	public ArrayList<Student> getStudents() {
		return students;
		
	}

	
	public boolean addStudent(Student student) {
		
		if(!students.contains(student)) {
			if (numberOfStudent < capacity) {
				boolean situation = students.add(student);
				numberOfStudent++;
				return situation;
			}
			else {
				boolean situation = false;
				return situation;
		}}
		return true;
		
	}
	public boolean dropStudent(Student student) {
		
		boolean situation = students.remove(student);
		   numberOfStudent--;
		   return situation;
	}
	
	public void increaseCapacity() {
		capacity += 5;
	}
	
	public Student getBestStudent() {
		Student bestGpa = null;
		double initialGpa =0.0;
		for(Student student : students) {
			if ( student.getGpa()> initialGpa) {
				initialGpa = student.getGpa();
				bestGpa = student;
			}
		}
		return bestGpa;
	}
	
	
	public Student getYoungestStudent() {	
		Student youngestStu = null;
		LocalDate date = LocalDate.of(1980, 1, 1);
			for (Student student : students){
				PersonalData x = student.getPd();
				LocalDate y = x.getBirthdate();
			if ( y.isAfter(date)) {
				date = y;	
				youngestStu = student;
			}   
			
		}
			return youngestStu;
	}
	
	public void clear() {
		students.removeAll(students);
	}
	
	public void list() {
		for (Student student : students) {
			System.out.println(student);
		}
	}
	@Override
	public String toString() {
		return "Courses [courseName=" + courseName + ", capacity=" + capacity + ", numberOfStudent=" + numberOfStudent
				+ ", students=" + students + "]";
	}
}
