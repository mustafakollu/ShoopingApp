

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Date;
import java.util.ArrayList;

public class ReadFromFile {		// this class read texts  texts = argument1 and argument2
	
    public static String[] readFile(String path, ArrayList<Customer> array_customer){
            try{					//this function read shopping list
                int i=0;
                int length= Files.readAllLines(Paths.get(path)).size();
                String[] results=new String[length];
                for (String line: Files.readAllLines(Paths.get(path))){

                    String[] arr_of_str=line.split("\t");
                    String[] name=arr_of_str[0].split(" ");
                    array_customer.add(new Customer(name[0],name[1],arr_of_str[1],arr_of_str[2]));
                    try{
                        for (int j=3;i<arr_of_str.length;j=j+2){
                            array_customer.get(i).addItem(arr_of_str[j],Integer.parseInt(arr_of_str[j+1]));
                        }

                    }catch (Exception e){
                    }

                    i=i+1;
                }

                return  results;
            }
            catch (IOException e){
                e.printStackTrace();
                return null;
            }
    }
    public static void readFile(String path, ArrayList<Price> array_price,Integer a){
        try{							//This function read price list
            int i=0;
            int length= Files.readAllLines(Paths.get(path)).size();
            String[] results=new String[length];
            for (String line: Files.readAllLines(Paths.get(path))){
                String[] arr_of_str=line.split("\t");
                array_price.add(new Price(arr_of_str[0],arr_of_str[1],arr_of_str[2], arr_of_str[3],Double.parseDouble(arr_of_str[4])));
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
