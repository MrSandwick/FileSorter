Description:

This Java program sorts files in a specified directory based on predefined name patterns. Files are moved into corresponding subfolders if their names start with specific patterns (e.g., "ENG-", "RUS-"). The program uses a map (namePatterns) to define the patterns and their associated folder names.

How to Use:

1. Set Up the Repository Path:  
   Change the repository path in the main method:  
   String repositoryPath = "C:\\path\\to\\your\\repository";

2. Predefined Patterns:  
   The default patterns are:  
   - "ENG-" → "English Files"  
   - "RUS-" → "Russian Files"  
   - "PDF-" → "PDF Files"  
   - "PPT-" → "PowerPoint Files"

3. Add New Patterns:  
   Use the addPattern method:  
   FileSorter.addPattern("NEW-", "New Files");

4. Remove Patterns:  
   Use the removePattern method:  
   FileSorter.removePattern("ENG-");

5. Run the Program:  
   Compile and run the program to sort files based on the name patterns.

Conclusion:  
This program sorts files by name pattern and organizes them into folders. Patterns can be easily added or removed as needed.




Example Usage in main:
Here's an example of how you can use these methods in the main method to dynamically add or remove patterns before the program starts moving files:

public static void main(String[] args) {
    // Initialize patterns (can be easily modified here)
    namePatterns.put("ENG-", "English Files");
    namePatterns.put("RUS-", "Russian Files");
    namePatterns.put("PDF-", "PDF Files");
    namePatterns.put("PPT-", "PowerPoint Files");

    // Dynamically add a new pattern for DOC files
    FileSorter.addPattern("DOC-", "Document Files");

    // Remove the pattern for Russian files
    FileSorter.removePattern("RUS-");

    // Path to the repository with files
    String repositoryPath = "C:\\path\\to\\your\\repository";
    
    // Your existing code for sorting files follows...
}