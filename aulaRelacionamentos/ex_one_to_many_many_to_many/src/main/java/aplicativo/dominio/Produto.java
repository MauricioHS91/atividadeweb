package dominio;

import java.util.List;

@Entity
public class Produto {

    @Id
    @GenerateValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nome;
    private double preco;

    @ManyToMany(mappedBy = "produtos")
    private List<Venda> vendas;

    public Produto() {
        this("", 0);
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    
    public Long getId() {
        return Id;  
    }

    public void setId(Long Id) {
        this.Id = Id;  
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {  
        return "Produto [Id=" + Id + ", nome=" + nome + ", preco=" + preco + "]";
    }
}
