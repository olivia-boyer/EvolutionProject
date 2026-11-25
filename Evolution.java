import java.util.ArrayList;
import java.util.Random;
import java.util.random.*;

public class Evolution {
    private static Item[] itemList = new Item[25];
    private Farm p1; //first parent
    private Farm p2; //second parent

    private static void initializeItems() {
        itemList[0] = new Item(0,"empty",null,0,0,0,0, 0);
        itemList[1] = new Item(1, "blueberry", Item.Type.CROP, 80, 50*3, 13, 4, 0);
        itemList[2] = new Item(2, "corn", Item.Type.CROP, 150, 50, 14, 4, 0);
        itemList[3] = new Item(3, "hops", Item.Type.CROP, 60, 25, 11, 1, 0);
        itemList[4] = new Item(4, "hot pepper", Item.Type.CROP, 40, 40, 5, 3, 0);
        itemList[5] = new Item(5, "melon", Item.Type.CROP, 80*4, 250, 12, 0, 0);
        itemList[6] = new Item(6, "poppy", Item.Type.CROP, 100*7, 140, 7, 0, 0);
        itemList[7] = new Item(7, "radish", Item.Type.CROP, 40*4, 90, 6, 0, 0);
        itemList[8] = new Item(8, "red cabage", Item.Type.CROP, 100*3, 260, 9, 0, 0);
        itemList[9] = new Item(9, "starfruit", Item.Type.CROP, 400*2, 750, 13, 0, 0);
        itemList[10] = new Item(10, "summer spangle", Item.Type.CROP, 50*4, 90, 8, 0, 0);
        itemList[11] = new Item(11, "summer squash", Item.Type.CROP, 20, 45, 6, 3, 0); //cost = sell price of seeds
        itemList[12] = new Item(12, "sunflower", Item.Type.CROP, 200, 80, 8, 8, 0); //assuming seeds granted at harvest will be enough to replant
        itemList[13] = new Item(13, "tomato", Item.Type.CROP, 50, 60, 11, 4, 0);
        itemList[14] = new Item(14, "wheat", Item.Type.CROP, 10*7, 25, 4, 0, 0);
        itemList[15] = new Item(15, "pineapple", Item.Type.CROP, 240, 300, 14, 7, 0); //sell price using opportunity cost of not planting seeds
        itemList[16] = new Item(16, "taro root", Item.Type.CROP, 20*2, 100, 10, 0, 0); //TODO: account for pond issue
        itemList[17] = new Item(17, "tea leaves", Item.Type.CROP, 50, 50, 20, 1, 0);
        itemList[18] = new Item(18, "mixed seeds",Item.Type.CROP, 30 * (0+0+4+7)/4, (50+40+90+ 25) / 4, (14+6+4+5)/4, (4+3+0+0)/4, 0);//averaging values of possible crops
        itemList[19] = new Item(19, "Sprinkler", Item.Type.SPRINKLER, 180, 0, 0, 0, 4);
        itemList[20] = new Item(20, "Quality Sprinkler", Item.Type.SPRINKLER, 420, 0, 0, 0, 8);
        itemList[21] = new Item(21, "Iridium Sprinkler", Item.Type.SPRINKLER, 1750, 0, 0, 0, 24);
        itemList[22] = new Item(22, "Scarecrow", Item.Type.SCARECROW, 135, 0, 0, 0, 0);

    }
    
    
    //roullette based selection
    //assigns first choice to p1 and second to p2
    private static void roullette(ArrayList<Farm> farms) {
        Random rand = new Random();
        float choice = rand.nextFloat();

    }

    //rank based selection
    //assigns first choice to p1 and second to p2
    private static void rank(ArrayList<Farm> farms) {
        Random rand = new Random();
        float choice = rand.nextFloat(); 
    }

    //creates offspring from p1 and p2
    //returns true on success and false on failure
    private static boolean fusion() {
        return false;
    }

    //theoretically done
    //function to create mutations on new offspring
    private static void mutate(Farm farm) {
        Random rand = new Random();
        int count = rand.nextInt(0, 40); //number of mutations. maximum is a little over 1% of total area
        for (int i = 0; i < count; i++) {
            //get location to change
            int row = rand.nextInt(0,52);
            int col = rand.nextInt(0,72);

            if (farm.layout[row][col] >= 0) { //can't change blocked off sections
                farm.layout[row][col] = rand.nextInt(0,itemList.length-1); //change to random item
            }
        }
    }

    //function to do the evolution
    private static void evolve(ArrayList<Farm> farms) {
        roullette(farms);
        fusion();
        int children = 4; //number of children produced in fusion
        for (int i = farms.size() - children; i < farms.size(); i++) {
            mutate(farms.get(i));
        }
    }
    
    public static void main(String[] args) {
        initializeItems(); //initialize the item array

        //Create initial population let's do like 10 (?)
        ArrayList<Farm> Farms = new ArrayList<Farm>(100);

        for (int i = 0; i < 10; i++) {
            //
            Farms.add(new Farm());
            Farms.get(i).randomize();
        }
        //loop of evolution
        boolean keepgoin = true; //
        while(keepgoin) {
            keepgoin = false; //placeholder, stop loop after time limit exceeded or sufficent solution found.
            evolve(Farms);
        }
        //return highest fitness farm
       
    }







        

        
        
    }

