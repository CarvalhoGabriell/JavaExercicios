package EcommercCovid;

public class Mascara {

    private String tipoTecido;
    private String tamanhoMascara;


    public String exibirInstrucoes() {
        if (tipoTecido.equals("algodão")) {
            return "Esse tipo de mascara pode usar durante 2 horas\n Após o uso lave e seque";
        } else {
            return "Esse tipo de mascar deve ser descartado imediatamente após o uso";
        }
    }

    public String getTipoTecido() {
        return tipoTecido;
    }

    public void setTipoTecido(String tipoTecido) {
        this.tipoTecido = tipoTecido;
    }

    public String getTamanhoMascara() {
        return tamanhoMascara;
    }

    public void setTamanhoMascara(String tamanhoMascara) {
        this.tamanhoMascara = tamanhoMascara;
    }
}
