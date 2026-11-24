

public class Evolution {
    private Item[] itemList = new Item[25];

    private void initializeItems() {
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
        itemList[19] = new Item(19, "Sprinkler", Item.Type.SPRINKER, 180, 0, 0, 0, 4);
        itemList[20] = new Item(20, "Quality Sprinkler", Item.Type.SPRINKER, 420, 0, 0, 0, 8);
        itemList[21] = new Item(21, "Iridium Sprinkler", Item.Type.SPRINKER, 1750, 0, 0, 0, 24);
        itemList[22] = new Item(22, "Scarecrow", Item.Type.SCARECROW, 135, 0, 0, 0, 0);

    }
        






        

        
        
    }

