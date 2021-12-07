import java.util.*;
import java.io.*;

public class etudiant{

	String[] matricule = new String[100];
	String[] nom       = new String[100];
	String[] genre     = new String[100];
	float[] moyenne    = new float[100];

	int n;

	public etudiant (){
		
	}


	public void afficher(String mat, String no, String gen, float moy)
	{

		System.out.println ("\n\nmatricule : "+mat+"\n nom : "+no+"\n genre : "+gen+"\n moyenne : "+moy);
	}



	public int age(int dat)
	{
		int age;

		age = 2021 - dat;

		return age;

	}

	public void bonifier(float moy)
	{
		Scanner sc = new Scanner(System.in);

		float bonus;

		System.out.println("voulez-vous un bonus de combien ? :.. ");

		bonus  = sc.nextFloat();

		moy = moy + bonus;

	}


	public void ordre(int nb)
	{

		int j;
		int i;

		String mat;
		String no; 
		String gen; 
		float moy;


		for (i = 1; i<=nb-1 ;i++ ) {

			for (j = i+1; j <= nb ; j++ ) {


				if (moyenne[i] < moyenne[j]) {
					mat = matricule[i];
					no  = nom[i];
					gen = genre[i];
					moy = moyenne[i];
					
					matricule[i] = matricule[j];
					nom[i]		 = nom[j];
					genre[i]	 = genre[j];
					moyenne[i]   = moyenne[j];

					matricule[j] = mat;
					nom[j]       = no;
					genre[j]     = gen;
					moyenne[j]   = moy; 
				}
	
			}
		}


		for (i = 1; i <= nb ; i++ ) {

			System.out.println("\n "+nom[i]);
			
		}


	}


	public void premier(int nb)
	{

		float som = 0;
		int com = 1;
		int i;

		for (i = 1; i<= nb ; i++ ) {
			
			if (som < moyenne[i] ) {
				som = moyenne[i];
				com = i;
			}
		}

		System.out.println("\n matricule : "+matricule[com]+ "\n nom : "+nom[com]+ "\n genre : "+genre[com]+ "\n moyenne : "+moyenne[com]);
		
	}

	public void dernier(int nb)
	{

		float som = moyenne[1];
		int com = 1;

		int i;

		for (i = 1; i<= nb ; i++ ) {
			
			if (som > moyenne[i] ) {
				som = moyenne[i];
				com = i;
			}
		}

		System.out.println("\n matricule : "+matricule [com]+ "\n nom : "+nom[com]+ "\n genre : "+genre[com]+ "\n moyenne : "+moyenne[com]);
		
	}


}