package designprinciple.handson;

public class Accessory implements AccessoryRepairProcessing {

	@Override
	public void ProcessAccessoryRepair(String accessoryType) {
		System.out.println(accessoryType +"  Repair Accepted");
		

	}

}
