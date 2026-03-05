import java.util.*;

public class UsernameChecker {

    private HashMap<String, Integer> usernameMap = new HashMap<>();
    private HashMap<String, Integer> attemptFrequency = new HashMap<>();

    public UsernameChecker() {
        usernameMap.put("john_doe", 1);
        usernameMap.put("admin", 2);
    }

    public boolean checkAvailability(String username) {

        attemptFrequency.put(username,
                attemptFrequency.getOrDefault(username, 0) + 1);

        return !usernameMap.containsKey(username);
    }

    public List<String> suggestAlternatives(String username) {

        List<String> suggestions = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            suggestions.add(username + i);
        }

        suggestions.add(username.replace("_", "."));

        return suggestions;
    }

    public String getMostAttempted() {

        String maxUser = null;
        int max = 0;

        for (String user : attemptFrequency.keySet()) {
            if (attemptFrequency.get(user) > max) {
                max = attemptFrequency.get(user);
                maxUser = user;
            }
        }

        return maxUser;
    }

    public static void main(String[] args) {

        UsernameChecker checker = new UsernameChecker();

        System.out.println("john_doe available? " +
                checker.checkAvailability("john_doe"));

        System.out.println("jane_smith available? " +
                checker.checkAvailability("jane_smith"));

        System.out.println("Suggestions: " +
                checker.suggestAlternatives("john_doe"));

        System.out.println("Most attempted: " +
                checker.getMostAttempted());
    }
}