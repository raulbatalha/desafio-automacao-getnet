package br.com.getnet.pagina.construtor;

import br.com.getnet.navegador.ConfiguracaoDoNavegador;
import br.com.getnet.pagina.elementos.ElementosPesquisa;
import org.openqa.selenium.support.PageFactory;

public class ConstrutorPesquisa extends ConfiguracaoDoNavegador {
    ElementosPesquisa construtorDePesquisa = null;

    public void elementoDePesquisa() {
        construtorDePesquisa = PageFactory.initElements(driverSelenium, ElementosPesquisa.class);
        construtorDePesquisa.clickElementoDePesquisa();
    }

    public void fecharJanelaModal() {
        construtorDePesquisa = PageFactory.initElements(driverSelenium, ElementosPesquisa.class);
        construtorDePesquisa.clickFecharJanela();
    }
}
