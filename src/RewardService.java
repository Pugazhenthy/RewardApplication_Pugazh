import java.util.*;

public class RewardService {

	Map<String, User> Users = new HashMap<>();
	Reward reward = new Reward();
	Scanner scan = new Scanner(System.in);
//	List<Reward> rewardCatalog = new ArrayList<>();
//	List<Reward> rdSubCat = new ArrayList<>();

	public RewardService() {

		Users.put("Naveen", new User("Naveen", "naveen"));
		Users.put("Hyder", new User("Hyder", "hyder"));
		Users.put("Vinod", new User("Vinod", "vinod"));
		Users.put("Siva", new User("Siva", "siva"));
//		Map.Entry<String, User> RandomUser = getRandomUser(Users);
//		System.out.println(RandomUser);
	}

	public void displayRewardCatalog() {
		System.out.println("Please select the Reward Category that you wish to Redeem \n");
		reward.printRewardCat();
		int rdsub = scan.nextInt();
		System.out.println("Please select the Reward that you wish to Redeem \n");
		reward.printRewardSubCat(rdsub);
		//		System.out.println(i + " . " + reward.getName() + " - " + reward.getPointValue() + " Ponits");
	}

	public boolean loginAuthendicate(String username, String password) {
		if (Users.containsKey(username)) {
			User user = Users.get(username);
			return user.password.equals(password);
		}
		return false;
	}

	public int getUserPoints(String username) {
		return Users.get(username).getPoints("Siva");
	}

	public int redeemReward(int opt, String username) {

		opt = reward.redeemRd(opt);
		opt = getUserPoints(username) - opt;
		return opt;

	}

	public static String randomAlphaNumeric(int length) {
		String allowedCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(allowedCharacters.length());
			char randomChar = allowedCharacters.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}


}
