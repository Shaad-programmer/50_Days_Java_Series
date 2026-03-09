// Trie : Implementations, Insert & Search 

public class day_45{
    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert word
    public static void insert(String word) { // O(n)
        Node curr = root;

        for(int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    // Search word
    public static boolean search(String key) { // O(n)
        Node curr = root;

        for(int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    // StartsWith function
    public static boolean startsWith(String prefix) {
        Node curr = root;

        for(int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';

            if(curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String args[]) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        for (String word : words) {
            insert(word);
            System.out.println("Inserted " + word);
        }

        System.out.println("thee -> " + search("thee"));
        System.out.println("thor -> " + search("thor"));

        System.out.println("startsWith the -> " + startsWith("the"));
        System.out.println("startsWith thi -> " + startsWith("thi"));
    }
}