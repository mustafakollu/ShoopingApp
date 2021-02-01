
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Customer {										//This class holds the elements of the shoopingList 
    private String name;
    private String surname;
    private String membership;
    private String buy_date;										//element of Customer class
    private Map<String, Integer> item_list =new LinkedHashMap<>();	//HashMap holds product and product's number

	public Customer(String name, String surname, String membership, String buy_date) {
        this.name = name;
        this.surname = surname;
        this.membership = membership;								//constructor of the Customer class
        this.buy_date = buy_date;
    }

	public void addItem(String item_name, Integer count){			//This function add product and product's number to HashMap
        item_list.put(item_name,count);
    }
    public String getName() {
        return name;												//getter setter function of customer class's element
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMembership() {
        return membership;
    }

    public void setMembership(String membership) {
        this.membership = membership;
    }
    
    public String getBuy_date() {
		return buy_date;
	}

	public void setBuy_date(String buy_date) {
		this.buy_date = buy_date;
	}

    public Map<String, Integer> getItem_list() {
        return item_list;
    }

    public void setItem_list(Map<String, Integer> item_list) {
        this.item_list = item_list;
    }
}
