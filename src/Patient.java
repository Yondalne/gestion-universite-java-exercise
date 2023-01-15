import java.util.Scanner;

public class Patient {
	private int p_id=101;
	private String p_name = "Kdb Ismael";
	
	public int getP_id() {
		return p_id;
	}
	
	public String getP_name() {
		return p_name;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	
	public void PayBill(){
		System.out.println("Merci de payer la facture");
	}

	public void Choice(){
		System.out.println("Faite votre choix : 1- PayBill / 2- Retour");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		while (choice != 2) {
			switch(choice){        
				case 1: 
					PayBill();
					System.out.println("Faite votre choix : 1- PayBill / 2- Retour");
					sc = new Scanner(System.in);
					choice = sc.nextInt();
			}
		}

	}	
}
