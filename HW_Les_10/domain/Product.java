package HW_Les_10.domain;

public class Product { // Класс представляющий книгу
    private String id;
    private String title;
    private String author;
    private Double price;

    public Product(String id, String title, String author, Double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public Double getPrice(){
        return price;
    }
    
    public void setId(String id){
        this.id = id; 
    }
    public void setTitle(String title){
        this.title = title; 
    }
    public void setAuthor(String author){
        this.author = author; 
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public String getInfo() {
        return String.format("ID: %s, Title: %s, Author: %s,  Price: %d.", 
        this.id, this.title, this.author, this.price, this.getClass().getSimpleName());
    }
}
