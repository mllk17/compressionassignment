import java.io.*;
import java.lang.*;

public class anotherone {
    //Sam-I-am; I do not like them; And I will eat them; green eggs and ham; I will eat them;
    //on a; with a; in a
    public static void main(String[] args) throws Exception{
        //key = how you're referencing it; value = what we're storing
        //arr[0] = 10; 0 = key and 10 is value
        compress();
        //decompress();
    }

    public static int compress() throws Exception{
        //ArrayList<String> words = new ArrayList<String>();
        //HashMap<String, String> first = new HashMap<String, String>();
        BufferedReader reader = new BufferedReader(new FileReader("GreenEggs.txt"));
        //key = how you're referencing it; value = what we're storing
        //arr[0] = 10; 0 = key and 10 is value
        String at = reader.readLine();
        /*String one = "Sam-I-am";
        String two = "I do not like them";
        String three = "And I will eat them";
        String four = "green eggs and ham";

        String six = "on a";
        String seven = "with a";
        String eight = "in a";*/
        String now = "";
        int totalChar = 0;
        int newTotalChar = 0;
        BufferedWriter writer = new BufferedWriter(new FileWriter("blueEggs.txt"));
        while(at != null){
            totalChar += at.length();
            now = at.replace("Sam-I-am", "!").replace("I do not like them", "@").replace("green eggs and ham", "#")
                    .replace("And I will eat them", "+").replace("on a", "%").replace("with a", "^")
                    .replace("in a", "&").replaceAll("\\s+","");
            /*for(int x = 0; x < 8; x++) {
                if(x == 0){
                    now = at.replaceAll("Sam-I-am", "!");
                }
                else if(x == 1) {
                    now = at.replaceAll("I do not like them", "@");
                }
                else if(x == 2) {
                    now = at.replaceAll("green eggs and ham", "#");
                }
                else if(x == 3) {
                    now = at.replaceAll("And I will eat them", "+");
                }
                else if(x == 4) {
                    now = at.replaceAll("on a", "%");
                }
                else if(x == 5) {
                    now = at.replaceAll("with a", "^");
                }
                else if(x == 6) {
                    now = at.replaceAll("in a", "&");
                }
                else if(x == 7) {
                    now = at.replaceAll("Not", "(");
                }
                else{
                    now = now;
                }
                //System.out.println("at " + at);
                //System.out.println("now " + now);
            }*/
            writer.write(now);
            writer.newLine();
            newTotalChar += now.length();
            at = reader.readLine();
        }
        //first.put("Sam-I-am", "!");
        //first.replace()
        reader.close();
        writer.close();
        return (newTotalChar-totalChar)/totalChar;
    }

    public static void decompress(){
        //HashMap<String, String> second = new HashMap<String, String>();
        //second.put("!", "Sam-I-am");
    }
}
