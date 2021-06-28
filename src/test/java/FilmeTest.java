import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {
    Filme filme;

    @BeforeEach
    public void setUp(){
        filme = new Filme();
    }

    // Filme Assistido

    @Test
    public void deveRetornarFilmeAssistidoNovamente() {
        filme.setEstado(FilmeEstadoAssistido.getInstance());
        assertEquals("Filme Assistido Novamente!", filme.marcarAssistido());
    }

    @Test
    public void deveDesmarcarFilmeAssistido() {
        filme.setEstado(FilmeEstadoAssistido.getInstance());
        assertEquals("Filme Não Assistido.", filme.marcarNaoAssistido());
    }

    @Test
    public void deveRetornarAssistindoFilmeNovamente() {
        filme.setEstado(FilmeEstadoAssistido.getInstance());
        assertEquals("Assistindo Novamente ao Filme.", filme.marcarAssistindo());
    }

    @Test
    public void naoDeveMarcarFilmeInterrompidoEmFilmeAssistido() {
        filme.setEstado(FilmeEstadoAssistido.getInstance());
        assertEquals("Operação não realizada. Comece a assistir a um filme.", filme.marcarInterrompido());
    }

    // Filme Nao Assistido

    @Test
    public void deveMarcarFilmeAssistidoEmFilmeNaoAssistido() {
        filme.setEstado(FilmeEstadoNaoAssistido.getInstance());
        assertEquals("Filme Assistido!", filme.marcarAssistido());
    }

    @Test
    public void deveManterFilmeNaoAssistido() {
        filme.setEstado(FilmeEstadoNaoAssistido.getInstance());
        assertEquals("Filme Não Assistido.", filme.marcarNaoAssistido());
    }

    @Test
    public void deveMarcarAssistindoFilmeEmFilmeNaoAssistido() {
        filme.setEstado(FilmeEstadoNaoAssistido.getInstance());
        assertEquals("Assistindo ao Filme.", filme.marcarAssistindo());
    }

    @Test
    public void naoDeveMarcarFilmeInterrompidoEmFilmeNaoAssistido() {
        filme.setEstado(FilmeEstadoNaoAssistido.getInstance());
        assertEquals("Operação não realizada. Comece a assistir a um filme.", filme.marcarInterrompido());
    }

    // Filme Interrompido

    @Test
    public void naoDeveMarcarFilmeAssistidoEmFilmeInterrompido() {
        filme.setEstado(FilmeEstadoInterrompido.getInstance());
        assertEquals("Operação não realizada. Volte a assistir ao filme.", filme.marcarAssistido());
    }

    @Test
    public void naoDeveMarcarFilmeNaoAssistidoEmFilmeInterrompido() {
        filme.setEstado(FilmeEstadoInterrompido.getInstance());
        assertEquals("Operação não realizada.", filme.marcarNaoAssistido());
    }

    @Test
    public void deveMarcarAssistindoFilmeEmFilmeInterrompido() {
        filme.setEstado(FilmeEstadoInterrompido.getInstance());
        assertEquals("Assistindo ao Filme.", filme.marcarAssistindo());
    }

    @Test
    public void deveManterFilmeInterrompido() {
        filme.setEstado(FilmeEstadoInterrompido.getInstance());
        assertEquals("Filme Interrompido.", filme.marcarInterrompido());
    }

    // Assistindo ao Filme

    @Test
    public void deveMarcarFilmeAssistido() {
        filme.setEstado(FilmeEstadoAssistindo.getInstance());
        assertEquals("Filme Assistido!", filme.marcarAssistido());
    }

    @Test
    public void deveMarcarFilmeNaoAssistido() {
        filme.setEstado(FilmeEstadoAssistindo.getInstance());
        assertEquals("Filme Não Assistido.", filme.marcarNaoAssistido());
    }

    @Test
    public void deveManterAssistindoFilme() {
        filme.setEstado(FilmeEstadoAssistindo.getInstance());
        assertEquals("Assistindo ao Filme!", filme.marcarAssistindo());
    }

    @Test
    public void deveMarcarFilmeInterrompido() {
        filme.setEstado(FilmeEstadoAssistindo.getInstance());
        assertEquals("Filme Interrompido.", filme.marcarInterrompido());
    }
}