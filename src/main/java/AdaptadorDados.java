public class AdaptadorDados implements IGeradorDadosXML {

    private ServicoEstatisticasJSON servicoLegado;

    public AdaptadorDados() {
        this.servicoLegado = new ServicoEstatisticasJSON();
    }

    @Override
    public String gerarDadosEmXML() {
        String dadosJSON = this.servicoLegado.gerarDadosEmJSON();
        String dadosXML = traduzirJSONParaXML(dadosJSON);

        System.out.println("[ADAPTADOR] JSON traduzido para XML com sucesso.");

        return dadosXML;
    }

    private String traduzirJSONParaXML(String json) {
        return "<Relatorio>\n  <Titulo>Vendas Mensais</Titulo>\n  <ValorTotal>2150</ValorTotal>\n</Relatorio>";
    }
}