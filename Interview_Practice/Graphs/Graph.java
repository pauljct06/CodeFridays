import java.util.List;
import java.util.ArrayList;

public class Graph {

    private List<City> cities;
    private boolean[][] paths;
    private final int DEFAULTSIZE = 50;

    public Graph() {
        this.cities = new ArrayList<City>();
        this.paths = new boolean[DEFAULTSIZE][DEFAULTSIZE];
    }

    public void addCity(City city) {
        this.cities.add(city);
    }

    public void removeCity(City city) {
        List<City> connections = getConnectedCities(city);

        for (City x: connections) {
            removePath(city, x);
        }

        int idx = this.cities.indexOf(city);

        // you set this to null because you dont want to remove paths integrity
        this.cities.set(idx, null);
    }

    public void addPath(City city1, City city2) {
        int row = this.cities.indexOf(city1);
        int col = this.cities.indexOf(city2);

        this.paths[row][col] = true;
        this.paths[col][row] = true;
    }

    public void removePath(City city1, City city2) {
        int row = this.cities.indexOf(city1);
        int col = this.cities.indexOf(city2);

        this.paths[row][col] = false;
        this.paths[col][row] = false;
    }

    public List<City> getConnectedCities(City city) {
        int idx = this.cities.indexOf(city);
        List<City> connections = new ArrayList<City>();

        for (int i = 0; i < this.paths[idx].length; i++) {
            if (this.paths[idx][i]) {
                connections.add(this.cities.get(i));
            }
        }

        return connections;
    }

    public List<Integer> getConnectedIndexes(City city) {
        int idx = this.cities.indexOf(city);
        List<Integer> connections = new ArrayList<Integer>();

        for (int i = 0; i < this.paths[idx].length; i++) {
            if (this.paths[idx][i]) {
                connections.add(i);
            }
        }

        return connections;
    }

    public void print() {
        for (City x: cities) {
            if (x == null) {
                continue;
            }

            List<City> connections = getConnectedCities(x);
            System.out.print(x.name + " -> ");
            for (City y: connections) {
                System.out.print(y.name + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Graph mygraph = new Graph();

        City perthAmboy = new City("Perth Amboy");
        City sayreville = new City("Sayreville");
        City edison = new City("Edison");
        City newbrunswick = new City("New Brunswick");
        City eastbrunswick = new City("East Brunswick");

        mygraph.addCity(perthAmboy);
        mygraph.addCity(sayreville);
        mygraph.addCity(edison);
        mygraph.addCity(newbrunswick);
        mygraph.addCity(eastbrunswick);

        mygraph.addPath(perthAmboy, sayreville);
        mygraph.addPath(perthAmboy, edison);

        mygraph.addPath(sayreville, eastbrunswick);

        mygraph.addPath(eastbrunswick, newbrunswick);

        mygraph.addPath(newbrunswick, edison);
        mygraph.addPath(eastbrunswick, edison);

        mygraph.print();

        mygraph.removeCity(edison);
        System.out.println("\n\n");
        mygraph.print();
    }
}