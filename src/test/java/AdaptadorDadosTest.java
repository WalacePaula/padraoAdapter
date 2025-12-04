import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdaptadorDadosTest {

    @Test
    void deveGerarDadosEmXMLCorretamente() {
        AdaptadorDados adaptador = new AdaptadorDados();
        String xmlEsperado = "<Relatorio>\n  <Titulo>Vendas Mensais</Titulo>\n  <ValorTotal>2150</ValorTotal>\n</Relatorio>";
        String xmlRetornado = adaptador.gerarDadosEmXML();

        assertEquals(xmlEsperado, xmlRetornado, "O XML retornado pelo adaptador deve ser idêntico ao esperado após a tradução.");
    }

    @Test
    void deveConterTagDeAberturaXML() {
        AdaptadorDados adaptador = new AdaptadorDados();
        String xmlRetornado = adaptador.gerarDadosEmXML();

        assertTrue(xmlRetornado.startsWith("<Relatorio>"), "O XML deve começar com a tag principal <Relatorio>.");
    }

    @Test
    void naoDeveRetornarStringVaziaOuNula() {
        AdaptadorDados adaptador = new AdaptadorDados();
        String xmlRetornado = adaptador.gerarDadosEmXML();

        assertNotNull(xmlRetornado, "O XML retornado não deve ser nulo.");
        assertFalse(xmlRetornado.isEmpty(), "O XML retornado não deve ser vazio.");
    }
}