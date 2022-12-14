package Trietree;

public class TrieTree {
    public static class TrieNode{
        public int pass;
        public int end;
        public TrieNode[] nexts;

        public TrieNode(){
            pass=0;
            end=0;
            nexts=new TrieNode[26];
        }

    }

    public static class Trie{
        private TrieNode root;
        Trie(){
            root=new TrieNode();
        }
        public void insert(String word){
            if(word==null){
                return;
            }
            char[] chs=word.toCharArray();
            TrieNode node=root;
            node.pass++;
            int index=0;
            for(int i=0;i<chs.length;i++){
                index=chs[i]-'a';
                if(node.nexts[index]==null){
                    node.nexts[index]=new TrieNode();
                }
                node=node.nexts[index];
                node.pass++;
            }
        }
        public int search(String word){
            if(word==null){
                return 0;
            }

            TrieNode node=root;
            char[] chs=word.toCharArray();
            int index;
            for(int i=0;i<chs.length;i++){
                index=chs[i]-'a';
                if(node.nexts[index]==null){
                    return 0;
                }
                node=node.nexts[index];
            }
            return node.end;
        }

        public int prefixNumber(String word){
            if(word==null){
                return 0;
            }
            char[] chs=word.toCharArray();

            TrieNode node=root;
            int index;
            for(int i=0;i<chs.length;i++){
                index=chs[i]='a';
                if(node.nexts[index]==null){
                    return 0;
                }
                node=node.nexts[index];
            }
            return node.pass;
        }
        public void delete(String word){
            if(search(word)!=0){
                char[] chs=word.toCharArray();
                int index=0;
                TrieNode node=root;
                node.pass--;
                for(int i=0;i<chs.length;i++){
                    index=chs[i]-'a';
                    if(--node.nexts[index].pass==0){
                        node.nexts[index]=null;
                        return;
                    }

                    node=node.nexts[index];
                }
                node.end--;
            }
        }




    }




}
