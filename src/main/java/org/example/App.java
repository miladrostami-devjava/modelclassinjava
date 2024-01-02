package org.example;

import org.example.modelObject.GermanDog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        GermanDog germanDog1 = new GermanDog();
        GermanDog   germanDog2 = new GermanDog(25);
        GermanDog   germanDog3 = new GermanDog("female");
        GermanDog   germanDog4 = new GermanDog("black",400.5);
        GermanDog  germanDog5 = new GermanDog("Hamburg",400d,30d);
        germanDog3.germanDogDetails();


    }
}
