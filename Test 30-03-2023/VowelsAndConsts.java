public class Main {

    public static void main(String[] args) {
        String word = "Computer Science Engineering";
        String consts = "";
        String vowels = "";
        
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    vowels += " " + c;
                } else {
                    consts += " " + c;
                }
            }
        }
        
        System.out.println("Constants: " + consts);
        System.out.println("Vowels: " + vowels);
    }
    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}