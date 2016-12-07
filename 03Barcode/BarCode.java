
public class BarCode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public BarCode(String zip) {

      if (zip.length() != 5){
	  throw new IllegalArgumentException();
      }

      for (int i = 0; i < 5; i++){
	  if((_zip.charAt(i) > 57) ||
	     (_zip.charAt(i) < 48)){
	      throw new IllegalArgumentException();
	  }
      }
	      
      _zip =  zip;
      _checkDigit = this.checkSum();
  }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(BarCode x){
      Barcode z = new Barcode(x._zip);
      return z;
  }


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
      int sum = 0;
      for (int i = 0; i < 5; i++){
	  sum += Integer.parseInt(_zip.substring(i, i+1));
      }
      return sum;
      
  }

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order. 
  public int compareTo(Barcode other){}
    
}
