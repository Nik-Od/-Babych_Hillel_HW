package HW5;

public class Product {
    private String title;
    private String vendorCode;
    private float price;
    private String description;
   private boolean availability;

    public Product(){

    }
    public Product(String title, float price){
        title = title;
        price = price;
    }
    public Product(String description, boolean availability){
        description = description;
        availability = availability;
    }

     public String getTitle(){
         return title;
     }
     public void setVendorCode(String code){
         vendorCode = code;
     }
     public float getPrice(){
         return price;
     }
     public void setAvailability(boolean available){
         availability = available;
     }
}

