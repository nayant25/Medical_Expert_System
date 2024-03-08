Disease Diagnosis System
This Java application, the Disease Diagnosis System, facilitates diagnosing diseases based on symptoms provided by users. It leverages text files containing symptoms, descriptions, and treatments of various diseases for diagnosis.

Features
Automated Diagnosis: Users input symptoms, and the system identifies potential diseases based on the symptoms provided.
Data Preprocessing: The system preprocesses text files containing disease symptoms, descriptions, and treatments before diagnosis.
Customized Treatment Suggestions: After diagnosis, the system provides tailored treatment suggestions for identified diseases.


Usage
Input Symptoms: Users are prompted to input symptoms in the appropriate order.
Diagnosis: The system analyzes the provided symptoms and identifies potential diseases.
Treatment Suggestions: After identifying diseases, the system suggests appropriate treatments based on the diagnosed condition.


Folder Structure
The system expects the following folder structure:
Disease symptoms/: Contains text files with symptoms for each disease.
Disease descriptions/: Contains text files with descriptions of each disease.
Disease treatments/: Contains text files with treatments for each disease.


Dependencies
Java 8 or higher

How to Run
Clone the repository to your local machine.
Ensure Java is installed on your system.
Compile and run the DiseaseDiagnosisSystem.java file.

public static void main(String[] args) {
    DiseaseDiagnosisSystem diagnosisSystem = new DiseaseDiagnosisSystem();
    Scanner scanner = new Scanner(System.in);

    // Start diagnosis
    diagnosisSystem.startDiagnosis(scanner);

    // Close scanner
    scanner.close();
}

License
This project is licensed under the MIT License.
