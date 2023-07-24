package desktopCleaner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;



public class Main {

	public static void main(String[] args) {
		Path destinationFolder;
		
		// File Path of the Desktop
		String directoryPath = "C:/Users/LucaS/Desktop";
		
		File directory = new File(directoryPath);
		
		File[] file  = directory.listFiles();
		
		for(File f: file) {

			String fileNamePrefix[] = f.getName().split("\\.");
			
			if(fileNamePrefix.length > 1) {
				switch(fileNamePrefix[1]) {
					case "txt": 
						destinationFolder =  Paths.get(directoryPath.concat("/txt/") + f.getName());
						moveFiles(Paths.get(f.getAbsolutePath()), destinationFolder);
						break;
						
					case "html":
					case "xhtml":
					case "htm":
						destinationFolder =  Paths.get(directoryPath.concat("/html/") + f.getName());
						moveFiles(Paths.get(f.getAbsolutePath()), destinationFolder);
						break;
					
					case "pdf":
						destinationFolder =  Paths.get(directoryPath.concat("/pdf/") + f.getName());
						moveFiles(Paths.get(f.getAbsolutePath()), destinationFolder);
						break;
						
					case "png":
		            case "jpg":
		            case "jpeg":
		            case "svg":
						destinationFolder =  Paths.get(directoryPath.concat("/foto/") + f.getName());
						moveFiles(Paths.get(f.getAbsolutePath()), destinationFolder);
						break;
						
				}
			}
		}
		
	}
	
	public static void moveFiles(Path filePath, Path destitinationPath) {
		
		try {
			Files.move(filePath, destitinationPath);
			
			System.out.println("sorted");
			}catch (IOException e) {
	            e.printStackTrace();
        }
		
	}

}

