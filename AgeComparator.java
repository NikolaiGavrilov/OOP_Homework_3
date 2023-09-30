import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    private SortType sortType;

    public SortType getSortType() {
        return sortType;
    }

    public void setSortType(SortType sortType) {
        this.sortType = sortType;
    }

    public AgeComparator(SortType sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Employee o1, Employee o2) {

        if (sortType == SortType.Ascending){
            return Double.compare(o1.displayAge(), o2.displayAge());
        }
        else {
            return Double.compare(o2.displayAge(), o1.displayAge());
        }

    }
}