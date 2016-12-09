
public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {

      if (zip.length() != 5){
	  throw new IllegalArgumentException();
      }

      for (int i = 0; i < 5; i++){
	  if((zip.charAt(i) > 57) ||
	     (zip.charAt(i) < 48)){
	      throw new IllegalArgumentException();
	  }
      }
	      
      _zip =  zip;
      _checkDigit = this.checkSum();
  }



// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int sum = 0;
      for (int i = 0; i < 5; i++){
	  sum += Integer.parseInt(_zip.substring(i, i+1));
      }
      return (sum % 10);
      
  }

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"

    public static String digitToCode(int digit){
	String code = "";

	switch(digit){

	case 0: code += "||:::"; break;
	case 1: code += ":::||"; break;
	case 2: code += "::|:|"; break;
	case 3: code += "::||:"; break;
	case 4: code += ":|::|"; break;
	case 5: code += "::|:|"; break;
	case 6: code += ":||::"; break;
	case 7: code += "|:::|"; break;
	case 8: code += "|::|:"; break;
	case 9: code += "|:|::"; break;
	}
    
	return code;
    }


    
    public static String toCode(String zip){
	String x = "|";
	int sum = 0;
	
	for (int i = 0; i < 5; i++){
	    x += digitToCode(Integer.parseInt(zip.substring(i, i+1)));
	    sum += (Integer.parseInt(zip.substring(i, i+1)));
	}
	
	x += digitToCode(sum % 10);
	x += "|";
	return x;
    }
			     

    public String toString(){
	String x = "" + this._zip + _checkDigit;
	x += toCode(this._zip);

	return x;
    }
	


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){
      if (Integer.parseInt(this._zip)>Integer.parseInt(other._zip)){
	  return 1;
      }
      if (Integer.parseInt(this._zip)==Integer.parseInt(other._zip)){
	  return 0;
      }
      else{
	    return -1;
      }
  }


    public static void main(String[]args){
	Barcode a = new Barcode("08451");
	Barcode b= new Barcode("12345");
	System.out.println(a.toString());
	System.out.println(toCode("08451"));
	System.out.println(a.compareTo(b));
	
    }
}
