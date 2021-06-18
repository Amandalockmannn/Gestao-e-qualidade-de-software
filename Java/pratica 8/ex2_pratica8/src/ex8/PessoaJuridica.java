package ex8;

public class PessoaJuridica extends Pessoa{
	
	private String CNPJ;
	
    public void setCPF(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    private String getCNPJ() {
        return CNPJ;
    }	
}
