/**
 * Created by edgar971 on 8/10/15.
 */
public class MovieList {
    public static void main(String[] args) {
        DVDCollection list = new DVDCollection();

        //add movies to the list
        list.add(new DVD("A Movie Name", "Edgar Pino", 2010, 34.4, true));
        list.add(new DVD("Random Car", "John A", 2015, 20.2, false));
        list.add(new DVD("Computer Guy", "Steven B", 1992, 15.9, true));
        list.add(new DVD("An Event Apart", "Jeffrey M", 2010, 22.4, true));
        list.add(new DVD("Site Point", "Mike A", 2016, 10.5, false));
        list.add(new DVD("Crazy List", "Jeff M", 2011, 19.9, true));

        System.out.println(list.toString());


    }
}
