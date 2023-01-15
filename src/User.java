import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Faites votre choix :1- Receptioniste / 2- Patient / 3- Docteur / 4- Quitter");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
			
		do{
			switch(choice){        
				case 1: Receptioniste R = new Receptioniste();
					R.Choice();
					System.out.println("\nFaites votre choix :1- Receptioniste / 2- Patient / 3- Docteur / 4- Quitter");
					sc = new Scanner(System.in);
					choice = sc.nextInt();
					break;
				case 2: Patient P = new Patient();
					P.Choice();
					System.out.println("\nFaites votre choix :1- Receptioniste / 2- Patient / 3- Docteur / 4- Quitter");
					sc = new Scanner(System.in);
					choice = sc.nextInt();
					break;
				case 3: Docteur D = new Docteur();
					D.Choice();
					
					System.out.println("\nFaites votre choix :1- Receptioniste / 2- Patient / 3- Docteur / 4- Quitter");
					sc = new Scanner(System.in);
					choice = sc.nextInt();
				break;        
			}
		}while(choice!=4);

		System.out.println("\nFin du programme");

	}

}
