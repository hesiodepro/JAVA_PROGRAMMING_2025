public class Chapter10_Time {
    private int hour;
    private int minute;
    private int second;

    public Chapter10_Time() {
        long currentTimeMillis = System.currentTimeMillis();
        setTime(currentTimeMillis);
    }

    public Chapter10_Time(long elapseTime) {
        setTime(elapseTime);
    }

    public Chapter10_Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / 1000;
        this.second = (int) (totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        this.minute = (int) (totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        this.hour = (int) (totalHours % 24);
    }

    public static void main(String[] args) {
        
        Chapter10_Time time1 = new Chapter10_Time();
        Chapter10_Time time2 = new Chapter10_Time(555550000);
        Chapter10_Time time3 = new Chapter10_Time(5, 23, 55); 

        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
        System.out.println(time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
        System.out.println(time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
    }
}
