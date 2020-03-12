package Strings;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        String string3 = string2.concat(string1);
        return string3; 
    }

    public char getChar(String string, int index) {
        char ch = string.charAt(index);
        return ch;
    }

    public String iCantSee(String string) {
        String str="";
        for (int i = 0; i<string.length(); i++)
            str+=" ";
        return str;
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        String str = "";
        for (int i = 0; i < string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))){
                str += Character.toLowerCase(string.charAt(i));
            }
            else if (Character.isLowerCase(string.charAt(i))){
                str+= Character.toUpperCase(string.charAt(i));
            }
            else{
                str+=string.charAt(i);
            }
        }
        return str;
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder str = new StringBuilder(); 
        for (int i = 0; i < string1.length() || i < string2.length(); i++){
            if (i < string1.length()) 
                str.append(string1.charAt(i));
            if (i < string2.length())
                str.append(string2.charAt(i));
        }
        return str.toString();
    }
}
