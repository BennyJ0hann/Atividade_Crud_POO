public class Moto {

    public String modelo;
    public String marca;
    public int ano;
    public String cor;
    public String chassi;
    public int revisoes;
    public double km;
    
    public Moto(String modelo, String marca, int ano, String cor, String chassi){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.chassi = chassi;

        this.revisoes = 0;
        this.km = 0;

    }
    public String getModelo(String modelo){
        return this.modelo;
    }
    public String getMarca(String marca){
        return this.marca;
    }
    public int getAno(String ano){
        return this.ano;
    }
    public String getCor(String cor){
        return this.cor;
    }
    public String getChasi(String chassi){
        return this.chassi;
    }
    public String getNome(String chassi){
        return this.chassi;
    }
}
