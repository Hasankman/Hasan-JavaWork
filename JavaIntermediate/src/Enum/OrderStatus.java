package Enum;

public enum OrderStatus {
	PENDING("Order has been made"),
	COMPLETED("Order has been recived and ready for shipment "),
	REJECTED("Order has been rejected"),
	DELIVERED("Order has been delivered"),
	FEEDBACKCOLLECTED("Please give us feed back and write a customer review");
	
	String OrdSts;
	
	private OrderStatus(String o) 
	{
		OrdSts= o;
	} public String  getMsg() 
	{
		return OrdSts;
	}
}
