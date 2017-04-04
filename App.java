import java.io.Console;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    CD OKComputer = new CD("OK Computer", "Radiohead", 1997, 12);
    CD Nevermind = new CD("Nevermind", "Nirvana", 1991, 10 );
    CD EnterWuTang = new CD("Enter the Wu-Tang", "Wu Tang Clan", 1993, 9 );
    CD Illmatic = new CD("Illmatic", "Nas", 1994, 11);

    List<CD> allCD = new ArrayList<CD>();
    allCD.add(OKComputer);
    allCD.add(Nevermind);
    allCD.add(EnterWuTang);
    allCD.add(Illmatic);

    List<String> menuList =  Arrays.asList(
            "Please choose one of the following options: ",
            "1: See all CDs",
            "2: Search based on release year",
            "3: Search based on price range",
            "4: Search based on artist",
            "5: Exit"
    );

    String menu = String.join("\n", menuList);

    System.out.println("____________________________________________________"+"\n");
    System.out.println("Hello. Welcome to our CD Store.");
    boolean programRunning = true;
    while(programRunning){
      System.out.println("____________________________________________________"+"\n");
      System.out.print(menu);
      String navigationChoice = myConsole.readLine();
      String choice = navigationChoice;
      switch(choice) {
        case "1":
          for ( CD individualCD : allCD ) {
            cdInfo(individualCD);
          }
          break;
        case "2":
          System.out.println("Which year would you like to search by?");
          int userYear = Integer.parseInt(myConsole.readLine());
          for ( CD individualCD : allCD ) {
            if (individualCD.mYear == userYear) {
              cdInfo(individualCD);
            }
          }
          break;
        case "3":
          System.out.println("How much are you looking to spend?");
          int userPrice = Integer.parseInt(myConsole.readLine());
          for ( CD individualCD : allCD ) {
            if (individualCD.mPrice == userPrice ) {
              cdInfo(individualCD);
            }
          }
          break;
        case "4":
          System.out.println("Which particular artist would you like to search for?");
          String userInput = myConsole.readLine();
          Character userArtistMod = userInput.charAt(0);
          String userArtistModified = userArtistMod.toString().toUpperCase();
          String userArtist = userArtistModified + userInput.substring(1);
          for ( CD individualCD : allCD ) {
            if (individualCD.mArtist.equals(userArtist)) {
            cdInfo(individualCD);
            }
          }
          break;
        case "5":
          programRunning = false;
          break;
        case "":
          System.out.println("Please enter a valid input.");
          break;
      }
    }
  }

  private static void cdInfo(CD cd) {
    CD individualCD = cd;
    System.out.println("---------------");
    System.out.println(individualCD.mAlbum);
    System.out.println(individualCD.mArtist);
    System.out.println(individualCD.mYear);
    System.out.println("$" + individualCD.mPrice);
    System.out.println("---------------");
  }

}
