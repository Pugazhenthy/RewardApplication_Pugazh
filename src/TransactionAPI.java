import java.util.*;

public class TransactionAPI extends RewardService implements Runnable {


    public void run(){
        //System.out.println(R.next);
        while(true){
        Map.Entry<String, User> RandomUser = getRandomUser(Users);
        int Currpts = RandomUser.getValue().getPoints("Siva");
        RandomUser.getValue().setPoints(Currpts+ 1000);
//        System.out.println(RandomUser.getValue().getUserame());
//        System.out.println(RandomUser.getValue().getPoints("Siva"));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private Map.Entry<String, User> getRandomUser(Map<String,User> users) {
        List<Map.Entry<String, User>> entryList = new ArrayList<>(users.entrySet());
        Random R = new Random();
        int randomInd = R.nextInt(entryList.size());

        return entryList.get(1);
    }
}
