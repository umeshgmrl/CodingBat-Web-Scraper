/*This is slightly more difficult version of the famous FizzBuzz problem which is sometimes 
given as a first problem for job interviews. (See also: FizzBuzz Code.) Consider the serie
s of numbers beginning at start and running up to but not including end, so for example st
art=1 and end=5 gives the series 1, 2, 3, 4. Return a new String[] array containing the st
ring form of these numbers, except for multiples of 3, use "Fizz" instead of the number, f
or multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz". In Java, S
tring.valueOf(xxx) will make the String form of an int or other type. This version is a li
ttle more complicated than the usual version since you have to allocate and index into an 
array instead of just printing, and we vary the start/end instead of just always doing 1..
100.fizzBuzz(1, 6) → ["1", "2", "Fizz", "4", "Buzz"]fizzBuzz(1, 8) → ["1", "2", "Fizz", "4
", "Buzz", "Fizz", "7"]fizzBuzz(1, 11) → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
 "Fizz", "Buzz"]*/

public String[] fizzBuzz(int start, int end) {
  String[] result = new String[end-start];
  int count = 0;
  for(int i= start; i< end; i++){
  	if(i % 3 == 0 && i % 5 == 0){
  		result[count++] = "FizzBuzz";
  	}
  	else if(i % 3 == 0){
  		result[count++] = "Fizz";
  	}
  	else if(i % 5 == 0){
  		result[count++] = "Buzz";
  	} else {
  		result[count++] = String.valueOf(i);
  	}	
  }
  return result;
}
