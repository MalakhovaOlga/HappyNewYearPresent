/*
 Формируется новогодний подарок.
 Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 У каждой сладости есть название, вес, цена и свой уникальный параметр.
 Необходимо собрать подарок из сладостей.
 Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

import Sweets.*;

public class HappyNewYearPresent {
    public static void main (String args[]) {
        Bar bar1 = new Bar("Alenka",100,80,"111");
        Candy candy1 = new Candy("citrus",50,60, "321");
        Jellybean fruittella = new Jellybean();
        fruittella.setName("fruittella");
        fruittella.setWeight(50);
        fruittella.setPrice(60);
        fruittella.setCode("010");
        Toffee toffee = new Toffee("noName",50,259,"200");
        Sweet present [] = {bar1,candy1,fruittella,toffee};
        float presentWeight = 0;
        float presentPrice = 0;
        System.out.println("Наполнение подарка: ");
        for (Sweet someSweet : present) {
            presentWeight += someSweet.getWeight();
            presentPrice += someSweet.getPrice();
            System.out.println(someSweet);
        }

        System.out.println();
        System.out.println("Общий вес подарка: " + presentWeight);
        System.out.println("Общая стоимость подарка: " + presentPrice);
    }
}
