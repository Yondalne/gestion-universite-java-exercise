import java.util.Scanner;

public class Receptioniste {
	private int r_id;
	private String r_name;
	
	public void Choice(){
		System.out.println("Faite votre choix : 1- GiveAppoint / 2- GenerateBill / 3- Retour");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		while (choice != 3) {
			switch(choice){        
				case 1: 
					GiveAppoint();
					System.out.println("Faite votre choix : 1- GiveAppoint / 2- GenerateBill / 3- Retour");
					sc = new Scanner(System.in);
					choice = sc.nextInt();
					break;
				case 2: 
					GenerateBill();
					System.out.println("Faite votre choix : 1- GiveAppoint / 2- GenerateBill / 3- Retour");
					sc = new Scanner(System.in);
					choice = sc.nextInt();
					break;
			}
		}	
	}
	
	public void GenerateBill(){

		Facture B = new Facture();
		int b_no =B.getB_no();
		String p_name =B.getP_name();
		int p_id = B.getP_id();
		int b_amt = B.getB_amt();
		System.out.println("BillNO: "+b_no +"\n PatientID: "+p_id+"\nPatientName: "+p_name+"\nBillAmount: "+b_amt);
		
	}
	
	public void GiveAppoint(){

		Patient P = new Patient();
		String p_name =P.getP_name();
		int p_id = P.getP_id();
		Docteur D = new Docteur();
		int d_id = D.getD_id();
		String d_name = D.getD_name();
		System.out.println("\n PatientID: "+p_id+"\nPatientName: "+p_name+"\nAppointment with Doctor \nDoctorID: "+d_id+
		"\nDoctorName"+d_name);
	}
}
