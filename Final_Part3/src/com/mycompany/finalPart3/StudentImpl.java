package com.mycompany.finalPart3;

public class StudentImpl extends PersonBaseImpl implements Student {

	String takenCourseTitle;
	public StudentImpl(String _name, String _takenCourseTitle){
		super(_name);
		takenCourseTitle = _takenCourseTitle;
		
	}
	public StudentImpl(String _name) {
		super(_name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "student";
	}

	@Override
	public String studiesFor() {
		// TODO Auto-generated method stub
		return takenCourseTitle;
	}

}
