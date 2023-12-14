package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        Author author = new Author("Hopkins");
        Referat referat=new Referat(author, "Something", 200);
        Referat second= (Referat) referat.clone();
        Referat third= (Referat) referat.clone();
        Referat fourth= (Referat) referat.clone();
        second.getAuthor().setName("Jany Rodary");
        third.getAuthor().setName("Kalina Peicheva");
        fourth.getAuthor().setName("J.K. Rouling");
        referat.submit();
        second.submit();
        third.submit();
        fourth.submit();
        System.out.println(fourth.getAuthor().getName());
    }
}
