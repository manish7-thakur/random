import java.util.*;

public class Trie {
  class TrieNode {
    Character c;
    Map<Character, TrieNode> map;
    public TrieNode(Character c) {
      this.c = c;
      this.map = new HashMap<>();
    }
    TrieNode getChild(char c) {
      return map.get(c);
    }
    void addChild(char c, TrieNode node) {
      map.put(c, node);
    }
  }
  private TrieNode root = new TrieNode(' ');
  public void insert(String str) {
    TrieNode current = root;
    for(char c : str.toCharArray()) {
      TrieNode node = current.getChild(c);
      if(node == null) {
        node = new TrieNode(c);
        current.addChild(c, node);
      }
      current = node;
    }
  }

  public boolean search(String str) {
    TrieNode current = root;
    for(char c : str.toCharArray()) {
      TrieNode node = current.getChild(c);
      if(node == null) {
        return false;
      }
      current = node;
    }
    return true;
  }
}
