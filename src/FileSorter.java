import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class FileSorter{
    
    // A map to store patterns and their corresponding folders
    private static Map<String, String> namePatterns = new HashMap<>();
    
    public static void main(String[] args) {
        // Initialize patterns (new ones can be easily added)
        namePatterns.put("ENG-", "English Files");
        namePatterns.put("RUS-", "Russian Files");
        namePatterns.put("PDF-", "PDF Files");
        namePatterns.put("PPT-", "PowerPoint Files");
        // Add new patterns here if needed

        // Path to the repository with files
        String repositoryPath = "C:\\path\\to\\your\\repository";
        
        // Get all files from the repository
        File directory = new File(repositoryPath);
        File[] files = directory.listFiles();
        
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // Get the file name
                    String fileName = file.getName();
                    
                    // Determine which folder the file belongs to using the pattern
                    for (Map.Entry<String, String> entry : namePatterns.entrySet()) {
                        String pattern = entry.getKey();
                        String folderName = entry.getValue();
                        
                        if (fileName.startsWith(pattern)) {
                            // Create the folder if it doesn't exist
                            File folder = new File(directory, folderName);
                            if (!folder.exists()) {
                                folder.mkdir();
                            }
                            
                            // Move the file to the corresponding folder
                            Path sourcePath = file.toPath();
                            Path destinationPath = Paths.get(folder.getAbsolutePath(), fileName);
                            
                            try {
                                Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
                                System.out.println("File moved: " + fileName + " -> " + folderName);
                            } catch (IOException e) {
                                System.err.println("Error moving file: " + fileName);
                                e.printStackTrace();
                            }
                            break; // Once a match is found, no need to check further
                        }
                    }
                }
            }
        } else {
            System.out.println("No files found in the specified directory.");
        }
    }

    // Method to add a new pattern
    public static void addPattern(String pattern, String folder) {
        namePatterns.put(pattern, folder);
    }

    // Method to remove a pattern
    public static void removePattern(String pattern) {
        namePatterns.remove(pattern);
    }
}
