public class Book {

    /// instance variables ///
    private String author;
    private String title;
    private String isbn;


    /// constructors ///
    public Book() {
	author = "anonymous";
	title = "no title";
	isbn = "N/A";
    }
    
    public Book(String name, String cover, String id) {
	author = name;
	title = cover;
	isbn = id;
    }


    /// getters ///
    public String getAuthor(){
	return author;
    }

    public String getTitle(){
	return title;
    }
    
    public String getISBN(){
	return isbn;
    }

    public String toString(){
	return ("" + title + ", " + author + ", " + isbn);
    }


    /// setters ///
    public void setAuthor(String name){
	author = name;
    }

    public void setTitle(String name){
	title = name;
    }

    public void setISBN(String name){
	isbn = name;
    }
    
    
}
