public class ServicoEstatisticasJSON {

    public String gerarDadosEmJSON() {
        String json = "{ \"id\": 1, \"nome\": \"Vendas Mensais\", \"valores\": [500, 750, 900] }";
        System.out.println("[LEGADO] Dados JSON gerados com sucesso: " + json.substring(0, 30) + "...");
        return json;
    }
}