public class CleanBeach {

    public void cleanBeach(int[] beach) {
        for (int i = 0; i < beach.length; i++) {
            if (beach[i] == 1) {
                beach[i] = 0;
            }
        }
    }

    public void displayBeach(int[] beach) {
        for (int i = 0; i < beach.length; i++) {
            System.out.print(beach[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] beach = {0, 1, 0, 1, 1, 0};
        CleanBeach cleaner = new CleanBeach();

        System.out.println("Beach before cleaning:");
        cleaner.displayBeach(beach);

        cleaner.cleanBeach(beach);

        System.out.println("Beach after cleaning:");
        cleaner.displayBeach(beach);
    }
}
