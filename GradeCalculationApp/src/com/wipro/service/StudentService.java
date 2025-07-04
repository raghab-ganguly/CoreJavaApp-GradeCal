package com.wipro.service;

import com.wipro.bean.Student;

public class StudentService {
	public int findNumberOfNullMarksArray(Student[] s) {
		int c = 0;
		if (s != null) {
			for (int i = 0; i < s.length; i++) {
				if (s[i] != null) {
					if (s[i].getMarks() == null) {
						c += 1;
					}
				}
			}
		}
		return c;
	}
	public int findNumberOfNullName(Student[] s) {
		int c = 0;
		if (s != null) {
			for (int i = 0; i < s.length; i++) {
				if (s[i] != null) {
					if (s[i].getName() == null) {
						c += 1;
					}
				}
			}
		}
		return c;
	}

	public int findNumberOfNullObjects(Student[] s) {
		int c = 0;
		if (s != null) {
			for (int i = 0; i < s.length; i++) {
				if (s[i] == null) {
					c += 1;
				}
			}
		}
		return c;
	}

}// end of class
