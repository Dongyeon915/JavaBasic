package Inter1215;

public class Clock {
  private int hour;
  private int minute;

  public Clock(int hour,int minute){
    this.hour = hour;
    this.minute = minute;
  }

  public int getHour(){
    System.out.println("현재 시간은" + this.hour + "입니다");
    return this.hour;
  }
  public int getMinute(){
    System.out.println("현재" + this.minute + "분 입니다.");
    return this.minute;
  }

  public void lookTime(){
    System.out.println(getHour() + "시" + getMinute() + "분 입니다.");
  }
}
