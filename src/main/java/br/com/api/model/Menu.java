package br.com.api.model;

public class Menu {
    public void escolheOpcao(){
        String opcoes = """
        \n*******************************************

        Olá, bem vindo/a ao conversor de moedas!
                
        *******************************************
                1) Dólar --> Peso argentino
                2) Peso argentino --> Dólar
                3) Dólar --> Real brasileiro
                4) Real brasileiro --> Dólar
                5) Dólar --> Peso colombiano
                6) Peso colombiano --> Dólar
                7) Sair
                
                Escolha uma opção válida
        ********************************************
                """;

                System.out.print(opcoes);
    }

    
}
