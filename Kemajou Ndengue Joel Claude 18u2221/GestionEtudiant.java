import java.util.*;
import java.io.*;

class GestionEtudiant
{


	public static void main (String[] args) throws Exception
	{

		Scanner sc = new Scanner(System.in);

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int choix = 4;
		int compte = 1;
		int n;
		int i;

		etudiant elev = new etudiant();


		System.out.println("\n\n entrer l'effectif de la classe :.. ");
		n = sc.nextInt();

		do
		{

			if (choix == 4) 
			{
				
				

				if (compte != 1 ) 
				{
					System.out.println("\n\t REINITIALISATION DU PROGRAMME");
					System.out.println("\n le programme a ete reinitialisation");

					System.out.println("\n\n entrer l'effectif de la classe :.. ");
					n = sc.nextInt();
					
				}

				compte = compte + 1;


				


				
				

				for (i = 1; i <= n ; i++ ) 
				{
					System.out.println("\n\tentrer le nom de l'Etudiant numero "+i);
					elev.nom[i] = br.readLine();

					System.out.println("entrer le Matricule de l'Etudiant  "+elev.nom[i]);
					elev.matricule[i] = br.readLine();

					System.out.println("entrer le Genre de l'Etudiant  "    +elev.nom[i]);
					elev.genre[i] = br.readLine();

					System.out.println("   entrer la MOYENNE de "           +elev.nom[i]);
					elev.moyenne[i] = sc.nextFloat();
			
				}

				
				
			}


			System.out.println("\n\n");

			System.out.println("\n 1) liste des etudiant par ordre des merite");
			System.out.println("\n 2) information sur le 1er etudiant");
			System.out.println("\n 3) information sur le Dernier etudiant");
			System.out.println("\n 4) reinitialisation");
			System.out.println("\n 5) sortir du programme");

			System.out.println("\n\n\t entrer le numero du choix");	

			choix = sc.nextInt();


			if(choix == 1)
			{

				System.out.println("\n\t LISTE DES ETUDIANTS PAR ORDRE DE MERITE");

				elev.ordre(n);
			};


			if(choix == 2)
			{

				System.out.println("\n\t INFORMATION SUR LE 1er ETUDIANT");

				elev.premier(n);
			};


			if(choix == 3)
			{

				System.out.println("\n\t INFORMATION SUR LE DENIER ETUDIANT");

				elev.dernier(n);

			};


			if(choix == 5)
			{
				System.out.println("\n\t SORTIR DU PROGRAMME");

				choix = 0;
			};



		}
		while(choix >= 1 && choix <6);




	}







}