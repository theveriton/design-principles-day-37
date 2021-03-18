
package designprinciple.handson;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("Would You like to Order or Repair");
		String s =sc.next();
		s=s.toLowerCase().trim();
		switch(s) {
		case "order":
			System.out.println("Please Provide Phone Model Name");
			String PhoneName=sc.next();
			Order op = new Order();
			op.ProcessOrder(PhoneName);
			break;
		case "repair":
			System.out.println("Is it the Phone or Accesory you want to get repaired?");
			String ProductType=sc.next();
			if(ProductType.equalsIgnoreCase("phone")) {
				System.out.println("Please Provide Phone Model Name");
				String PhoneModel=sc.next();
				Phone ph=new Phone();
				ph.ProcessPhoneRepair(PhoneModel);
			}
			else {
				System.out.println("Please Provide the Accesory Details");
				String ass=sc.next();
				Accessory acy=new Accessory();
				acy.ProcessAccessoryRepair(ass);
			}
			break;
		case "exit":
			System.exit(0);
		default:
			break;
			
		}
		

	}

}
