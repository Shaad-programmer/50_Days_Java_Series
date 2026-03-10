public class day_46{

    static class Node{
        Node[] children = new Node[26];
    }

    static Node root;

    public static void insert(String word){
        Node curr = root;

        for(int i=0;i<word.length();i++){
            int idx = word.charAt(i)-'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }
    }

    public static void buildTrie(String str) {
        root = new Node();

        for(int i=0;i<str.length();i++){
            insert(str.substring(i));
        }
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }

        int count = 0;

        for(int i=0;i<26;i++){
            if(root.children[i] != null){
                count += countNodes(root.children[i]);
            }
        }

        return 1 + count;
    }

    public static void main(String args[]){

        String str = "ababa";

        buildTrie(str);

        int totalNodes = countNodes(root);

        System.out.println("Unique Substrings = " + (totalNodes-1));

    }
}