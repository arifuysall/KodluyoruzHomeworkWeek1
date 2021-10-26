package weekone.homework3;

import java.time.LocalDate;

public class Main {
public static void main(String[] args) {
		
		PersonalData personalData1 = new PersonalData(LocalDate.of(1995, 7, 9),100);
		personalData1.setAddress("Bornova,Ýzmir");
		PersonalData personalData2 = new PersonalData(LocalDate.of(1990, 5, 16), 101);
		personalData2.setAddress("Balçova,Ýzmir");
		PersonalData personalData3 = new PersonalData(LocalDate.of(1992, 10, 6), 102);
		personalData3.setAddress("Narlýdere,Ýzmir");
		PersonalData personalData4 = new PersonalData(LocalDate.of(1998, 2, 22), 103);
		personalData4.setAddress("Konak,Ýzmir");
		PersonalData personalData5 = new PersonalData(LocalDate.of(1991, 8, 1), 104);
		personalData5.setAddress("Karþýyaka,Ýzmir");
		PersonalData personalData6 = new PersonalData(1991, 5, 2, 221);
		personalData5.setAddress("Kemalpaþa,Ýzmir");
		
		Student student1 = new Student("Arif", 5005, 3.20, personalData1);
		Student student2 = new Student("Ahmet",5004, 2.50, personalData2);
		Student student3 = new Student("Þeref", 5003, 4.00, personalData3);
		Student student4 = new Student("Hasan", 5002, 3.50, personalData4);
		Student student5 = new Student("Ýbrahim", 5001, 2.20, personalData5);
		
		Courses course1 = new Courses("K129", 3);
			
		course1.addStudent(student1);
		course1.addStudent(student2);
		course1.addStudent(student3);
		course1.addStudent(student4);
		
		course1.increaseCapacity();
		course1.list();
		
		course1.addStudent(student4);
		course1.addStudent(student5);
		System.out.println("-----------------");
		course1.list();
		System.out.println("-----------------");
		course1.dropStudent(student1);
		course1.list();
		System.out.println("-----------------");
		System.out.println(course1.getNumberOfStudents());
		course1.list();
		System.out.println("-----------------");
		System.out.println(course1.getBestStudent().getPd().getBirthdate().getYear());
		
		Courses course2 = new Courses("K130"); 
	
			for(int i=0;i<course1.getNumberOfStudents();i++) {
			course2.addStudent(course1.getStudents().get(i));}
		
		course1.clear();
		System.out.println("-----------------");
		course2.list();
		System.out.println("-----------------");
		course2.dropStudent(course2.getBestStudent());
		System.out.println("-----------------");
		course2.list();
		System.out.println(course2.getYoungestStudent().getGpa());
		course1.list();
		System.out.println("-----------------");
		course2.list();
		
		}
}
