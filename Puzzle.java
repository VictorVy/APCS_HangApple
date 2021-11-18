import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle
{
   String word, guessed = "";
   
   public Puzzle()
   {
       word = "LISTEN";
   }
   
   public boolean makeGuess(String guess)
   {
       guess = guess.toUpperCase();
       if(guess.length() > 1 || guessed.contains(guess)) return true; //prevents repeated and multi-letter guesses
       guessed += guess;
       return word.contains(guess);
   }
   
   public void show()
   {
       System.out.print("Puzzle: ");
       
       for(int i = 0; i < word.length(); i++)
           System.out.print(guessed.contains("" + word.charAt(i)) ? word.charAt(i) : "_");
       
       System.out.print("\nGuessed: ");
       
       StringBuilder out = new StringBuilder();
       
       for(int i = 0; i < guessed.length(); i++)
           out.append(i == 0 ? "" : ", ").append(guessed.charAt(i)).append(" ");
       
       System.out.println(out);
       
       // String out = Arrays.toString(guessed.split("")).substring(1);
       
       // if(out.length() > 1)
           // System.out.print(out.substring(0, out.length() - 1));
   }
   
   public boolean isUnsolved()
   {
       for(int i = 0; i < word.length(); i++)
           if(!guessed.contains("" + word.charAt(i)))
               return true;
       return false;
   }
   
   public String getWord() { return word; }
}
