public class Filme {

    private String nome;
    private FilmeEstado estado;

    public Filme() {
        this.estado = FilmeEstadoNaoAssistido.getInstance();
    }

    public void setEstado(FilmeEstado estado) {
        this.estado = estado;
    }

    public String marcarAssistido() {
        return estado.marcarAssistido(this);
    }

    public String marcarNaoAssistido() {
        return estado.marcarNaoAssistido(this);
    }

    public String marcarAssistindo() {
        return estado.marcarAssistindo(this);
    }

    public String marcarInterrompido() {
        return estado.marcarInterrompido(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public FilmeEstado getEstado() {
        return estado;
    }
}
