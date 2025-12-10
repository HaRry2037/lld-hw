package Stratergy;

public class Driver {
    public static void main(String[] args){
        int[] nums={1,2,3};
        SortingContext sortingContext= new SortingContext();
        sortingContext.setSortingStratergy(new BubbleSortStratergy());
        sortingContext.performSort((nums));

        sortingContext.setSortingStratergy(new MergerSortStratergy());
        sortingContext.performSort((nums));
    }
}
