package com.java.patientRecords;

public class Patient {

	private int patientid;
	private String patientName;
	private String patientProblem;
	private Double patientBill;

	public Patient() {
		
	}
	public Patient(int patientid, String patientName,String patientProblem,Double patientBill ) {
		this.patientid=patientid;
		this.patientName=patientName;
		this.patientProblem=patientProblem;
		this.patientBill=patientBill;
   }
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientProblem() {
		return patientProblem;
	}
	public void setPatientProblem(String patientProblem) {
		this.patientProblem = patientProblem;
	}
	public Double getPatientBill() {
		return patientBill;
	}
	public void setPatientBill(Double patientBill) {
		this.patientBill = patientBill;
	}
	@Override
	public String toString() {
		return "Patient [patientid=" + patientid + ", patientName=" + patientName + ", patientProblem=" + patientProblem
				+ ", patientBill=" + patientBill + "]";
	}
	
}