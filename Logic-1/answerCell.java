/*Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.answerCell(false, false, false) → trueanswerCell(false, false, true) → falseanswerCell(true, false, false) → false*/

		public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isMorning)
  {
    if(isMom&&isAsleep!=true) return true;
    return false;
  }
  if(!isAsleep)
  {
    return true;
  }
  return false;
}

		