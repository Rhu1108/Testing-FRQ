
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class HorseBarn
{

  private ArrayList<Horse> spaces = new ArrayList<Horse>();

  public HorseBarn()
  {

    try
    {
      Scanner sc = new Scanner(new File("horsedata.txt"));
   
      while (sc.hasNextLine())
      {
 
        String temp = sc.nextLine().trim();
        if (temp.equals(""))
        {
 
          spaces.add(null);
        }
        else
        {  

          String[] tokens = temp.split(",");  
          String name = tokens[0];
          int  weight = Integer.parseInt(tokens[1]);
          spaces.add(new Horse(name, weight));
        }
      }
    } catch (Exception e) { System.out.println("Error reading or parsing horsedata.txt" + e); }
  }
  public ArrayList<Horse> getSpaces()
  {
    return spaces;
  }
}
