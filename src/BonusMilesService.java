public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int percentTicketPrice = 20;
        int miles = ticketPrice / percentTicketPrice;
        return miles;// возвращаем рассчитанный bonus
    }
}

