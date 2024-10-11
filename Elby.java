public class Elby {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }


    /**
     * Search for one word in phrase. The search is not case sensitive. This method
     * will check that the given goal is not a substring of a longer string (so,
     * for example, "I know" does not contain "no").
     *
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's
     * 	not found
     */

    public int findKeyword(String statement, String goal, int startPos) {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in the line below know "My mother"
        int goalPos = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a word
        while (goalPos >= 0) {
            // Find the string of length 1 before and after the word
            String before = " ", after = " ";

            if (goalPos > 0) {
                before = phrase.substring(goalPos - 1, goalPos);
            }

            if (goalPos + goal.length() < phrase.length()) {
                after = phrase.substring(goalPos + goal.length(),
                        goalPos + goal.length() + 1);
            }

            /* determine the values of goalPos, before, and after at this point */

            // If before and after aren't letters, we've found the word
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) &&
                    ((after.compareTo("a")  < 0) || (after.compareTo("z")  > 0))) {
                return goalPos;
            }

            // The last position didn't work, so let's find the next, if there is one.
            goalPos = phrase.indexOf(goal,goalPos + 1);
        }
        return -1;
    }

    public String getResponse(String statement) {
        String response = "";

        if (findKeyword(statement, "mother", 0) !=-1
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
            //pets====================================
        } else if (statement.indexOf("dog") >=0 || statement.indexOf("cat") >=0) {
            response = "Tell me more about your pets";
            //my name====================================
        } else if (statement.indexOf("Jonathan") >= 0) {
            response = "Jonathan is pretty good at coding";
            //no response ====================================
        } else if (statement.indexOf("") >= 0) {
            response = "Say something please";
            //extra 3 keywords====================================
        } else if (statement.indexOf("care") >= 0) {
            response = "Yes!:D";
        } else if (statement.indexOf("boom") >= 0) {
            response = "That sounds dangerous>:(";
        } else if (statement.indexOf("secret") >= 0) {
            response = "You can count on me! I won't tell a single soul ;)";
        }  if (statement.indexOf("no") >= 0) {
            response = "Why so negative?";
        }
        else {
            response = getRandomResponse();
        }

        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 8;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
            //more random responses ====================================
        } else if (whichResponse == 4) {
            response = "Very interesting.";
        } else if (whichResponse == 5) {
            response = "Mhm";
        } else if (whichResponse == 6) {
            response = "that's cool";
        } else if (whichResponse == 7) {
            response = ":)";
        }

        return response;
    }
}
