/*Given a list of strings, return a list where each string is replaced by 3 copies of the st
ring concatenated together.copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]cop
ies3(["24", "a", ""]) → ["242424", "aaa", ""]copies3(["hello", "there"]) → ["hellohellohel
lo", "theretherethere"]*/

public List<String> copies3(List<String> strings) {
  strings.replaceAll(s -> (s + s + s));
  return strings;
}
