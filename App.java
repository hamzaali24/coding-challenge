public class App {

    public String checkRepeatingLetters(String s) {

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            boolean isRepeated = false;

            // Check if the current character is repeated
            for (int j = 0; j < s.length(); j++) {
                if (i != j && currentChar == s.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }

            // If the current character is not repeated, return it as a string
            if (!isRepeated) {
                return String.valueOf(currentChar);
            }
        }

        // If no non-repeated character is found, return an empty string
        return " ";
    }

    public static void main(String[] args) {

        App app = new App();

        String s1 = "hello";
        String s2 = "aabcc";
        String s3 = "aabbcc";
        System.out.println(app.checkRepeatingLetters(s1));
        System.out.println(app.checkRepeatingLetters(s2));
        System.out.println(app.checkRepeatingLetters(s3));
    }

}
