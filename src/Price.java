
public class Price {									//this class holds the elements of the PriceList
    private String product_name;
    private String type_of_membership;
    private String start_date;										//element of Price class
    private  String end_date;
    private  double price;
    
    public Price(String product_name, String type_of_membership, String start_date, String end_date, double price) {
        this.product_name = product_name;
        this.type_of_membership = type_of_membership;
        this.start_date = start_date;								//constructor of the Price class
        this.end_date = end_date;
        this.price = price;
    }
    
	public String getProduct_name() {								//getter setter function of Price class's element
        return product_name;										
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getType_of_membership() {
        return type_of_membership;
    }

    public void setType_of_membership(String type_of_membership) {
        this.type_of_membership = type_of_membership;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
