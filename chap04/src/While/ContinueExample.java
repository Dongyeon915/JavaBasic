package While;

public class ContinueExample {

  public static void main(String[] args) {
    for (int i = 1; i <=10; i++) {
      //2로 나눈 나머지가 0이 아닐경우 (홀수)찾기
      if(i%2 !=0){
      continue; //해당 조건을 실행하지않고 다시 증감식으로 이동
      }
      System.out.println(i);
    }
  }
}
