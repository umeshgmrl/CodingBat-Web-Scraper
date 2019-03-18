/*Given a list of strings, return a list where each string has "y" added at its start and en
d.moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]moreY(["hello", "there"]) → ["yhelloy", "y
therey"]moreY(["yay"]) → ["yyayy"]*/

public List<String> moreY(List<String> strings) {
  strings.replaceAll(s -> "y" + s + "y");
  return strings;
}
