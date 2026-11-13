class LibraryBook{
    private String title;
    private String author;
    private int copies;
    private double price;
    LibraryBook(String title,String author, int copies,double price)
    {
        this.title=title;
        this.author=author;
        this.copies=copies;
        this.price=price;
    }
    public void setTitle(String title)
    {
        this.title=title;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setCopies(int copies)
    {
        this.copies=copies;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getCopies()
    {
        return copies;
    }
    public double getPrice()
    {
        return price;
    }
    public void displaydetails(){
        System.out.println("Title="+getTitle());
        System.out.println("Author="+getAuthor());
        System.out.println("Copies="+getCopies());
        System.out.println("Price="+getPrice());
        System.out.println("\n----------------\n");
    }
    public static void main(String args[])
    {
        LibraryBook book1=new LibraryBook(
            "Java Programming",
            "Michael",
            5,
            500
        );
        LibraryBook book2=new LibraryBook(
            "c++",
            "James",
            6,
            1000
        );
        LibraryBook book3=new LibraryBook(
            "Python",
            "Allen",
            6,
            1000
        );
        System.out.println("LIBRARY BOOK\n");
        System.out.println("---------------------");
        book1.displaydetails();
        book2.displaydetails();
        book3.displaydetails();

    }

}
