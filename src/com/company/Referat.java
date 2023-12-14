package com.company;

public class Referat extends Document{
    Author author;
    String topic;
    int countPages;

    public Referat() {
    }

    public Referat(Author author, String topic, int countPages) {
        this.author = author;
        this.topic = topic;
        this.countPages = countPages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getCountPages() {
        return countPages;
    }

    public void setCountPages(int countPages) {
        this.countPages = countPages;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Referat referat=(Referat) super.clone();
        referat.setAuthor((Author) author.clone());
        return referat;
    }

    @Override
    public void submit() {
        if(isSubmitted)
        {
            System.out.println("Submitted");
        }
        else
        {
            System.out.println("Not submitted");
        }
    }

    @Override
    public String toString() {
        return "Referat{" +
                "isSubmitted=" + isSubmitted +
                ", author=" + author +
                ", topic='" + topic + '\'' +
                ", countPages=" + countPages +
                '}';
    }

}
