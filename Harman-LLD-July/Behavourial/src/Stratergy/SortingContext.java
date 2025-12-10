package Stratergy;

public class SortingContext {
    public SortingStratergy sortingStratergy;
    public SortingContext(){

    }
    public void performSort(int[] nums){
        this.sortingStratergy.sort(nums);
    }
    public void setSortingStratergy(SortingStratergy sortingStratergy){
        this.sortingStratergy=sortingStratergy;
    }
}
