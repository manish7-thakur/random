//subgrid is considered a country if the cells have the same value and are connected 
// horizontly or vertically.
public class CountryCounter {
    static int count(int[][] countries) {
        int count = 0;
        boolean[][] visted = new boolean[countries.length][countries[0].length];
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[0].length; j++) {
                if (!visted[i][j]) {
                    visit(countries, visted, i, j, countries[i][j]);
                    count++;
                }
            }
        }
        return count;
    }

    private static void visit(int[][] countries, boolean[][] visited, int i, int j, int value) {
        if (!safe(countries, visited, i, j, value)) {
            return;
        }
        visited[i][j] = true;
        visit(countries, visited, i - 1, j, value);
        visit(countries, visited, i, j - 1, value);
        visit(countries, visited, i + 1, j, value);
        visit(countries, visited, i, j + 1, value);
    }

    private static boolean safe(int[][] countries, boolean[][] visited, int i, int j, int value) {
        return i >= 0 && j >= 0 && i < countries.length && j < countries[0].length && countries[i][j] == value && !visited[i][j];
    }
}