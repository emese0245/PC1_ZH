public class Waiter extends Chef {
    public void modifyPrice (String subject, String waiter)
    {
        for (String[] price : recipe) {
            if (Object.equals(price[0], subject)) {
                price[1] =  price;
            }
        }
    }
}
