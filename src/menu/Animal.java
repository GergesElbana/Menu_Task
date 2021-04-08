
package menu;

import java.util.ArrayList;
import java.util.Scanner;
import static menu.Menu.animal;


public class Animal {
    private String animal_name;
    private String animal_color;
    private int animal_age;

    public Animal() {
    }

    public Animal(String animal_name, String animal_color, int animal_age) {
        this.animal_name = animal_name;
        this.animal_color = animal_color;
        this.animal_age = animal_age;
    }

    public String getAnimal_name() {
        return animal_name;
    }

    public void setAnimal_name(String animal_name) {
        this.animal_name = animal_name;
    }

    public String getAnimal_color() {
        return animal_color;
    }

    public void setAnimal_color(String animal_color) {
        this.animal_color = animal_color;
    }

    public int getAnimal_age() {
        return animal_age;
    }

    public void setAnimal_age(int animal_age) {
        this.animal_age = animal_age;
    }
    
    
    public void eating(){};
     public void runing(){};
    
    public void checkMove( ){
   }
      void addAnemalAtribut(){
      Scanner scan=new Scanner(System.in);
      String str;
      int number;
      animal=new Animal();
      System.out.println("1- Add  Animal Name");
      str=scan.next();
      animal.setAnimal_name(str);
      System.out.println("1- Add  Animal color");
      str=scan.next();
      animal.setAnimal_color(str);
      System.out.println("1- Add  Animal age");
      number=scan.nextInt();
      animal.setAnimal_age(number);
      
     /* animalList=new ArrayList<>();
       animalList.add(animal);*/
     
    }
    
    
}
