package parcial.desing;


public class Compra {


	public boolean online;
	public boolean recoger;

	public void comprar() throws Exception {
		String inputValue = "";
		while (!(inputValue = (online ? Online.comprar() : InSite.comprar())).equals("-1")) {
			if (recoger) {
				Delivery.comprar(inputValue);
			} else {
				Recoger.comprar(inputValue);
			}
		}
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public boolean isRecoger() {
		return recoger;
	}

	public void setRecoger(boolean recoger) {
		this.recoger = recoger;
	}
	
		
	
}