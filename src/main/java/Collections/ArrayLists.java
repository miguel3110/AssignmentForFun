package Collections;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list2);
        int sum=0;
        for (int i=0; i<list1.size(); i++)
            sum+=list1.get(i);
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        newlist.addAll(original);
        newlist.removeAll(Collections.singleton(toRemove));
        return newlist;
    }

    public boolean happyList(ArrayList<String> original) {
        for (int i = 1; i < original.size(); i++){
            ArrayList<Character> currentChars = characterArrayList(original.get(i));
            ArrayList<Character> lastChars = characterArrayList(original.get(i-1));
            boolean check = false;
            for (Character last: lastChars){
                for (Character current: currentChars){
                    if (last.equals(current)){
                        check = true;
                    }
                }
            }
            if (!check){
                return false;
            }
        }
        return true;
    }

    private ArrayList<Character> characterArrayList (String s){
        ArrayList <Character> newlist = new ArrayList<Character>();
        int i = 0;
        while(i< s.length()){
            newlist.add(s.charAt(i));
            i++;
        }
        return newlist;
    }
}
