package Lec23;

public class TimeSpan {
    private long totalSeconds;
    
    public TimeSpan(long seconds) {
        this.totalSeconds = seconds;
    }
    
    public long getDays() {
        return totalSeconds / (24 * 3600);
    }
    
    public long getHours() {
        return (totalSeconds % (24 * 3600)) / 3600;
    }
    
    public long getMinutes() {
        return (totalSeconds % 3600) / 60;
    }
    
    public long getSeconds() {
        return totalSeconds % 60;
    }
    
    @Override
    public String toString() {
        return getDays() + " days, " + getHours() + " hours, " + getMinutes() + " minutes, " + getSeconds() + " seconds";
    }
    
    public static void main(String[] args) {
        TimeSpan timeSpan = new TimeSpan(9876); // Example seconds
        System.out.println(timeSpan);
    }
}
