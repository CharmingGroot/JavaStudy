package git_only.com.mc.A_thisisjava;

public class ShopService{
	private static ShopService shopservice = new ShopService();
	
	private ShopService() {
		
	}
	
	static ShopService getInstance(){
		return shopservice;
	}
}