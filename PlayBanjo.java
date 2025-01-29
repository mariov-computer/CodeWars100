// Challenge#3 Prompt: Are You Playing Banjo?
//Create a function which answers the question "Are you playing banjo?". If your name starts with the letter "R" or lower case "r", you are playing banjo!
//The function takes a name as its only argument, and returns one of the following strings:
// name + " plays banjo" 
//name + " does not play banjo"
// Note: Names given are always valid strings.
//Begin PlayBanjo.java [Java]
public class Banjo{
  public static String areYouPlayingBanjo(String name){
if (name.startsWith("R") || name.startsWith("r")) {
            return name + " plays banjo";
        } else {
            return name + " does not play banjo";
        }
    }
 public static void main(String[] args) {
        // Test cases
        System.out.println(areYouPlayingBanjo("Rick")); // Rick plays banjo
        System.out.println(areYouPlayingBanjo("Martin")); // Martin does not play banjo
        System.out.println(areYouPlayingBanjo("rachel")); // rachel plays banjo
    }
}
