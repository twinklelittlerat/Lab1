public class q1{
    private String title;
    private String author;
    private double price;
    public q1(String title,String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
         }
   
      public String getTitle() {
return title;
}

public String getAuthor() {
    return author;
}

public void setTitle(String title) {
    this.title = title;
}

public void setAuthor(String author) {
    this.author = author;
}

public void setPrice(double price) {
    this.price = price;
}
public static void main(String[] args) {q1 book = new q1("Developing Java Software", "Russel Winder", 79.75);
System.out.println(book.getTitle());
System.out.println(book.getAuthor());
}

}