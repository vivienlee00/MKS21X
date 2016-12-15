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
	    if (data[i-1] > data[i]){

		int current = i - 1;
		while((data[current] > data[i]) && current > 0){
		    current--;
		}

		if(data[current] > data[i]){
		correctindex = current;
		}
		else{
		    correctindex = current + 1;
		}
		
		int temp = data[i];
		
		for(int p = i; p > correctindex; p--){
		    data[p] = data[p - 1];
		}
		data[correctindex] = temp;	
	    }
	}
	
    }
  //  0   1   2   3   4
   // 64, 25, 12, 22, 11;
   // 25, 64, 12, 22, 11;
   // 12, 25, 64, 22, 11;

    public static void bubbleSort(int[] data){
	
	for (int p = 0; p < data.length; p++){
	    int swaps = 0;
	    for (int n = 0; n < data.length - (p + 1); n++){
		while(data[n] > data[n+1]){
		    int temp = data[n+1];
		    data[n+1] = data[n];
		    data[n] = temp;
		    swaps++;
		}
	    }
	    if (swaps == 0){
		return;
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

	long starttime, endtime;
	int[] x =  new int[10000];

	for(int i = 0; i < 10000; i++){
	    x[i] = (int)(Math.random() * 100);
	}
	
	starttime = System.currentTimeMillis();

	insertionSort(x);	

	endtime = System.currentTimeMillis();
	
	
	System.out.println("" + (endtime - starttime) + " milliseconds");
    }
    
}
