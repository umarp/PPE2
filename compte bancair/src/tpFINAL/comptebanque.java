package tpFINAL;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class comptebanque {

	public static String nom;
	public static String prenom;
	public static String Adresse;
	public static String DateDeNaissance;
	public static String Sex;
	public static String Type;
	public class MyClass {
	
		  }
		

	
	public static void supprimerCompte(String filename, int startline, int numlines)
		{
			try
			{
				BufferedReader br=new BufferedReader(new FileReader(filename));
				StringBuffer sb=new StringBuffer("");
	 
				int linenumber=1;
				String line;
	 
				while((line=br.readLine())!=null)
				{
					//Store each valid line in the string buffer
					if(linenumber<startline||linenumber>=startline+numlines)
						sb.append(line+"\n");
					linenumber++;
				}
				if(startline+numlines>linenumber)
					System.out.println("End of file reached.");
				br.close();
	 
				FileWriter fw=new FileWriter(new File(filename));
				//Write entire string buffer into the file
				fw.write(sb.toString());
				fw.close();
			}
			catch (Exception e)
			{
				System.out.println("Something went horribly wrong: "+e.getMessage());
			}
		}
	
	public static String CreationCompte() throws IOException {
		Random rand = new Random(); 
		 
		int low = 1000000000;
		int high = 2100000000;
		int result = rand.nextInt(high-low) + low;
        String str1  = Integer.toString(result);
        String temp;
		
		 
		temp=new String(""+str1+" "+nom+" "+prenom+" "+Adresse+""+DateDeNaissance+" "+Sex+" "+Type);
		if(Type=="Courrant") {
			try{
		    	
		    	File file =new File("courrant.dat");
		    	if(!file.exists()){
		    	   file.createNewFile();
		    	}

		    	
		    	FileWriter fw = new FileWriter(file,true);
		    	
		    	BufferedWriter bw = new BufferedWriter(fw);
		    	bw.write(temp);
		    	bw.newLine();
		    	
		    	bw.close();
		    	
		      	}
			catch(IOException ioe){
		         System.out.println("Exception occurred:");
		    	 ioe.printStackTrace();
		    }

		}
		else if(comptebanque.Type=="Epargne") {
			try{
		    	
		    	File file =new File("Epargne.dat");

		    	if(!file.exists()){
		    	   file.createNewFile();
		    	}

		    	
		    	FileWriter fw = new FileWriter(file,true);
		    	
		    	BufferedWriter bw = new BufferedWriter(fw);
		    	bw.write(temp);
		    	bw.newLine();
		    	
		    	bw.close();

		      }catch(IOException ioe){
		         System.out.println("Exception occurred:");
		    	 ioe.printStackTrace();
		       }

		}
		else if(comptebanque.Type=="Joint") {
			try{
		    	
		    	File file =new File("Joint.txt");

		    	if(!file.exists()){
		    	   file.createNewFile();
		    	}
		    	FileWriter fw = new FileWriter(file,true);
		    	
		    	BufferedWriter bw = new BufferedWriter(fw);
		    	bw.write(temp);
		    	bw.newLine();
		    	
		    	bw.close();

		      }catch(IOException ioe){
		         System.out.println("Exception occurred:");
		    	 ioe.printStackTrace();
		       }
		}
		
		try{
	    	
	    	File file =new File("comptes.dat");
	    	if(!file.exists()){
	    	   file.createNewFile();
	    	}

	    	
	    	FileWriter fw = new FileWriter(file,true);
	    
	    	BufferedWriter bw = new BufferedWriter(fw);
	    	bw.write(temp);
	    	bw.newLine();

	    	bw.close();

	      }catch(IOException ioe){
	         System.out.println("Exception occurred:");
	    	 ioe.printStackTrace();
	       }

		 return str1; 
	}
	public static String afficherCompte(String filePath) {
		 
		
		StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) 
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) 
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
	
	}

}