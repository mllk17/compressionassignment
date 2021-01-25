import java.io.*;
import java.lang.*;

public class mainone {
    //Sam-I-am; I do not like them; And I will eat them; green eggs and ham; I will eat them;
    //on a; with a; in a
    public static void main(String[] args) throws Exception{
        //key = how you're referencing it; value = what we're storing
        //arr[0] = 10; 0 = key and 10 is value
        System.out.println(compress());
        decompress();
    }

    public static float compress() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("GreenEggs.txt"));
        String at = reader.readLine();
        String now = "";
        float totalChar = 0;
        float newTotalChar = 0;
        BufferedWriter writer = new BufferedWriter(new FileWriter("blueEggs.txt"));
        while(at != null){
            totalChar += at.length();
            now = at.replace("Sam-I-am", "!").replace("I do not like them", "@").replace("green eggs and ham", "#")
                    .replace("And I will eat them", "+").replace("on a", "%").replace("with a", "^")
                    .replace("in a", "&").replace("I will not eat them", "(").replace("Not", ")")
                    .replace("Would you", "{");
            writer.write(now);
            writer.newLine();
            newTotalChar += now.length();
            at = reader.readLine();
        }
        reader.close();
        writer.close();
        System.out.println("totalChar is " + totalChar);
        System.out.println("newTotalChar is " + newTotalChar);
        return (totalChar-newTotalChar)/totalChar;
    }

    public static void decompress() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("blueEggs.txt"));
        String at = reader.readLine();
        String now = "";
        BufferedWriter writer = new BufferedWriter(new FileWriter("redEggs.txt"));
        while(at != null){
            now = at.replace("!","Sam-I-am").replace("@", "I do not like them").replace("#", "green eggs and ham")
                    .replace("+", "And I will eat them").replace("%", "on a").replace("^", "with a")
                    .replace("&", "in a");
            writer.write(now);
            writer.newLine();
            at = reader.readLine();
        }
        reader.close();
        writer.close();
    }
}