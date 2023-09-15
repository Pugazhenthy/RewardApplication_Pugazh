import java.util.*;
import java.util.Map.Entry;


public class Reward {


    private static final int HashMap = 0;
    Map<RewardDetail, Integer> rdDet = new HashMap<>();
    Map<Integer, String> rdCat = new HashMap<>();
    Map<Integer, String> rdSubCat = new HashMap<>();

    public Reward() {
        super();
        rdDet.put(new RewardDetail(1, 101), 10000);
        rdDet.put(new RewardDetail(1, 102), 1000);
        rdDet.put(new RewardDetail(1, 103), 100);
        rdDet.put(new RewardDetail(1, 104), 10);
        rdDet.put(new RewardDetail(2, 201), 10000);
        rdDet.put(new RewardDetail(2, 202), 8000);
        rdDet.put(new RewardDetail(2, 203), 5000);
        rdDet.put(new RewardDetail(2, 204), 10);
        rdDet.put(new RewardDetail(3, 301), 1000);
        rdDet.put(new RewardDetail(3, 302), 500);
        rdDet.put(new RewardDetail(3, 303), 200);


        rdCat.put(1, "Electronics");
        rdSubCat.put(101, "MobilePhoneCoupon(10000pts) - Coupon  $1000 ");
        rdSubCat.put(102, "HeadPhones       (1000pts)  - Coupon  $100 ");
        rdSubCat.put(103, "Recharge         (500pts)   - Coupon  $50");
        rdSubCat.put(104, "Sim              (100pts)    - Coupon  $10 \n");

        rdCat.put(2, "Trip");
        rdSubCat.put(201, "10000 Kms(10000pts) - Coupon  $1000");
        rdSubCat.put(202, "1000 Kms(8000pts)   - Coupon  $800");
        rdSubCat.put(203, "500 Kms(5000pts)    - Coupon  $500 \n");


        rdCat.put(3, "Gift Card");
        rdSubCat.put(301, "Amazon50(1000pts)   - Coupon  $100");
        rdSubCat.put(302, "Amazon20(500pts)    - Coupon  $50");
        rdSubCat.put(303, "Amazon10(200pts)    - Coupon  $20 \n");


    }

    public Map<RewardDetail, Integer> getRdDet() {
        return rdDet;
    }

    public Map<Integer, String> getRdCat() {
        return rdCat;
    }

    public Map<Integer, String> getRdSubCat() {
        return rdSubCat;
    }

    public void printRewardCat() {
        for (Map.Entry<Integer, String> ctg : rdCat.entrySet()) {
            System.out.println(ctg.getKey() + " : " + ctg.getValue());
        }
    }

    public void printRewardSubCat(Integer n) {
        for (Map.Entry<Integer, String> ctg : rdSubCat.entrySet()) {
            if (ctg.getKey() / 100 == n) {
                System.out.println(ctg.getKey() + " : " + ctg.getValue());
            }
        }
    }

    @Override
    public String toString() {
        return "Reward " + rdDet;
    }

    public int redeemRd(int opt) {
        RewardDetail RD = new RewardDetail((opt / 100), opt);
		int n = RD.getSubId();


		Integer q=0;
		for (Entry<RewardDetail, Integer> ctg : rdDet.entrySet()) {
            Object ob = ctg.getKey();
			int m = ((RewardDetail) ob).getSubId();
            if (m==n) {
				q = ctg.getValue();
            }

        }
		return q;
    }


}
