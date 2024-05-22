package Pertemuan8.pert8;

class ObjekGeometris {
    private String warna = "putih";
    private Boolean terisi = false;

    // konstruktor tanpa argumen
    public ObjekGeometris() {
    }
    // konstruktor dengan argumen warna dan terisi
    public ObjekGeometris(String warna, Boolean terisi) {
            this.warna = warna;
            this.terisi = terisi;
        }
    // metode pengakses dan pengubah 
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public Boolean getTerisi(){
        return terisi;
    }
    public void setTerisi(Boolean terisi){
        this.terisi = terisi;
    }
}

