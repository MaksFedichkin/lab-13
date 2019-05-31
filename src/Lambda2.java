interface intMenu{
    boolean test(int city,int food);
}
public class Lambda2 {
    public static void main(String args[]) {
        String cities[] = {"China", "Italy", "America", "Switzerland"};
        String foods[] = {"Burger", "Pizza", "Chocolate", "Sushi"};
        intMenu intmenu = (city, food) -> (city = food) == 1;
        if (intmenu.test(1, 1))
            System.out.println(cities[1] + "-"+foods[1]+" = true");
        if (!intmenu.test(2, 2))
            System.out.println(cities[2] + "-"+foods[2]+" = false");
    }
}
