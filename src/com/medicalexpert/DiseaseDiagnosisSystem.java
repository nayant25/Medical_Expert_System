package com.medicalexpert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DiseaseDiagnosisSystem {

	private Map<String, String[]> diseasesSymptoms = new HashMap<>();
	private Map<String, String> diseaseDescriptions = new HashMap<>();
	private Map<String, String> diseaseTreatments = new HashMap<>();
	private DiseaseIdentifier diseaseIdentifier;

	public DiseaseDiagnosisSystem() {
		preprocess();
		// Initialize the DiseaseIdentifier instance
		diseaseIdentifier = new DiseaseIdentifier(diseasesSymptoms, diseaseDescriptions, diseaseTreatments);
	}

	private void preprocess() {
	    try {
	        File symptomFolder = new File("Disease symptoms/");
	        if (!symptomFolder.exists()) {
	            System.err.println("Symptom folder not found.");
	            return;
	        }

	        File[] symptomFiles = symptomFolder.listFiles();
	        if (symptomFiles == null) {
	            System.err.println("No files found in the symptom folder.");
	            return;
	        }

	        for (File symptomFile : symptomFiles) {
	            if (symptomFile.isFile()) {
	                String disease = symptomFile.getName().replace(".txt", "");

	                // Read symptoms
	                List<String> symptomsList = new ArrayList<>();
	                BufferedReader symptomsReader = new BufferedReader(new FileReader(symptomFile));
	                String symptomLine;
	                while ((symptomLine = symptomsReader.readLine()) != null) {
	                    symptomsList.add(symptomLine);
	                }
	                String[] symptoms = symptomsList.toArray(new String[0]);
	                diseasesSymptoms.put(disease, symptoms);
	                symptomsReader.close();

	                // Read description
	                BufferedReader descReader = new BufferedReader(
	                        new FileReader("Disease descriptions/" + disease + ".txt"));
	                StringBuilder descriptionBuilder = new StringBuilder();
	                String descLine;
	                while ((descLine = descReader.readLine()) != null) {
	                    descriptionBuilder.append(descLine);
	                }
	                String description = descriptionBuilder.toString();
	                diseaseDescriptions.put(disease, description);
	                descReader.close();

	                // Read treatment
	                BufferedReader treatmentReader = new BufferedReader(
	                        new FileReader("Disease treatments/" + disease + ".txt"));
	                StringBuilder treatmentBuilder = new StringBuilder();
	                String treatmentLine;
	                while ((treatmentLine = treatmentReader.readLine()) != null) {
	                    treatmentBuilder.append(treatmentLine);
	                }
	                String treatment = treatmentBuilder.toString();
	                diseaseTreatments.put(disease, treatment);
	                treatmentReader.close();
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


	public void startDiagnosis(Scanner scanner) {
	    // Initialize symptoms
	    String[] symptoms = new String[13]; // Increase size to accommodate blurred vision

	    // Ask symptoms in the appropriate order
	    System.out.print("headache: ");
	    symptoms[0] = scanner.nextLine().trim();
	    
	    System.out.print("back pain: ");
	    symptoms[1] = scanner.nextLine().trim();
	    
	    System.out.print("chest pain: ");
	    symptoms[2] = scanner.nextLine().trim();
	    
	    System.out.print("cough: ");
	    symptoms[3] = scanner.nextLine().trim();
	    
	    System.out.print("fainting: ");
	    symptoms[4] = scanner.nextLine().trim();
	    
	    System.out.print("sore throat: ");
	    symptoms[5] = scanner.nextLine().trim();
	    
	    System.out.print("fatigue: ");
	    symptoms[6] = scanner.nextLine().trim();
	    
	    System.out.print("restlessness: ");
	    symptoms[7] = scanner.nextLine().trim();

	    System.out.print("low body temperature: ");
	    symptoms[8] = scanner.nextLine().trim();

	    System.out.print("fever: ");
	    symptoms[9] = scanner.nextLine().trim();

	    System.out.print("sunken eyes: ");
	    symptoms[10] = scanner.nextLine().trim();

	    System.out.print("nausea: ");
	    symptoms[11] = scanner.nextLine().trim();

	    System.out.print("blurred vision: ");
	    symptoms[12] = scanner.nextLine().trim();
		

		
		
//		for(String a: symptoms) {
//			System.out.println(a);
//		}
		// Identify diseases based on symptoms
		diseaseIdentifier.identifyDisease(symptoms);
		
	}
}
