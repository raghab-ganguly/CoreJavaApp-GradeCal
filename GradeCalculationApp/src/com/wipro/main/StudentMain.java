package com.wipro.main;

import com.wipro.bean.Student;
import com.wipro.service.StudentReport;
import com.wipro.service.StudentService;

public class StudentMain {
	static Student data[] =new Student[10];
	
	StudentMain() {
		for(int i=0;i<data.length;i++) {
			data[i]=new Student();
		}
		data[0]=new Student("A",new int[] {72,73,74});
		data[1]=new Student("B",new int[] {75,76,77});
		data[2]=new Student("C",new int[] {99,99,99});
		data[3]=new Student("D",new int[] {100,99,99});
		data[4]=new Student("E",new int[] {13,88,13});
		data[5]=new Student("F",new int[] {14,14,99});
		data[6]=new Student("G",new int[] {77,55,12});
		data[7]=new Student("H",new int[] {13,88,13});
		data[8]=new Student("I", null);
		data[9]=null;
	}
	public static void main(String[] args) {
		StudentReport studentReport=new StudentReport();
		StudentService studentService=new StudentService();
		new StudentMain();
		
		for(Student s:data) {
			try {
				String str=studentReport.validate(s);
				if(str.equals("VALID")) {
					System.out.println(studentReport.findGrades(s));
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Number of objects with marks array as null:"+studentService.findNumberOfNullMarksArray(data));
		System.out.println("Number of objects with name as null:"+studentService.findNumberOfNullName(data));
		System.out.println("Number of objects that are entirely null:"+studentService.findNumberOfNullObjects(data));
	}//end of main
	
}//end of class
