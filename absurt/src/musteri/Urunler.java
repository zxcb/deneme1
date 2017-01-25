package musteri;

public class Urunler {
	
	public static final String TUR1="Elektronik";
	public static final String TUR2="Mutfak";
	public static final String TUR3="Giyim";
	
	
	private int verilenMiktar;
	public String tip;
	
	
	public void setVerilenMiktar(int verilenMiktar){
		this.verilenMiktar=verilenMiktar;
	}
	public int getVerilenMiktar(){
		return verilenMiktar;
	}
	
	public double fiyat(){
		switch (tip) {
		case "Elektronik":
			
			return 1000.00;
		case "Mutfak":
			
			return 500.00;
		case "Giyim":
	
	return 200.00;

		default:
			return 0;
		}
	}
	
	
	
	
	

}
