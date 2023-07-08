package home2;

public class Task5b {
    public static void main(String[] args) {
        String text = "Completely random text in English. In it, we just need to determine how many times the character 'a' occurs there. And we can use the split method and the length method.";
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            String lowercaseWord = word.toLowerCase();
            for (int i = 0; i < lowercaseWord.length(); i++) {
                if (lowercaseWord.charAt(i) == 'a') {
                    count++;
                }
            }
        }

        System.out.println("Количество символов 'a': " + count);
    }
}

