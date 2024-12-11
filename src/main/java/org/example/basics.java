package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class basics {
    public static void main(String[] args) {
        String name = "Programming";
        StringBuilder sb = new StringBuilder();
        name.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println(sb);


    }
}