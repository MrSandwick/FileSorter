# Description:
This Java program sorts files in a specified directory based on predefined name patterns. Files are moved into corresponding subfolders if their names 
start with specific patterns (e.g., "ENG-", "RUS-"). The program uses a map (namePatterns) to define the patterns and their associated folder names.

## Table of content:
1. [Description](#description)  
2. [How to Use](#how-to-use)  
   - [Set Up the Repository Path](#set-up-the-repository-path)  
   - [Predefined Patterns](#predefined-patterns)  
   - [Add New Patterns](#add-new-patterns)  
   - [Remove Patterns](#remove-patterns)  
   - [Run the Program](#run-the-program)  
3. [Example Usage in main](#example-usage-in-main)  
4. [Implementation Details](#implementation-details)  
   - [Defining Name Patterns](#defining-name-patterns)  
   - [Sorting Logic](#sorting-logic)  
   - [File Movement Process](#file-movement-process)  
5. [Customization Options](#customization-options)  
   - [Modifying Existing Patterns](#modifying-existing-patterns)  
   - [Handling Unmatched Files](#handling-unmatched-files)  
6. [Conclusion](#conclusion)  

### How to Use:
1. #### Set Up the Repository Path:  
   Change the repository path in the main method:  
   String repositoryPath = "C:\\path\\to\\your\\repository";
2. #### Predefined Patterns:  
   The default patterns are:  
   - "ENG-" → "English Files"  
   - "RUS-" → "Russian Files"  
   - "PDF-" → "PDF Files"  
   - "PPT-" → "PowerPoint Files"
3. #### Add New Patterns:  
   Use the addPattern method:  
   FileSorter.addPattern("NEW-", "New Files");
4. #### Remove Patterns:  
   Use the removePattern method:  
   FileSorter.removePattern("ENG-");
5. #### Run the Program:  
   Compile and run the program to sort files based on the name patterns.

### Conclusion:  
This program sorts files by name pattern and organizes them into folders. Patterns can be easily added or removed as needed.

### Example Usage in main:
Here's an example of how you can use these methods in the main method to dynamically add or remove patterns before the program starts moving files:
```bash
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
```