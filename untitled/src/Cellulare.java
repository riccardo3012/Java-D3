public class Cellulare {
   public int nCellulare;

    public int creditoResiduo;

    public String ultimeChiamate;

    public Cellulare(int nCellulare, int creditoResiduo, String ultimeChiamate) {
        this.nCellulare = nCellulare;
        this.creditoResiduo = creditoResiduo;
        this.ultimeChiamate = ultimeChiamate;
    }

    public int getnCellulare() {
        return nCellulare;
    }
    public void setnCellulare(int nCellulare) {
        this.nCellulare = nCellulare;
    }

    public int getCreditoResiduo() {
        return creditoResiduo;
    }

    public void setCreditoResiduo(int creditoResiduo) {
        this.creditoResiduo = creditoResiduo;
    }
    public String getUltimeChiamate() {
        return ultimeChiamate;
    }

    public void setUltimeChiamate(String ultimeChiamate) {
        this.ultimeChiamate = ultimeChiamate;
    }

}

