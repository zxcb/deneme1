package musteri;

public class MusteriBilgileri {

	public static final int YAS1=25;
	public static final int YAS2=45;
	public static final int YAS3=60;
	
	private String ad;
	private String sehir;
	public int yasTip;
	public Urunler urun;
	
	
	
	
	
	
	
	
	
	public void setAd(String ad){
		this.ad=ad;
	}
	public String getAd(){
		return ad;
	}
	public String getSehir() {
		return sehir;
	}
	public void setSehir(String sehir) {
		this.sehir = sehir;
	}
	
	public MusteriBilgileri(String ad, String sehir, int yasTip, Urunler urun){
		this.ad=ad;
		this.sehir=sehir;
		this.yasTip=yasTip;
		this.urun=urun;
		
	}
	
	
	
	public MusteriBilgileri(String ad, String sehir, int yasTip) {
		super();
		this.ad = ad;
		this.sehir = sehir;
		this.yasTip = yasTip;
	}
	public String getTip(){
		
		switch (yasTip) {
		case 25:
			return "spor araba";
		case 45:
			return "normal araba";
		case 60:
			return "eski araba";
			

		default:
			return "araba aralýkta deðil";
		}
	}
	
	public void bilgiAl(){
	
		System.out.println("ad= "+getAd());
		System.out.println("sehir= "+getSehir());
		System.out.println("araba tipi"+getTip());
		
	}
	
	
	
	
	
	
	
	
}
