package designprinciple.handson;

public class Order implements OrderProcessing {

	@Override
	public void ProcessOrder(String ModelName) {
		
		System.out.println(ModelName+"  Order Accepted");
	}

}
