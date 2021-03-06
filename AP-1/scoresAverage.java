/*Given an array of scores, compute the int average of the first half and the second half, a
nd return whichever is larger. We'll say that the second half begins at index length/2. Th
e array length will be at least 2. To practice decomposition, write a separate helper meth
od int average(int[] scores, int start, int end) {  which computes the average of the elem
ents between indexes start..end. Call your helper method twice to implement scoresAverage(
). Write your helper method after your scoresAverage() method in the JavaBat text area. No
rmally you would compute averages with doubles, but here we use ints so the expected resul
ts are exact.scoresAverage([2, 2, 4, 4]) → 4scoresAverage([4, 4, 4, 2, 2, 2]) → 4scoresAve
rage([3, 4, 5, 1, 2, 3]) → 4*/

public int scoresAverage(int[] scores) {
    int first = average(scores, 0, scores.length / 2);
    int second = average(scores, scores.length / 2, scores.length);
    return Math.max(first, second);
}

public int average(int[] scores, int start, int end) {
    int sum = 0;
          
    for(int i = start; i < end; i++)
        sum += scores[i];

    return sum / (end - start);
}