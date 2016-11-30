public class ReferenceBook extends LibraryBook {

    private String collection;

    public ReferenceBook(){
	super();
	collection = "none";
    }
    
    public ReferenceBook(String a, String b, String c, String d, String e){
	super.setAuthor(a);
	super.setTitle(b);
	super.setISBN(c);
	super.setCallNumber(d);
	collection = e;
    }

    public String getCollection() {
	return collection;
    }

    public void setCollection(String name) {
	collection = name;
    }

    public void checkout(String patron, String due) {
	System.out.println(" You cannot check out a reference book. ");
    }

    public void returned() {
	System.out.println(" Reference book could not have been checked out -- return impossible. ");
    }

    public String circulationStatus() {
	return (" Non-circulating reference book ");
    }

    public String toString() {
	return (super.toString() + " " + collection);
    }
}
	   
