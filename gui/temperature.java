public class temperature{
    
    public static double CtoF(double t){
	double end = 0;
	end = (((t * (double)9)) / (double)5) + 32;
	return end;
    }

    public static double FtoC(double t){
	double end = 0;
	end = ((t - 32) * (((double)(5)) / (double)(9)));
	return end;
    }

    public static void main(String[]args){
	System.out.println(CtoF(-40.0));
	System.out.println(CtoF(100.0));
	System.out.println(FtoC(212.0));
    }


}

