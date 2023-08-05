<h1>desktop-cleaner</h1> 
 A java application to tidy up you desktop. It sorf txt, pdg, html and image files into given directories.

 The program can be run using a .bat file.

 1. create your .bat file
 2. print the following content into the file
    @echo off

   set "classpath=C:\your_path"
   
   REM Replace "App" with the name of your main class (without the .class extension) the standard is App
   set "mainclass=App"
   
   REM Run the Java application
   java -cp %classpath% %mainclass%
 3. save the .bat file and click on it to execute the script

