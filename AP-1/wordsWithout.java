/*Given an array of strings, return a new array without the strings that are equal to the ta
rget string. One approach is to count the occurrences of the target string, make a new arr
ay of the correct length, and then copy over the correct strings.wordsWithout(["a", "b", "
c", "a"], "a") → ["b", "c"]wordsWithout(["a", "b", "c", "a"], "b") → ["a", "c", "a"]wordsW
ithout(["a", "b", "c", "a"], "c") → ["a", "b", "a"]*/

public String[] wordsWithout(String[] words, String target) {
	int length = words.length;
	int count = 0;
	for (int i=0; i<length; i++) {
		if (words[i] != target) {
			count++;
		}
	}
	String[] arr = new String[count];
	count = 0;
	for (int i=0; i<length; i++) {
		if (words[i] != target) {
			arr[count++] = words[i];
		}
	}
	return arr;
}
