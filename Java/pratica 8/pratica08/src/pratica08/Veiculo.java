package pratica08;

public class Veiculo {
	String placa;
	String chassi;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getChassi() {
		return chassi;
	}
	public void setChassi (String chassi) {
		this.chassi = chassi;
	}
 public String returntuca() {
	 return "o chassi �"+this.chassi+" e a placa �"+this.placa;
	}

}
