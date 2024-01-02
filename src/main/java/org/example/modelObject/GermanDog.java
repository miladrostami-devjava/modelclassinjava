package org.example.modelObject;

import org.example.super_class.Dog;
import org.example.super_interface.Animal;

public class GermanDog extends Dog implements Animal {
  //region  Step_1: Field Declarations
    private String birthPlace;
    private Double price;
    private static Character modelDog;
//endregion


 //region   Step_2: static Initializers
static {
 modelDog = 'G';
 }

 //endregion

 //region Step_3: Instance Initializers
 {
     price = 500.4;
     birthPlace = "berlin city";
 }
 //endregion

 //region Step_4: Constructors

    public GermanDog() {
    this.age = 20;
    this.name = "german dog";
    }
    public GermanDog(Integer age){
        this.age = age;
    }

    public GermanDog(String gender ) {
        this.gender = gender;
    }
    public GermanDog(String color, Double price) {
    this.color = color;
        this.price = price;
    }

    public GermanDog(String birthPlace, Double price,Double weight) {
       this.birthPlace = birthPlace;
       this.price = price ;
       this.weight = weight;
    }
    //endregion


  //region Step_5: Method Declarations

    @Override
    public void eating() {
        System.out.println("german dog eat...");
    }

    @Override
    public void moving() {
        System.out.println("german dog move...");

    }

    @Override
    public String smelling(String smell) {

        return "german dog " + smell;
    }

    @Override
    public Long stature(Long size) {
        System.out.println("german dog size is :");
        return  size;
    }

    @Override
    public String sounding(String sound) {
        return "german dog sound " + sound.toUpperCase();
    }

    public  void germanDogDetails(){
        System.out.println("german dog of age is " + " " + getAge());
        System.out.println("german dog of name is " + " " + getName());
        System.out.println("german dog of price is " + " " + price);
        System.out.println("german dog of brithPlace is " + " " + birthPlace);
        System.out.println("german dog of weight is " + " " + getWeight());
        System.out.println("german dog of color is " + " " + getColor());
        System.out.println("german dog of gender is " + " " + getGender());
    }




    //endregion


}
