import java.io.File
import java.util.Scanner
import java.util.ArrayList

public class Main{
    public static void main(String args[]){
        File file = new File("../data.txt")
        Scanner scan = new Scanner(file)
        ArrayList data = new ArrayList<String>();

        while (scan.hasNextLine()){
            String line = scan.nextLine();
        }
    }
}