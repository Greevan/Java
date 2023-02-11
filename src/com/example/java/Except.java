package com.example.java;
public class Except{
    public static void main(String[] args) {
    String welcome="welcome";
    char[] chars=welcome.toCharArray();
    char lastchar;
        try {
            lastchar = chars[chars.length-1];
            System.out.println(lastchar);

            String sub=welcome.substring(3);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index problem");
        }catch(StringIndexOutOfBoundsException f){
            System.out.println("String Index problem !");
        }
      }
}
