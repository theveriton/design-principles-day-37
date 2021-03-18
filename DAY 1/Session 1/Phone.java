package designprinciple.handson;

public class Phone implements PhoneRepairProcessing {

	@Override
	public void ProcessPhoneRepair(String ModelName) {
		
		System.out.println(ModelName+"  Repair Accepted");

	}

}
