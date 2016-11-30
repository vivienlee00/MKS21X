public class CirculatingBook extends LibraryBook {

    private String currentHolder;
    private String dueDate;

    public CirculatingBook(String a, String b, String c, String d) {
	super.setAuthor(a);
	super.setTitle(b);
	super.setISBN(c);
	super.setCallNumber(d);
	currentHolder = null;
	dueDate = null;
    }


    public String getHolder(){
	return currentHolder;
    }

    public String getDueDate(){
	return dueDate;
    }

    public void setHolder(String name){
	currentHolder = name;
    }

    public void setDueDate(String date){
	dueDate = date;
    }

    public void checkout(String patron, String due){
	currentHolder = patron;
	dueDate = due;
    }

    public void returned(){
	currentHolder = null;
	dueDate = null;
    }

    public String circulationStatus(){
	if (currentHolder == null){
	    return ("Book available on shelves");
	}
	else{
	    return (currentHolder + " " + dueDate);
	}
    }

    public String toString(){
	return (super.toString() + currentHolder + dueDate);
    }
}
