public class RandomNim // creates a public class known as RandomNim
{
  public RandomNim(int startnum){ //links startnum from driver 
  }
  public int play(int pieces) //returns the player move or how many pieces to take away
  {
    if (pieces%3 == 0) //using the multiples of 3 it creates a value for pieces
      return 2;
    else return 1;
    
  }
}