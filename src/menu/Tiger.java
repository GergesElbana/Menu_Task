
package menu;

public class Tiger extends Animal{

    public Tiger(String animal_name, String animal_color, int animal_age) {
        super(animal_name, animal_color, animal_age);
    }
   
    @Override
    public void checkMove() {
        System.out.print("tiger can move \n");
    }
      
    
}
