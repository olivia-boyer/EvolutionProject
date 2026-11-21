//class for items. All same type, for non-crops, sell Price and harvests =
public class Item {

    public enum Type {
      EMPTY,
      CROP,
      SPRINKLER,
      SCARECROW
    }

    int id; // id number for grid
    String name; // name of item
    Type type; // empty/crop/scarecrow/sprinkler
    int cost; // one time cost to build/buy seeds, 0 for empty
    int sellPrice; // gold earned per harvest of crop, 0 for non-crops
    int growTime; // number of days from planting until first harvest, 0 for non-crops
    int regrowTime; // number of days between subsequent harvests if regrowable, 0 for not or non-crops
    int effectiveRadius; // number of covered squares for scarecrows/sprinklers, 0 for crops/empty
    int maxHarvest; // total harvests for season, 0 for non-crops

    public final int season = 28;

    public Item(int id, String name, Type type, int cost, int sellPrice, int growTime, int regrowTime, int effectiveRadius) {
      this.id = id;
      this.name = name;
      this.type = type;
      this.cost = cost;
      this.sellPrice = sellPrice;
      this.growTime = growTime;
      this.regrowTime = regrowTime;
      this.effectiveRadius = effectiveRadius;
      this.maxHarvest = computeMaxHarvest(season);
    }

    private int computeMaxHarvest(int days){ // total number of harvests for the season
      int growDays = days - 1;
      if (type != Type.CROP || growTime > growDays) {
        return 0;
      }
      if (regrowTime == 0) { // single harvest crop
        return 1;
      } else {
        return 1 + (growDays - growTime) / regrowTime; //regrow harvests
      }
    }

    public double getRevenue() { //for the whole season for that square
      return maxHarvest * sellPrice;
    }

    public double getExpense() { //initial cost on day 1
      return cost;
    }
}
