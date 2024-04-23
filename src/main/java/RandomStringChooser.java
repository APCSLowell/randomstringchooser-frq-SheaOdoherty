import java.util.*;
public class RandomStringChooser
{
 private ArrayList<String> availableStrings;
    private Random rand;

    public RandomStringChooser(String[] wordArray) {
        availableStrings = new ArrayList<>();
        for (String word : wordArray) {
            availableStrings.add(word);
        }
        rand = new Random();
    }

    public String getNext() {
        if (availableStrings.isEmpty()) {
            return "NONE";
        } else {
            int index = rand.nextInt(availableStrings.size());
            String chosen = availableStrings.get(index);
            availableStrings.remove(index);
            return chosen;
        }
}
