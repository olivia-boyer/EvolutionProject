
public class Item {

    public enum Type {
	EMPTY,
	CROP,
	SPRINKER,
	SCARECROW
    }

    int id; //number for grid
    String name; //name of item
    Type type; //crop/scarecrow/sprinkler
    int cost; //cost to build/buy seeds
    int sellPrice; //gold earned per harvest of crop, 0 for non-crops
    int growTime; //number of days from planting until first harvest, 0 for non-crops
    int regrowTime; //number of days between subsequent harvests if regrowable, 0 for not
    int effectiveRadius; //number of covered squares for scarecrows/sprinklers
    int maxHarvest; //total harvests in summer season

    final int season = 28;

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

    private int computeMaxHarvest(int days){
	int growDays = days - 1;
	if (type != Type.CROP || growTime > growDays) {
	    return 0;
	}
	if (regrowTime == 0) {
	    return growDays / growTime;
	} else {
	    return 1 + (growDays - growTime) / regrowTime;
	}
    }
}
