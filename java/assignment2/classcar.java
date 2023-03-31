package assignment2;

public class classcar {


	    private String make;
	    private String model;
	    private int year;
	    private String color;
	    private double price;
	    
	    // Constructor
	    public void Car(String make, String model, int year, String color, double price) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.color = color;
	        this.price = price;
	    }
	    
	    // Getter methods
	    public String getMake() {
	        return make;
	    }
	    
	    public String getModel() {
	        return model;
	    }
	    
	    public int getYear() {
	        return year;
	    }
	    
	    public String getColor() {
	        return color;
	    }
	    
	    public double getPrice() {
	        return price;
	    }
	    
	    // Setter methods
	    public void setMake(String make) {
	        this.make = make;
	    }
	    
	    public void setModel(String model) {
	        this.model = model;
	    }
	    
	    public void setYear(int year) {
	        this.year = year;
	    }
	    
	    public void setColor(String color) {
	        this.color = color;
	    }
	    
	    public void setPrice(double price) {
	        this.price = price;
	    }
	}




