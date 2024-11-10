class TourActivity {
    private String day;
    private String time;
    private String activity;

    // Constructor
    public TourActivity(String day, String time, String activity) {
        this.day = day;
        this.time = time;
        this.activity = activity;
    }

    // Getter methods
    public String getDay() {
        return day;
    }

    public String getTime() {
        return time;
    }

    public String getActivity() {
        return activity;
    }

    // Display method to print itinerary details
    public void displayItinerary() {
        System.out.println("Day: " + day + ", Time: " + time + ", Activity: " + activity);
    }
}

public class TourSchedule {
    public static void main(String[] args) {
        // Array of TourActivity objects representing each day's activities
        TourActivity[] itinerary = {
                new TourActivity("Monday", "10:00 AM", "City Tour"),
                new TourActivity("Monday", "1:00 PM", "Lunch at Local Restaurant"),
                new TourActivity("Tuesday", "9:00 AM", "Mountain Hike"),
                new TourActivity("Wednesday", "11:00 AM", "Museum Visit"),
                new TourActivity("Thursday", "3:00 PM", "Beach Time"),
                new TourActivity("Friday", "6:00 PM", "Farewell Dinner")
        };

        System.out.println("Tour Itinerary:");
        for (TourActivity item : itinerary) {
            item.displayItinerary();
        }
    }
}
