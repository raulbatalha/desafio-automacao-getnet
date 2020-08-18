package br.com.getnet.suite_de_teste;

import br.com.getnet.navegador.ConfiguracaoDoNavegador;
import br.com.getnet.pagina.construtor.ConstrutorDePaginaDaPesquisa;
import br.com.getnet.pagina.construtor.ConstrutorPesquisa;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static br.com.getnet.pagina.variavel_util.VariavelUtil.xpathModal;
import static java.lang.Thread.sleep;

public class CT001_CasoDeTestePesquisa extends ConfiguracaoDoNavegador {

    ConstrutorDePaginaDaPesquisa elementosParaPesquisa = new ConstrutorDePaginaDaPesquisa();
    ConstrutorPesquisa elementoDaPesquisa = new ConstrutorPesquisa();

    @Dado("^que desejo acessar a pagina da GetNet$")
    public void queDesejoAcessarAPaginaDaGetNet() {
        configuracaoDoNavegador();
        try {
            elementosParaPesquisa.aceitarCookie();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Quando("^realizar uma pesquisa com o nome \"([^\"]*)\"$")
    public void realizarUmaPesquisaComONome(String nomeDaPesquisa) throws InterruptedException {
        sleep(60000);
        elementosParaPesquisa.botaoLupa();
        waitSelenium.until(ExpectedConditions.visibilityOfElementLocated(By.id("global-search-input")));
        elementosParaPesquisa.campoPesquisa(nomeDaPesquisa);
        elementosParaPesquisa.barraDeRolagem();
    }

    @Entao("^recebo a mensagem \"([^\"]*)\" !$")
    public void receboAMensagem(String mensagem) {
        elementoDaPesquisa.elementoDePesquisa();

        waitSelenium.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathModal)));
        String mensagemDeTexto = driverSelenium.findElement(By.xpath(xpathModal)).getText();
        Assert.assertEquals(mensagem, mensagemDeTexto);

        elementoDaPesquisa.fecharJanelaModal();
    }

    @After(order = 0)
    public static void tearDown() {
        driverSelenium.close();
    }
}