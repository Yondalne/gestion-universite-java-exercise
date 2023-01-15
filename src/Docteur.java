import java.util.Scanner;

public class Docteur {
	private int d_id=301;
	private String d_name="Dr Malick";
	
	public int getD_id() {
		return d_id;
	}

	public void setD_id(int d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	
	public void CheckPatient(){
		Patient P = new Patient();
		String p_name =P.getP_name();
		int p_id = P.getP_id();
		System.out.println("Doctor: "+d_name+" consulter le patient "+p_name);
	}
	
	public void Choice(){
		System.out.println("Faite votre choix : 1- Voir un Patient / 2- Retour");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		while (choice != 2 ) {
			switch(choice){        
				case 1: 
					CheckPatient();
					System.out.println("Faite votre choix : 1- Voir un Patient / 2- Retour");
					sc = new Scanner(System.in);
					choice = sc.nextInt();			
			}
		}	
	}

}
