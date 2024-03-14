import java.util.*;public class OrangeTaskCountDublicate {

    public static void main(String args[]) {


        String text = "The enormous room on the ground floor faced towards the north. Cold for all the summer beyond the panes, for all the tropical heat of the room itself, a harsh thin light glared through the windows, hungrily seeking some draped lay figure, some pallid shape of academic gooseflesh, but finding only the glass and nickel and bleakly shining porcelain of a laboratory. Wintriness responded to wintriness. The overalls of the workers were white, their hands gloved with a pale corpse-colored rubber. The light was frozen, dead, a ghost. Only from the yellow barrels of the microscopes did it borrow a certain rich and living substance, lying along the polished tubes like butter, streak after luscious streak in long recession down the worktables.";
        String[] splittedWords = text.split(" ");
        Map<String, Integer> mp = new HashMap<String, Integer>();
        int count = 0;

        for (int i = 0; i < splittedWords.length; i++) {
            // Check if the word is already in the map
            if (mp.containsKey(splittedWords[i])) {
                // If it is, update its count
                mp.put(splittedWords[i], mp.get(splittedWords[i]) + 1);
            } else {
                // If not, add it with a count of 1
                mp.put(splittedWords[i], 1);
            }
        }
        // Now, we'll remove words that are not repeated (i.e., count is 1)
        mp.entrySet().removeIf(entry -> entry.getValue() == 1);

        // Check if there are any repeated words
        if (mp.isEmpty()) {
            System.out.println("No repeated words found.");
        } else {
            System.out.println(mp);
        }
    }
}
