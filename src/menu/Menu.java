package menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    static Scanner scan;
    static Animal animal;
    static String anmalName;
    static int anmalage;
    static int choseNum;
    static List<Object> animalList;

    public static void main(String[] args) {
        animalList = new ArrayList<Object>();
        scan = new Scanner(System.in);
        showOptions();

        choseNum = scan.nextInt();
        animal = new Animal();

        /*  if(choseNum==1){
         showSavedAnimal();
         showOptions();
         choseNum=scan.nextInt();
             
         if(choseNum==1){
         showSavedAnimal();
         showOptions();
         }else if(choseNum==2){
         animal=new Animal();
         animal.addAnemalAtribut();
         showOptions();
         }
                   
         }else if(choseNum==2){
         animal=new Animal();
         animal.addAnemalAtribut();
         showOptions();
         }*/
        switch (choseNum) {
            case 1:
                showSavedAnimal();
                break;
            case 2:

                animal.addAnemalAtribut();
                animalList.add(animal);
                Animal an = (Animal) animalList.get(0);
                System.out.println("show animal you saved");
                System.out.println("1- yes");
                System.out.println("2- no");

                choseNum = scan.nextInt();
                if (choseNum == 1) {
                    System.out.println("animal name : "+an.getAnimal_name() + "\n" +"animal color : "+ an.getAnimal_color() + "\n" 
                            + "animal age : "+an.getAnimal_age());
                } else {
                    break;
                }
            case 3:
                System.out.println("Task finished");

                break;
            default:
                System.out.println("Wrong choice");

        }

    }

    static void showOptions() {
        System.out.println("-------Chose Option-------");
        System.out.println("1- Show saved animal");
        System.out.println("2- Add new Animals");
        System.out.println("3_ Exit");
    }

    static void showSavedAnimal() {

        Animal lion = new Animal("Lion", "yallow", 15);

        System.out.println("animal name : "+lion.getAnimal_name() + "\n" +"animal color : "+ lion.getAnimal_color() + "\n" 
                +"animal age : "+ lion.getAnimal_age()+" \n  "
        );

        Tiger tiger = new Tiger("tiger", "red", 15);
        // tiger.setAnimal_age(12);
        System.out.println("Animal name " + tiger.getAnimal_name() + "\n" + "animal color : "+tiger.getAnimal_color() + "\n"
                + "animal age : "+tiger.getAnimal_age()
        );
        tiger.checkMove();

    }

}
