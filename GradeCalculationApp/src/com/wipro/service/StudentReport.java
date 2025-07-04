package com.wipro.service;

import com.wipro.bean.Student;
import com.wipro.exception.NullMarksArrayException;
import com.wipro.exception.NullNameException;
import com.wipro.exception.NullStudentObjectException;

public class StudentReport {

	/**
	 * Finding the Grades of the student results
	 */
	public String findGrades(Student studentObject) {
		String grade = "";
		int[] marks = studentObject.getMarks();
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] < 35) {
				return "F";
			} else {
				sum += marks[i];
				if (sum < 150) {
					grade = "C";
				} else if (sum >= 150 && sum < 200) {
					grade = "B";
				} else if (sum >= 200 && sum < 250) {
					grade = "A";
				} else {
					grade = "A+";
				}
			} // end of else
		} // end of forloop
		return grade;
	}// end of findGradesMethod

	/**
	 * User provided data validation cheking
	 */

	public String validate(Student s) throws NullNameException, NullMarksArrayException, NullStudentObjectException {
		if (s == null) {
			throw new NullStudentObjectException();
		}
		if (s.getName() == null) {
			throw new NullNameException();
		} else if (s.getMarks() == null) {
			throw new NullMarksArrayException();
		}
		return "VALID";
	}

}// end of class
