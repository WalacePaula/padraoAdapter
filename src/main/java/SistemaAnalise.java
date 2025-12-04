public class SistemaAnalise {

    private IGeradorDadosXML gerador;

    public SistemaAnalise(IGeradorDadosXML gerador) {
        this.gerador = gerador;
    }

    public void processarRelatorio() {
        System.out.println("\n--- Iniciando Processamento de Relatório no Sistema de Análise ---");

        String relatorioXML = gerador.gerarDadosEmXML();

        System.out.println("Relatório recebido e pronto para análise:");
        System.out.println(relatorioXML);

        System.out.println("-----------------------------------------------------------------\n");
    }
}