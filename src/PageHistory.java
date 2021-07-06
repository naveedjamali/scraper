import java.util.ArrayList;

public class PageHistory {

    private ArrayList<String> visited;

    /**
     * Creates a new empty PageHistory object.
     */

    public PageHistory() {
        visited = new ArrayList<>();

    }


    /**
     * Stores a given url in the PageHistory to indicate that
     * <p>
     * the page at that url has been previously visited.
     *
     * @param url - The page that has been visited.
     */

    public void markVisited(String url) {

        visited.add(url);
    }


    /**
     * A predicate method to check whether a particular page hasbeen visited before in the history.
     *
     * @param url - The page to check for in the history.
     * @return true if url already exists somewhere in this PageHistory object,
     * <p>
     * false if the page has not been markedVisited in the past.
     */

    public boolean visited(String url) {

        return visited.contains(url);

    }


    /**
     * Retrieves the full history of this PageHistory object as an array
     * <p>
     * of strings. The array values are stored in chronological order ofvisits, with index 0 corresponding to the first page visited
     * <p>
     * in the life of this PageHistory object.
     *
     * @return an array of all pages markVisted by this PageHistory
     */

    public String[] getHistory() {
        String[] array = new String[visited.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = visited.get(i);
        }

        return array;

    }


    /**
     * A predicate method that indicates if at any point in this
     * <p>
     * PageHistory'slifespan any URL was "markVisited" more than once.
     *
     * @return true if a page revisit occurred at some point; false otherwise
     */

    public boolean wereDuplicatesVisited() {
        ArrayList<String> uniques = new ArrayList<>();
        for (int i = 0; i < visited.size(); i++) {
            if (uniques.contains(visited.get(i))) {
                return true;
            }
            uniques.add(visited.get(i));
        }

        return false;


    }
}
