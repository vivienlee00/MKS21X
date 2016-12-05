import java.util.*;

public class SuperArrayIterator implements Iterator<String> {

    private SuperArray info;
    private int current;


    public SuperArrayIterator(SuperArray ary) {
	info = ary;
	current = 0;
    }

    public boolean hasNext(){
	if (current < info.size()){
	    return true;
	}
	return false;
    }

    public String next(){
	if (hasNext()){
	    current++;
	    return info.get(current-1);
	}
	else{
	    throw new NoSuchElementException();
	}
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
}
