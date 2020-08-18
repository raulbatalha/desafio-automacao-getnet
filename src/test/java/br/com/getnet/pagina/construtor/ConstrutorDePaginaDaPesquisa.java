package br.com.getnet.pagina.construtor;

import br.com.getnet.navegador.ConfiguracaoDoNavegador;
import br.com.getnet.pagina.elementos.ElementosDePaginaDaPesquisa;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class ConstrutorDePaginaDaPesquisa extends ConfiguracaoDoNavegador {
    ElementosDePaginaDaPesquisa construtorDosElementos = null;
    JavascriptExecutor barraDeRolagem = null;

    public void aceitarCookie() {
        construtorDosElementos = PageFactory.initElements(driverSelenium, ElementosDePaginaDaPesquisa.class);
        construtorDosElementos.clickAceitarCookie();
    }

    public void botaoLupa() {
        construtorDosElementos = PageFactory.initElements(driverSelenium, ElementosDePaginaDaPesquisa.class);
        construtorDosElementos.clickNoBotaoLupa();
    }

    public void campoPesquisa(String nomeDaPesquisa) {
        construtorDosElementos = PageFactory.initElements(driverSelenium, ElementosDePaginaDaPesquisa.class);
        construtorDosElementos.clickCampoPesquisa(nomeDaPesquisa);
    }

    public void barraDeRolagem() {
        barraDeRolagem = (JavascriptExecutor) driverSelenium;
        barraDeRolagem.executeScript("window.scrollTo(0, 450)");
    }
}