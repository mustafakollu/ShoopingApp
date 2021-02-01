
public class Main {

    public static void main(String[] args) {
    	
    	String argument1 = args[0];					//equalized argument1
    	String argument2 = args[1];					//equalized argument2
        Bill bill = new Bill();						//create a object at Bill class
        bill.printBill(argument1,argument2);		//run printBill function at Bill class 
        
    	}
    }
