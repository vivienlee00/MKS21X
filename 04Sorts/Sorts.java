public class Sorts{

    public static String name(){
    return "06.Lee.Vivien";
    }

    public static void selectionSort(int[] data){

    for (int i = 0; i < (data.length - 1); i++){
        int lowest = data[i];
        int lowestindex = i;


        for (int q = i+1; q < data.length; q++){
        if (data[q] < lowest){
            lowest = data[q];
            lowestindex= q;
        }
        }

        int temp = data[i];
        data[i] = lowest;
        data[lowestindex] = temp;

    }
    }

    public static void insertionSort(int[] data){
	int correctindex = 0;
	for (int i = 1; i < data.length; i++){
	    int current = i - 1;
	    while(data[current] > data[i]){
		current--;
	    }
	    correctindex = current;
	    int temp = data[correctindex];
	    
	    data[correctindex] = data[i];
	    
	}
		
	}
    }

    public static String toString(int[] data) {
    String str = "[";
    for (int i = 0; i < data.length; i += 1)
        str += (" " + data[i] + ",");
        str += "]";
    return str;
    }

    public static void main(String[] args){
    int[] x = {64,25,12,22,11};
    int[] y = {100, 0, 10};

    System.out.println(toString(x));
    selectionSort(x);
    System.out.println(toString(x));


    System.out.println(toString(y));
    selectionSort(y);
    System.out.println(toString(y));
    }



}
