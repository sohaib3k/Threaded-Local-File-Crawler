/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package directorycrawler;

/**
*
* @author DELL
*/
import java.util.*;
import java.io.File;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class DirectoryCrawler{
	public static void main(String[] args)throws Exception{
		//Starting directory for parsing
		File aStartingDir = new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DirectoryCrawler");
		System.out.println("Working Directory = " +
			System.getProperty("user.dir"));

                File bStartingDir = new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DirectoryCrawler\\src");

                File cStartingDir = new File("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DirectoryCrawler\\crawlDirectory");

directoryCrawer a = new directoryCrawer(aStartingDir) ;
directoryCrawer b = new directoryCrawer(bStartingDir) ;
directoryCrawer c = new directoryCrawer(cStartingDir) ;

Thread a1 = new Thread(a);
a1.start();

Thread a2 = new Thread(b);
a2.start();


Thread a3 = new Thread(c);
a3.start();

a1.join();
a2.join();
a3.join();



		System.out.println();
		System.out.println();
                SearchingService search = new SearchingService();
                Thread searchThread = new Thread(search);
                searchThread.start();
                
                
                
                Iterator iterator = index.keySet().iterator();
        BufferedWriter fileout = new BufferedWriter(new FileWriter("file.txt"));

while (iterator.hasNext()) {
            		List<String> ab = new ArrayList<String>();

   String key = iterator.next().toString();
   ab = index.get(key);
   
   fileout.write("key is:" + key + "\n");
      fileout.write("\n");

   fileout.write("locations found in:");
   
		for (int i = 0; i < ab.size(); i++){
			fileout.write(ab.get(i));

		}

}



	}
	
	static HashMap<String, List<String>> index = new HashMap<String, List<String>>();

	//Crawls and indexes directories and files, also inside of text files
        
	
}
