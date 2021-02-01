import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Map.Entry;

public class Bill {												//this class print bill
	public void printBill(String args0,String args1) {
		ArrayList<Price> array_price= new ArrayList<>();
        ArrayList<Customer> array_customer= new ArrayList<>();
        ReadFromFile read= new ReadFromFile();				//create a object at ReadFromFile class
        ReadFromFile.readFile(args0,array_customer);		//this is read arguments
        ReadFromFile.readFile(args1,array_price,0);
        int g = 0;
        int l = 0;
        double total1 = 0;
        for(Customer member: array_customer ){			//this for loop for access Customer class's element 
        	int h=0;
        	double total = 0;
        	if(l!=0) {
        		System.out.println();
        	}
            System.out.println("---"+member.getName()+" "+member.getSurname()+"---");	// this print Customer's name
            for (Entry<String, Integer> entry: member.getItem_list().entrySet()){		//this access product name and number
                String key = entry.getKey();						//product name
                Integer value = entry.getValue();					//product number
                for(Price price1: array_price) {						//this for loop for access Price class's element
                	if(key.equals(price1.getProduct_name())) {			//this if condition for check to equals price's product
                		String sDate1=member.getBuy_date();  
                        SimpleDateFormat formatter1=new SimpleDateFormat("dd.MM.yyyy");  
                        Date date1 = null;					//this function convert string to date for buy date at Shopping List
            			try {
            				date1 = formatter1.parse(sDate1);
            			} catch (ParseException e) {
            				e.printStackTrace();
            			} 
                        String sDate2=price1.getEnd_date();  
                        SimpleDateFormat formatter2=new SimpleDateFormat("dd.MM.yyyy");  
                        Date date2 = null;					//this function convert string to date for end date	at Price List
            			try {
            				date2 = formatter2.parse(sDate2);
            			} catch (ParseException e) {
            				e.printStackTrace();
            			}  
                        String sDate3=price1.getStart_date();  
                        SimpleDateFormat formatter3=new SimpleDateFormat("dd.MM.yyyy");  
                        Date date3 = null;					//this function convert string to date for start date at Price List
        				try {
        					date3 = formatter3.parse(sDate3);
        				} catch (ParseException e) {
        					e.printStackTrace();
        				}
        				boolean result = (date1.before(date2)&&date1.after(date3));//this function check buy date which date range
        				if(member.getMembership().equals(price1.getType_of_membership())) {//this if condition for check to equals Customer's membership to price' membership 
        					if(result==true) {//date condition
        						double key_total=value*price1.getPrice();
        						System.out.println(key + "	" + price1.getPrice()+"	"+value+"	"+key_total);
        						total+=key_total;			//print product,product's price,product's number and product cost
        						h++;
        						g++;
        						l++;
        						total1=total;
        					}
        				}	
                	}
                }
            }
				System.out.print("Total"+"	"+total1);		//print Customer total cost
				total1=0;
				g=0;
        }
	}
}
