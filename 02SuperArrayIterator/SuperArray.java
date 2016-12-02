
public class SuperArray implement Iterable<String>  {
    
    private String[] data;
    private int size;


    public SuperArray() {
	data = new String[10];
	size = 0;
    }

    public SuperArray(int capacity) {
	if (capacity < 0){
	    throw new IllegalArgumentException();
	}
	data = new String[capacity];
	size = 0;
    }

    public SuperArray(String[] ary, int capacity){
	String[] newAry = new String[capacity];
	
	for (int i = 0; i < ary.length; i++) {
	    newAry[i] = ary[i];
	}
	
	data = newAry;
	size = ary.length;
    }

    public SuperArray(String[] ary){
	data = ary;
	size = ary.length;
    }

    public int size() {
	return size;
    }

    public int getLength() {
	return data.length;
    }

    public boolean add(String element) {
	size += 1;
	
	if (size > data.length) {
	    this.grow();
	}
	
	data[size - 1] = element;
	return true;
    }

    
    public String remove(int index) {

	if (index < 0 || index >= size) {
	    throw new IndexOutOfBoundsException();
	}

	String original = data[index];
	for (int i = index; i < size - 1; i += 1) {
	    data[i] = data[i + 1];
	}
	size -= 1;
	return original;
    }

    public void add(int index, String element) {

	if (index < 0 || index > size) {
	    throw new IndexOutOfBoundsException();
	}

	if (data.length == size) {
	    this.grow();
	}

	String[] newList = new String[data.length];

	for (int i = 0; i < index; i++) {
	    newList[i] = data[i];
	}

	newList[index] = element;

		size += 1;
	
	for (int i = index + 1; i < size; i++) {
	    newList[i] = data[i - 1];
	}

	data = newList;

    }

    private void grow() {
	String[]newArray;
	newArray = new String[data.length + 1];
	for (int i = 0; i < data.length; i += 1) {
	    newArray[i] = data[i];
	}
	data = newArray;
    }

    public String toString() {
	String str = "[";
	for (int i = 0; i < size; i += 1)
	    str += (" " + data[i] + ",");
        str += "]";
	return str;
    }

    public String toStringDebug() {
        String str = "[";
	for (int i = 0; i < data.length; i += 1) {
	    if (i <= size - 1)
		str += (" " + data[i] + ",");
	    else
		str += (" _,");
	}
	str += "]";
	return str;
    }

    public void clear() {
	size = 0;
    }

    public boolean isEmpty() {
	return (size == 0);
    }

    public String get(int index) {
	return data[index];
    }
    
    public String set(int index, String element) {

	if (index < 0 || index >= size){
	    throw new IndexOutOfBoundsException();
	}
	   
	String original = "";
	if (index < size) {
	    original = data[index];
	    data[index] = element;
	}
	return original;
    } 	    
    
    public String[] toArray() {
	String[] newArray;
	newArray = new String[size()];
	for (int i = 0; i < size; i += 1) {
	    newArray[i] = data[i];
	}
	return newArray;
    }

    public int indexOf(String element) {
	int index = 0;
	int end = 0;
	while (data[index] != element && index < size) {
	    index += 1;
	}

	if (index >= size) {
	    end = -1;
	}
	else { end = index;}

	return end;
	    
    }

    public int lastIndexOf(String element) {
	int index = size - 1;
	int end = 0;
	while (index >= 0 && data[index] != element) {
	    index -= 1;
	}

	if (index < 0) {
	    end = -1;
	}
	else { end = index;}

	return end;
    }

      

}

