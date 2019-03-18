/*Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates. A and B will both have a length which is N or more. The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order, copying elements directly to the new array.mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]*/

		public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] arr = new String[n];
  int count = 0;
  for (int i=0; i<a.length; i++) {
  	if(count >= n) break;
  	if(a[i]==b[i]){
  		arr[count++] = a[i];
  	} else {
  		if(count >= n) break;
  		arr[count++] = a[i];
  		if(count >= n) break;
  		arr[count++] = b[i];
  	}
  }
  return arr;
}

		