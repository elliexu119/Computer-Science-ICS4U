package resources;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashSet;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;

/**
 *
 * @author 1xuell
 */
public class test {

    /**
     * @param args the command line arguments
     */
    NavigableMap<Integer, Set<String>> ordered;
    Map<String, Integer> frequency;

    public static void main(String[] args) {
    }

    public void search() {
        String word = "word word can can if if if asklfhsd";
        int count = frequency.getOrDefault(word, 0);
        if (count > 0) {
            ordered.get(count).remove(word);
        }
        ordered.computeIfAbsent(count + 1, HashSet::new).add(word);
        frequency.put(word, count + 1);
    }
}
