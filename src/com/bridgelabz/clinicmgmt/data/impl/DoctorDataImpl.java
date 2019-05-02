package com.bridgelabz.clinicmgmt.data.impl;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.clinicmgmt.data.DoctorData;

import com.bridgelabz.clinicmgmt.model.Doctor;
import com.bridgelabz.clinicmgmt.model.Patient;

public abstract class DoctorDataImpl implements DoctorData {

	class CliniqueManagement {

		String cliniqueName;
		private List<Specialisation> specs;

		CliniqueManagement(String instituteName, List<Specialisation> specs) {
			this.cliniqueName = cliniqueName;
			this.specs = specs;
		}

		class Specialisation {

			String spec;
			private List<Doctor> getdoctor;
			private String name;
			private String name2;

			public Specialisation(String name2, List<Doctor> c1) {
				this.name2 = name2;
				this.getdoctor = c1;
			}

		private List<Patient> p = new ArrayList<Patient>();

				for(Patient x1:p)
			{
				System.out.println("\t" + x1.toString());
			}

			List<Patient> c1 = new ArrayList<Patient>();
			Patient s1 = new Patient("Damu", 1, "dentist meeting");
			Patient s2 = new Patient("Ramu", 2, "cardiologist meeting");
			Patient s3 = new Patient("Samu", 3, "pediatrition meeting");c1.add(s1);c1.add(s2);c1.add(s3);

			List<Doctor> c2 = new ArrayList<Doctor>();
			Doctor v1 = new Doctor("Thomas", 1, "dentist ");
			Doctor v2 = new Doctor("Sunny", 2, "cardiologist");
			Doctor v3 = new Doctor("Tom", 3, "pediatrition ");

			c2.add(v1);c2.add(v2);c2.add(v3);

			// Specialisation c11 = new Specialisation("List of Patients", c1);
			Specialisation c12 = new Specialisation("List of Doctors", c2);

			List<Specialisation> s11 = new ArrayList<Specialisation>();s11.add(c11);s11.add(c12);

			// creating an instance of Institute.
			CliniqueManagement t = new CliniqueManagement("PRIMES HOSPITAL", s11);

			// MAPPING
		}
	}
}}
