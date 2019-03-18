/*We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
 Loop over and then return the given array of non-empty strings as follows: if a string ma
tches an earlier string in the array, swap the 2 strings in the array. When a position in 
the array has been swapped, it no longer matches anything. Using a map, this can be solved
 making just one pass over the array. More difficult than it looks.allSwap(["ab", "ac"]) →
 ["ac", "ab"]allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "c
y", "cx", "bx", "ax", "azz", "aaa"]allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"
]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]*/

public String[] allSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap();
  for(int i=0; i< strings.length; i++){
  	Character c = strings[i].charAt(0);
  	if(!map.containsKey(c)){
  		map.put(c, i);
  	}
  	else{
  		String temp = strings[i];
  		strings[i] = strings[map.get(c)];
  		strings[map.get(c)] = temp;
  		map.remove(c);
  	}
  }
  return strings;
}