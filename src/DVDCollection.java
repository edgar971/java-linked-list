/**
 * Created by edgar971 on 8/10/15.
 */
public class DVDCollection {
    private int count;
    private DVDNode list;

    public DVDCollection() {
        list = null;
    }

    public void add(DVD movie) {
        DVDNode node = new DVDNode(movie);
        DVDNode current;
        if(list == null) {
            list = node;
        } else {
            current = list;
            while (current.next != null) {
                current = current.next;

            }
            current.next = node;
        }
        count ++;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        String result = "";
        DVDNode current = list;

        while (current != null) {
            result += current.movie + "\n";
            current = current.next;
        }
        return result;
    }

    private class DVDNode {
        public DVD movie;
        public DVDNode next;

        /*
        * Set up the DVD node
        * */
        public DVDNode(DVD newmovie) {
            movie = newmovie;
            next = null;
        }
    }
}
