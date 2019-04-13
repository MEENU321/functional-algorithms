package com.bridgelabz.clinicmgmt.data.impl;

import java.util.List;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.clinicmgmt.data.DoctorData;
import com.bridgelabz.clinicmgmt.model.Doctor;
import com.bridgelabz.clinicmgmt.model.Patient;
import java.io.*;
import java.util.*;

/* Department class contains list of student 
Objects. It is associated with student 
class through its Object(s). */

// class book 
class Clinique {
	public class DoctorDataImpl implements DoctorData {

		@Override
		public List<Doctor> getDoctors() {

			return getDoctors();
		}

	}

	public List<Patient> getPatient() {

		return getPatient();
	}

}

// main method
class GFG {
	InvDemo g=new InvDemo();

	try
	{
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(
				"C:\\Users\\Meenu Robert\\eclipse-workspace\\InventoryDemo\\src\\com\\bridgelabz\\clinicmgmt\\model\\Patient.json");

		Object obj = jsonParser.parse(reader);
		System.out.println(obj);
		List<Patient> p = Patient. getpatient();
		 for(obj x : patient)
	     {
	         System.out.println("\t"+country.toString());
	     }

		FileReader reader1 = new FileReader(
				"C:\\Users\\Meenu Robert\\eclipse-workspace\\InventoryDemo\\src\\com\\bridgelabz\\clinicmgmt\\model\\Doctor.json");

		Object c = jsonParser.parse(reader1);
		System.out.println(c);


	

List<Patient> b = Patient. getpatient();
	 for(obj x : patient)
     {
         System.out.println("\t"+patient.toString());
     }
    List<Doctor>  s= Doctor.getDoctors()
	
}
	//matching code-
	catch(
		FileNotFoundException e)
		{
			e.printStackTrace();
		}catch(
		IOException e)
		{
			e.printStackTrace();
		}catch(
		ParseException e)
		{
			e.printStackTrace();
		}}
	
}}