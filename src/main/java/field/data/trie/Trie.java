package field.data.trie;

public class Trie {
  private final Node root;

  public Trie() {
    root = new Node();
  }

  public void insert(String word) {
    Node node = root;
    for (int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      node = node.getChildren().computeIfAbsent(c, k -> new Node());
    }
    node.setWord(true);
  }

  public boolean contains(String word) {
    Node node = root;
    for(int i = 0; i < word.length(); i++) {
      char c = word.charAt(i);
      node = node.getChildren().get(c);
      if(node == null) {
        return false;
      }
    }
    return node.isWord();
  }

  public boolean delete(String word) {
    return delete(root, word, 0);
  }

  private boolean delete(Node node, String word, int position) {
    if(word.length() == position) {
      if(!node.isWord()) {
        return false;
      }
      node.setWord(false);
      return node.getChildren().isEmpty();
    }
    char c = word.charAt(position);
    Node child = node.getChildren().get(c);
    if(child == null) {
      return false;
    }
    boolean shouldDelete = delete(child, word, position + 1);
    if(shouldDelete && !child.isWord()) {
      node.getChildren().remove(c);
      return node.getChildren().isEmpty();
    }
    return false;
  }
}
