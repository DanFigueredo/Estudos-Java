package javacore.methodoverloading.test;

import javacore.methodoverloading.domain.anime;

public class TestAnime01 {
    public static void main(String[] args) {
        anime anime = new anime();
        anime.init("Romance", 24);
        anime.print();
    }
}
