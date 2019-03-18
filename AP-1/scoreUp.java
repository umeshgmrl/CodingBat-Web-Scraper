/*The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b"
, "b"}. the "answers" array contains a student's answers, with "?" representing a question
 left blank. The two arrays are not empty and are the same length. Return the score for th
is array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and 
+0 for each blank answer.scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6scoreUp(["
a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11scoreUp(["a", "a", "b", "b"], ["a", "a", "b"
, "b"]) → 16*/

public int scoreUp(String[] key, String[] answers) {
	int length = key.length;
	int marks = 0;
	for (int i=0; i<length; i++) {
		if (key[i] == answers[i]) {
			marks += 4;
		}
		else if(answers[i] == "?"){
			continue;
		}
		else{
			marks--;
		}
	}
	return marks;
}

