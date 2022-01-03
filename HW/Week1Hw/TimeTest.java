package Week1Hw;

public class Time {
    public int hour;
    public int minute;
    public int second;

    public Time(int i, int j, int k) {
    }

    public int getHour() { 
      return hour; 
    }

    public void setHour(int hour) {
      if (hour < 0 || hour > 23) 
        return;
      this.hour = hour;
    }

    public int getMinute() { 
      return minute; 
    }

    public void setMinute(int minute) {
      if (minute < 0 || minute > 59) 
        return;
      this.minute = minute;
    }

    public int getSecond() { 
      return second; 
    }

    public void setSecond(int second) {
      if (second < 0 || second > 23) 
        return;
      this.second = second;
    }
}

public class TimeTest {
  public static void main(String[] args) {
    Time t = new Time(12, 35, 30);
    System.out.println(t);
    // t.hour = 13;
    t.setHour(t.getHour() + 1);
    System.out.println(t);
  }
}
  // 과제5) 블로그 내용 중에 Time class의 내용을 확인하시오.