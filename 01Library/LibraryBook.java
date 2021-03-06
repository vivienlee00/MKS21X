abstract class LibraryBook extends Book implements Comparable<LibraryBook> {

    private String callNumber;

    public LibraryBook() {
	super();
	callNumber = "N/A";
    }
    
    public LibraryBook(String name, String cover, String id, String phone) {
	super.setAuthor(name);
	super.setTitle(cover);
	super.setISBN(id);
	callNumber = phone;
    }

    public String getCallNumber() {
	return callNumber;
    }

    public void setCallNumber(String phone) {
	callNumber = phone;
    }

    abstract void checkout(String patron, String due);

    abstract void returned();

    abstract String circulationStatus();

    public int compareTo(LibraryBook n ) {
	return (this.callNumber).compareTo(n.callNumber);
    }

    public String toString() {
	return (super.toString() + circulationStatus() + callNumber);
    }
}
	
