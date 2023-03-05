public class Main {
    public static void main(String[] args) {
        int ticketCost = 10_000;
        int bonusRub = 20;
        int bonusMiles = ticketCost / bonusRub;
        System.out.println("Бонусные мили " + bonusMiles);
    }
}