package com.medicalexpert;

import java.util.Formatter;
import java.util.Map;

public class DiseaseIdentifier {
	private Map<String, String[]> symptomMap;
	private Map<String, String> diseaseDescriptionMap;
	private Map<String, String> diseaseTreatmentMap;

	public DiseaseIdentifier(Map<String, String[]> diseasesSymptoms, Map<String, String> diseaseDescriptionMap,
			Map<String, String> diseaseTreatmentMap) {
		// Handle null maps gracefully
		if (diseasesSymptoms == null || diseaseDescriptionMap == null || diseaseTreatmentMap == null) {
			throw new IllegalArgumentException("Maps cannot be null");
		}
		this.symptomMap = diseasesSymptoms;
		this.diseaseDescriptionMap = diseaseDescriptionMap;
		this.diseaseTreatmentMap = diseaseTreatmentMap;
	}

	public void identifyDisease(String[] symptoms) {
		if (symptoms.length != 13) {
			System.out.println("Invalid number of symptoms provided.");
			return;
		}

		// Extract symptoms from the array
		String headache = symptoms[0];
		String backPain = symptoms[1];
		String chestPain = symptoms[2];
		String cough = symptoms[3];
		String fainting = symptoms[4];
		String soreThroat = symptoms[5];
		String fatigue = symptoms[6];
		String restlessness = symptoms[7];
		String lowBodyTemp = symptoms[8];
		String fever = symptoms[9];
		String sunkenEyes = symptoms[10];
		String nausea = symptoms[11];
		String blurredVision = symptoms[12];

		// Identify diseases based on symptoms
		if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("yes") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("yes")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("yes")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Jaundice.");
			System.out.println("!! JAUNDICE DETAILS !!\n");
			printDiseaseDescription("Jaundice");
			System.out.println("\n!! JAUNDICE TREATMENT !!");
			printDiseaseTreatment("Jaundice");
		} else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no")
				&& chestPain.equalsIgnoreCase("no") && cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no")
				&& soreThroat.equalsIgnoreCase("no") && fatigue.equalsIgnoreCase("no")
				&& restlessness.equalsIgnoreCase("yes") && lowBodyTemp.equalsIgnoreCase("no")
				&& fever.equalsIgnoreCase("no") && sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("no")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Alzheimer's disease.");
			System.out.println("!! ALZHEIMER'S DISEASE DETAILS !!\n");
			printDiseaseDescription("Alzheimer's disease");
			System.out.println("\n!! ALZHEIMER'S DISEASE TREATMENT !!");
			printDiseaseTreatment("Alzheimer's disease");
		}
		// Add conditions for other diseases
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("yes") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("yes") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("no")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("no")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Arthritis.");
			System.out.println("!! ARTHRITIS DETAILS !!\n");
			printDiseaseDescription("Arthritis");
			System.out.println("\n!! ARTHRITIS TREATMENT !!");
			printDiseaseTreatment("Arthritis");
		}
		// Condition for Tuberculosis
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("yes")
				&& cough.equalsIgnoreCase("yes") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("no") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("yes")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("no")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Tuberculosis.");
			System.out.println("!! TUBERCULOSIS DETAILS !!\n");
			printDiseaseDescription("Tuberculosis");
			System.out.println("\n!! TUBERCULOSIS TREATMENT !!");
			printDiseaseTreatment("Tuberculosis");
		}
		// Condition for Asthma
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("yes")
				&& cough.equalsIgnoreCase("yes") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("no") && restlessness.equalsIgnoreCase("yes")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("no")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("no")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Asthma.");
			System.out.println("!! ASTHMA DETAILS !!\n");
			printDiseaseDescription("Asthma");
			System.out.println("\n!! ASTHMA TREATMENT !!");
			printDiseaseTreatment("Asthma");
		}
		// Condition for Sinusitis
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("yes") && fainting.equalsIgnoreCase("no")
				&& soreThroat.equalsIgnoreCase("yes") && fatigue.equalsIgnoreCase("no")
				&& restlessness.equalsIgnoreCase("no") && lowBodyTemp.equalsIgnoreCase("no")
				&& fever.equalsIgnoreCase("yes") && sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("no")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Sinusitis.");
			System.out.println("!! SINUSITIS DETAILS !!\n");
			printDiseaseDescription("Sinusitis");
			System.out.println("\n!! SINUSITIS TREATMENT !!");
			printDiseaseTreatment("Sinusitis");
		}
		// Condition for Epilepsy
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("yes") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("no")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("no")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Epilepsy.");
			System.out.println("!! EPILEPSY DETAILS !!\n");
			printDiseaseDescription("Epilepsy");
			System.out.println("\n!! EPILEPSY TREATMENT !!");
			printDiseaseTreatment("Epilepsy");
		}
		// Condition for Heart Disease
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("yes")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("no") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("no")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("yes")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Heart Disease.");
			System.out.println("!! HEART DISEASE DETAILS !!\n");
			printDiseaseDescription("Heart Disease");
			System.out.println("\n!! HEART DISEASE TREATMENT !!");
			printDiseaseTreatment("Heart Disease");
		}
		// Condition for Diabetes
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("yes") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("no")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("yes")
				&& blurredVision.equalsIgnoreCase("yes")) {
			System.err.println("\n***You may have Diabetes***\n");
			System.out.println("!! DIABETES DETAILS !!\n");
			printDiseaseDescription("Diabetes");
			System.out.println("\n!! DIABETES TREATMENT !!");
			printDiseaseTreatment("Diabetes");
		} // Condition for Glaucoma
		else if (headache.equalsIgnoreCase("yes") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("no") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("no")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("yes")
				&& blurredVision.equalsIgnoreCase("yes")) {
			System.out.println("You may have Glaucoma.");
			System.out.println("!! GLAUCOMA DETAILS !!\n");
			printDiseaseDescription("Glaucoma");
			System.out.println("\n!! GLAUCOMA TREATMENT !!");
			printDiseaseTreatment("Glaucoma");
		}
		// Condition for Hyperthyroidism
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("yes") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("no")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("yes")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Hyperthyroidism.");
			System.out.println("!! HYPERTHYROIDISM DETAILS !!\n");
			printDiseaseDescription("Hyperthyroidism");
			System.out.println("\n!! HYPERTHYROIDISM TREATMENT !!");
			printDiseaseTreatment("Hyperthyroidism");
		}
		// Condition for Heat Stroke
		else if (headache.equalsIgnoreCase("yes") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("no") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("yes")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("yes")
				&& blurredVision.equalsIgnoreCase("yes")) {
			System.out.println("You may have Heat Stroke.");
			System.out.println("!! HEAT STROKE DETAILS !!\n");
			printDiseaseDescription("Heat Stroke");
			System.out.println("\n!! HEAT STROKE TREATMENT !!");
			printDiseaseTreatment("Heat Stroke");
		}
		// Condition for Hypothermia
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("yes") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("no") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("yes") && fever.equalsIgnoreCase("no")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("no")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Hypothermia.");
			System.out.println("!! HYPOTHERMIA DETAILS !!\n");
			printDiseaseDescription("Hypothermia");
			System.out.println("\n!! HYPOTHERMIA TREATMENT !!\n");
			printDiseaseTreatment("Hypothermia");
		}
		// Condition for Migraine
		else if (headache.equalsIgnoreCase("yes") && backPain.equalsIgnoreCase("no") && chestPain.equalsIgnoreCase("no")
				&& cough.equalsIgnoreCase("no") && fainting.equalsIgnoreCase("no") && soreThroat.equalsIgnoreCase("no")
				&& fatigue.equalsIgnoreCase("yes") && restlessness.equalsIgnoreCase("no")
				&& lowBodyTemp.equalsIgnoreCase("no") && fever.equalsIgnoreCase("no")
				&& sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("no")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Migraine.");
			System.out.println("!! MIGRAINE DETAILS !!\n");
			printDiseaseDescription("Migraine");
			System.out.println("\n!! MIGRAINE TREATMENT !!");
			printDiseaseTreatment("Migraine");
		}
		// Condition for Pneumonia
		else if (headache.equalsIgnoreCase("no") && backPain.equalsIgnoreCase("yes")
				&& chestPain.equalsIgnoreCase("yes") && cough.equalsIgnoreCase("yes") && fainting.equalsIgnoreCase("no")
				&& soreThroat.equalsIgnoreCase("no") && fatigue.equalsIgnoreCase("yes")
				&& restlessness.equalsIgnoreCase("no") && lowBodyTemp.equalsIgnoreCase("no")
				&& fever.equalsIgnoreCase("yes") && sunkenEyes.equalsIgnoreCase("no") && nausea.equalsIgnoreCase("no")
				&& blurredVision.equalsIgnoreCase("no")) {
			System.out.println("You may have Pneumonia.");
			System.out.println("!! PNEUMONIA DETAILS !!\n");
			printDiseaseDescription("Pneumonia");
			System.out.println("\n!! PNEUMONIA TREATMENT !!");
			printDiseaseTreatment("Pneumonia");
		} else {
			System.out.println("We could not identify your disease based on the symptoms provided.");
		}
	}

	public void printDiseaseDescription(String disease) {
		try {
			// Handle null or non-existent disease gracefully
			String description = diseaseDescriptionMap.get(disease);
			if (description != null) {
				int maxLength = 70; // Maximum characters per line

				// Loop through the description and print each line
				while (description.length() > 0) {
					// Determine the length of the line to print
					int endIndex = Math.min(maxLength, description.length());

					// Print the line
					System.out.println(description.substring(0, endIndex).trim());

					// Remove the printed part from the description
					description = description.substring(endIndex);
				}
			} else {
				System.out.println("Description not found for " + disease);
			}
		} catch (Exception e) {
			// Handle any unexpected exceptions
			e.printStackTrace();
			System.out.println("Description not found"); // Print a default message or handle the exception as needed
		}
	}

	public void printDiseaseTreatment(String disease) {
		try {
			// Handle null or non-existent disease gracefully
			String treatment = diseaseTreatmentMap.get(disease);
			if (treatment != null) {
				int maxLength = 70; // Maximum characters per line

				// Loop through the treatment and print each line
				while (treatment.length() > 0) {
					// Determine the length of the line to print
					int endIndex = Math.min(maxLength, treatment.length());

					// Print the line
					System.out.println(treatment.substring(0, endIndex).trim());

					// Remove the printed part from the treatment
					treatment = treatment.substring(endIndex);
				}
			} else {
				System.out.println("Treatment not found for " + disease);
			}
		} catch (Exception e) {
			// Handle any unexpected exceptions
			e.printStackTrace();
			System.out.println("Treatment not found"); // Print a default message or handle the exception as needed
		}
	}

//    public void ifDiseaseNotMatched(String disease) {
//        try {
//            // Handle null or non-existent disease gracefully
//            System.out.println();
//            String idDisease = disease;
//            String diseaseDetails = getDiseaseDetails(idDisease);
//            String treatments = getDiseaseTreatments(idDisease);
//            System.out.println();
//            System.out.printf("The most probable disease that you have is %s%n%n", idDisease);
//            System.out.println("A short description of the disease is given below :\n");
//            System.out.println(diseaseDetails + "\n");
//            System.out.println("The common medications and procedures suggested by other real doctors are: \n");
//            System.out.println(treatments + "\n");
//        } catch (Exception e) {
//            // Handle any unexpected exceptions
//            e.printStackTrace();
//            // You can log the exception, show an error message, or take appropriate action
//            // based on your application's requirements
//        }
//    }
}
