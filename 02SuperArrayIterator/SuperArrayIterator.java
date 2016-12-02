import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String> {

    private SuperArray data;
    private int current;


    public SuperArrayIterator(SuperArray ary) {
	data = ary;
	current = 0;
    }

    public boolean hasNext(){
	if (current < data.size()){
	    return true;
	}
	return false;
    }

    public String next(){
	current += 1;
	return (data.get(current));
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
