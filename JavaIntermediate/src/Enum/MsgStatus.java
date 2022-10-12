package Enum;

public enum MsgStatus {
	SENT("Single Tick"),
	DELIVERED("Double Tick"),
	READ("Double Blue Tick"),
	DELETED("This Msg has been deleted");
	
	String des;
	
	private MsgStatus(String m) 
	{
		des= m;
	} public String  getMsg() 
	{
		return des;
	}
	
	
}
