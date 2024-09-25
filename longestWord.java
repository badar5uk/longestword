public class LongestWord {
    //assign a string with a sentence
    //write  a programme that can identify the longest word based on character count
    //print a statement that shows the longest word
    public static void main(String[] args) {
        String exampleSentence = "The quick brown fox jumped over the lazy dog";
        String[] words = exampleSentence.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Longest word: " + longestWord);
    }
}
