import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String> {

    private SuperArray info;
    private int current;


    public SuperArrayIterator(SuperArray ary) {
	info = ary;
	current = 0;
    }

    public boolean hasNext(){
	if (current < info.size() - 1){
	    return true;
	}
	return false;
    }

    public String next(){
	int temp = current;
	if (info.hasNext()){
	    current += 1;}
	return info.get(temp);
    }

    public void remove(){
	throw new UnsupportedOperationException();
    }
}
