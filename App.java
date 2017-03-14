import java.io.Console;
import java.io.List;
import java.io.ArrayList;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    CD OKComputer = new CD("OK Computer", "Radiohead", 1997, 12);
    CD Nevermind = new CD("Nevermind", "Nirvana", 1991, 10 );
    CD EnterWuTang = new CD("Enter the Wu-Tang", "Wu Tang Clang", 1993, 9 );
    CD Illmatic = new CD("Illmatic", "Nas", 1994, 11);

    List<CD> allCD = new ArrayList<CD>();
    allCD.add(OKComputer);
    allCD.add(Nevermind);
    allCD.add(EnterWuTang);
    allCD.add(Illmatic);

    
  }
}
