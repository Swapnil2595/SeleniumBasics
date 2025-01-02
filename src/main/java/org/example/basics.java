package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class basics {
    public static void main(String[] args) {
//        String name = "Nikhil";
////        StringBuilder sb = new StringBuilder();
////        name.chars().distinct().forEach(c->sb.append((char)c));
////        System.out.println(sb);
//
//        HashSet<Character> set = new LinkedHashSet();
//
//        char a[] = name.toCharArray();
//
//        for(char c :a){
//            set.add(c);
//        }
//        for(char o:set){
//            System.out.print(o);
//        }


//        String s = "Swapnil Rajpure";
//
//        String [] words = s.split(" ");
//        StringBuffer sb = new StringBuffer();
//
//        for(String word:words){
//            StringBuffer sb2 = new StringBuffer(word);
//            sb.append(sb2.reverse()).append(" ");
//        }
//
//        System.out.print(sb.toString().trim());


        int a[] = {0,0,1,2,3,4,5};

        int start = a[0];
        int end = a.length-1;

        while(start<end){
            int temp =a[start];
            a[start]=a[end];
            a[end]=temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(a));



    }
}