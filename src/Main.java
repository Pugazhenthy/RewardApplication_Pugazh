import java.util.*;

public class Main {

	public static void main(String[] args) {

		RewardService rdserv = new RewardService();
		Thread myThread = new Thread(new TransactionAPI());
		myThread.start();
		Scanner scan = new Scanner(System.in);
//		while(true) System.out.println(rdserv.getUserPoints("Siva"));
//		while(true) System.out.println(User.getPoints("Siva"));
		boolean flag=true;
		while(flag) {




			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("		Welcome to Reward Application");
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("---------------------------------------------------------------------------------\n");
			System.out.println("Please enter your Username & Password");
			String username = scan.next();
			String password = scan.next();

			if (rdserv.loginAuthendicate(username, password)) {

				int n = rdserv.getUserPoints(username);
			//	int n = User.getPoints(username);

				System.out.println("Hi " + username + " You have " + n + " points in your account ");
				rdserv.displayRewardCatalog();
				int rd = scan.nextInt();
				int points = rdserv.redeemReward(rd, username);
				System.out.println("Congrats!!! you got a coupon " + RewardService.randomAlphaNumeric(10));
				System.out.println("Your current points are " + points);


			} else {
				System.out.println("Incorrect Username or Password");
				//return;
			}
			System.out.println("Do you wish to login again, Enter YES/NO");
			String cho = scan.next();
			if(cho == "NO") {
				flag = false;
			}
		}

	}

}
