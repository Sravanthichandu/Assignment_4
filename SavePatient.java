package com.java.patientRecords;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;


public class SavePatient {

	public static void main(String[] args) throws SQLException {
		
	Patient  patient_obj = new Patient(5,"Nari","Heart",25000.00);
		
		
		Connection connection = null;
		
		try {
			//connection object created
			
			connection = DatabaseConnection.getDBConnection();
			
			
			//string query for insert
			
			String query = "insert into patient( patient_id,patient_name,patient_problem,patient_bill) values ('"+patient_obj.getPatientid()+"','"+patient_obj.getPatientName()+"','"+patient_obj.getPatientProblem()+"','"+patient_obj.getPatientBill()+"')";
		
			//string query for retrieve
			
			//String query = "select * from employee where employee_id ='"+employee.getEmploye_id()+"'";
			
			//query statement object
			Statement statement = connection.createStatement();
			
			
			//execute query statement
			int status = statement.executeUpdate(query);
			System.out.println(status+"employee object stored in the database table");
			
			
		   }
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		finally {
			connection.close();
		}


	}

}
