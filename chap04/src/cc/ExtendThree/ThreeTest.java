package cc.ExtendThree;

public class ThreeTest {

  public static void main(String[] args) {
    Mutation mutation = new Mutation(5);

    System.out.println(mutation.getEye());
    System.out.println(mutation.getWings());

    mutation.think();
    mutation.look();
    mutation.smell();
    mutation.run();
    mutation.fly();
    System.out.println(mutation.getLife());
    //////////////////////////////////////////////////////////////////

    Mutation mutation1 = new Mutation();
    Mutation mutation2 = new Mutation();
    Mutation mutation3 = new Mutation();
    Mutation mutation4 = new Mutation();

    Mutation[] arryMutation = new Mutation[]{mutation1, mutation2, mutation3, mutation4};

    //////////깡통에 배열로 장기 담아주기////////
    for (int i = 0; i < arryMutation.length; i++) {
      arryMutation[i].setEye(1);
      arryMutation[i].setBrain(1);
      arryMutation[i].setNose(1);
      arryMutation[i].setHeart(1);
      System.out.println("돌연변이 " + i + "번의 뇌의 갯수" + arryMutation[i].getBrain());
      System.out.println("돌연변이 " + i + "번의 눈의 갯수" + arryMutation[i].getEye());
      System.out.println("돌연변이 " + i + "번의 코의 갯수" + arryMutation[i].getNose());
      System.out.println("돌연변이 " + i + "번의 심장의 갯수" + arryMutation[i].getHeart());
    }

  }
}
