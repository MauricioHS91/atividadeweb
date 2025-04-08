import javax.annotation.processing.Generated;

import dominio;

@Entity
public class Cliente {
    @Id
    @GenerateValue (strategy = GenerationType.IDENTITY)
    
    private long Id;
    private String nome;
    private List<Venda> vendas;

    public Cliente (){
        this ("");
    }

    public CLiente (String nome){
        this.nome = nome;
    }

    public void setId (Long Id){
        this.Id = Id;
    }

    public Long getId(){
        return this.Id;
    }

    public void setNome ( String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public List<Venda> getVendas() {
        return this.vendas;
    }
}