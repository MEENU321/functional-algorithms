//package com.bridgelabz.clinicmgmt.data.impl;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.*;

import com.bridgelabz.clinicmgmt.data.DoctorData;
import com.bridgelabz.clinicmgmt.data.impl.Clinique.DoctorDataImpl.Specialisation;
import com.bridgelabz.clinicmgmt.model.Doctor;
import com.bridgelabz.clinicmgmt.model.Patient;
import com.inventory.demo.InvDemo;


	public class DoctorDataImpl implements DoctorData {

		
		class Clinique {
			public Clinique(String string, List<Specialisation> s) {
				// TODO Auto-generated constructor stub
			}
// main method

		class Specialisation {

			String spec;
			private List<Doctor> getdoctor;
			private String name;

			private List<Doctor> getdoctor() {
				return getdoctor;
			}

			Specialisation(String name, List<Doctor> c2) {

				this.name = name;
				this.getdoctor = c2;

			}

			public Specialisation(String name2, List<Patient> c1) {
				this.name2 = name2;
				this.getdoctor = c1;
			}

			
			 * Institute class contains list of Department Objects. It is asoociated with
			 * Department class through its Object(s).
			 
	class CliniqueManagement {

		String cliniqueName;
		private List<Specialisation> specs;

		CliniqueManagement(String instituteName,List<Specialisation> specs) 
	    { 
	        this.cliniqueName = cliniqueName; 
	        this.specs = specs; 
	    }

		// count total students of all departments
		// in a given institute
		
	try

	{
		
		InvDemo g = new InvDemo();
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(
				"C:\\Users\\Meenu Robert\\eclipse-workspace\\InventoryDemo\\src\\com\\bridgelabz\\clinicmgmt\\model\\Patient.json");

		Object obj = jsonParser.parse(reader);
		System.out.println(obj);
		List<Patient> p = Patient. getpatient();
		 for(Patient x : p)
	     {
	         System.out.println("\t"+x.toString());
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
   

    	
  
        Patient s1 = new Patient("Damu", 1, "dentist meeting"); 
    	Patient s2 = new Patient("Ramu", 2, "cardiologist meeting"); 
        Patient s3 = new Patient("Samu", 3, "pediatrition meeting"); 
      
        // making a List of  
        // doctor. 
        List<Doctor> c1 = new ArrayList<Doctor>(); 
        c1.add(s1); 
        c1.add(s2); 
        c1.add(s3); 
        Doctor v1 = new Doctor ("Thomas", 1, "dentist "); 
    	Doctor v2 = new Doctor("Sunny", 2, "cardiologist"); 
        Doctor v3 = new Doctor("Tom", 3, "pediatrition "); 
      
        
        List <Doctor> c2 = new ArrayList<Doctor>(); 
        c2.add(v1);
        c2.add(v2);
        c2.add(v3);
         
          
        Specialisation  c11 = new Specialisation("List of Patients", c1); 
        Specialisation  c12 = new Specialisation("List of Doctors", c2);
       
        List <Specialisation> s11 = new ArrayList<Specialisation>(); 
        s11.add(c11); 
        s11.add(c12); 
          
        // creating an instance of Institute. 
        Clinique t = new Clinique("PRIMES HOSPITAL",s11 ); 
          
       //MAPPING
    }}
		}
}

		@Override
		public List<Doctor> getDoctors() {
			// TODO Auto-generated method stub
			return null;
		}
*/