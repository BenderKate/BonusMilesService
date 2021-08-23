public class BonusMilesService {
    public int calculate(int cost) {
        cost = 10_000;
        int mileCost = 20;
        int miles = cost / mileCost;
        return miles;
    }

}
