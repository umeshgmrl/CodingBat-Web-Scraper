/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smi
ling. We are in trouble if they are both smiling or if neither of them is smiling. Return 
true if we are in trouble.monkeyTrouble(true, true) → truemonkeyTrouble(false, false) → tr
uemonkeyTrouble(true, false) → false*/

public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  
  
  if((aSmile&&bSmile)||(!aSmile&&!bSmile))
  {
    return true;
  }
  else return false;
}
