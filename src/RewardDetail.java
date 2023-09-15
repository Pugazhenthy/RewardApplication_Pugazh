import java.util.*;

public class RewardDetail {
	int CatId;
	int SubId;
	public RewardDetail(int catId, int subId) {
		super();
		CatId = catId;
		SubId = subId;
	}
	public int getCatId() {
		return CatId;
	}
	public void setCatId(int catId) {
		CatId = catId;
	}
	public int getSubId() {
		return SubId;
	}
	public void setSubId(int subId) {
		SubId = subId;
	}
	@Override
	public String toString() {
		return "RewardDetail [CatId=" + CatId + ", SubId=" + SubId + "]";
	}

	
	

}
