public class BonusMilesService {
    public int calculate(int cost) {
        int oneMilePrice = 20;                  //Сумма за которую начисляется 1 миля
        return cost / oneMilePrice;
    }
}
