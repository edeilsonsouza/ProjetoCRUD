
/**
 * Classe abstrata Cadastro - escreva uma descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (número da versão ou data aqui)
 */
public abstract class Cadastro
{
    private String nome;
    private String telefone;
    private String dataNasc;
    private String dataCad;
    private String dataUltAlt;
    private double notaFinal;
    private int res;
        
    /**
     * Construtor com inicialização básica
     */
    public Cadastro() {
        this.nome = "";
        this.telefone = "";
        this.dataNasc = "";
        this.dataCad = "";
        this.dataUltAlt = "";
        this.notaFinal= 0;
        this.res = 0;
    }
    
    /**
     * Construtor específico para classe Pessoa que usa herança da classe cadastro
     */
    public Cadastro(String nome,String telefone,String dataNasc,String dataCad,String dataUltAlt) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.dataCad = dataCad;
        this.dataUltAlt = dataUltAlt;
    }
    
    /**
     * Construtor específico para classe Aluno que usa herança da classe cadastro
     */
    public Cadastro(String nome,String telefone,String dataNasc,String dataCad,String dataUltAlt, Double notaFinal) {
        this.nome = nome;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.dataCad = dataCad;
        this.dataUltAlt = dataUltAlt;
        this.notaFinal = notaFinal;
    }


    //métodos "get" e "set"
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone() {
        return this.telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public String getDataNascimento() {
        return this.dataNasc;
    }
    public void setDataNascimento(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getDataCadastro() {
        return this.dataCad;
    }
    public void setDataCadastro(String dataCad) {
        this.dataCad = dataCad;
    }
    
    
    public String getDataUltimaAlteracao() {
        return this.dataUltAlt;
    }
    public void setDataUltimaAlteracao(String dataUltAlt) {
        this.dataUltAlt = dataUltAlt;
    }

    public Double getNotaFinal() {
        return this.notaFinal;
    }
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    public int getResposta() {
        return this.res;
    }
    public void setResposta(int res) {
        this.res = res;
    }
}