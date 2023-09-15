import java.util.ArrayList;

public class WordPairList {
    private ArrayList<WordPair> allPairs;


    public WordPairList(String[] words)
    {
        int wordsLength = words.length;
        allPairs = new ArrayList<>();
        for (int i = 0; i < wordsLength; ++i) {
            for (int j = i+1; j < wordsLength; ++j) {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }
    public int numMatches()
    {
        int matches = 0;
        for (WordPair wordPair : allPairs) {
            if (wordPair.getFirst().equals(wordPair.getSecond())) {
                matches++;
            }
        }
        return matches;

    }
    public ArrayList<WordPair> getAllPairs() {return allPairs;}
}
