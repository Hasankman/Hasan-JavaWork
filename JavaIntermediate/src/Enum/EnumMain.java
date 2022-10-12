package Enum;

public class EnumMain {
	public static void main(String[] args) {
		Colours myColour=Colours.BLUE;
		System.out.println(myColour);
		
		MsgStatus mObj=MsgStatus.READ;
		System.out.println(mObj.getMsg());
		
		OrderStatus oObj=OrderStatus.DELIVERED;
		System.out.println(oObj.getMsg());
	}
}
