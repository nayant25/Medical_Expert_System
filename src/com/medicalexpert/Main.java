package com.medicalexpert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("Hi! I am Dr.Tayade, I am your health care expert system.");
        System.out.println("For that you'll have to answer a few questions about your conditions\n");
        System.out.println("***Do you feel any of the following symptoms***\n");
   
        
        

        DiseaseDiagnosisSystem diagnosisSystem = new DiseaseDiagnosisSystem();
        diagnosisSystem.startDiagnosis(scanner);
        scanner.close();
    }
}
