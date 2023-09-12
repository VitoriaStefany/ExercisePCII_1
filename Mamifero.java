

package exercícioaula02;

/**
 *
 * @author Vitória Stefany
 */
public class Mamifero {
    private String habitat, alimentacao, cor;
    private int qtdPatas, espectativaVida, tamanho;
    private boolean nadadeiras, dente;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public int getEspectativaVida() {
        return espectativaVida;
    }

    public void setEspectativaVida(int espectativaVida) {
        this.espectativaVida = espectativaVida;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isNadadeiras() {
        return nadadeiras;
    }

    public void setNadadeiras(boolean nadadeiras) {
        this.nadadeiras = nadadeiras;
    }

    public boolean isDente() {
        return dente;
    }

    public void setDente(boolean dente) {
        this.dente = dente;
    }

    public void dados(){
        System.out.println("Habitat: " + this.habitat
        + "\nAlimentação: " + this.alimentacao
        + "\nCor: " + this.cor
        + "\nQuantidade de patas: " + this.qtdPatas
        + "\nExpectativa de vida: " + this.espectativaVida
        + "\nTamanho: " + this.tamanho
        + "\nNadadeiras: " + this.nadadeiras
        + "\nDentes: " + this.dente);
    }
}
