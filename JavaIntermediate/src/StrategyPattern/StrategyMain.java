package StrategyPattern;

public class StrategyMain {
	    public static void main(String[] args) {
	        StrategySwapper context = new StrategySwapper();
	        context.setStrategy(new BluetoothStrategy());
	        context.connect("Nick's phone");

	        context.setStrategy(new AuxStrategy());
	        context.connect("Jordan's phone");

	        context.setStrategy(new HdmiStrategy());
	        context.connect("Piers' phone");

	    }
}
