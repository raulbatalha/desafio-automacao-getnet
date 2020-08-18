package br.com.getnet.pagina.elementos;

import br.com.getnet.navegador.ConfiguracaoDoNavegador;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ElementosDePaginaDaPesquisa extends ConfiguracaoDoNavegador {

    @FindBy(xpath = "//a[contains(text(), 'Ok')]")
    @CacheLookup
    private WebElement aceitarCookie;

    @FindBy(id = "search-trigger")
    @CacheLookup
    private WebElement botaoLupa;

    @FindBy(id = "global-search-input")
    @CacheLookup
    private WebElement campoPesquisa;

    public void clickAceitarCookie() {
        aceitarCookie.isDisplayed();
        aceitarCookie.click();
    }

    public void clickNoBotaoLupa() {
        botaoLupa.click();
    }

    public void clickCampoPesquisa(String nomeDaPesquisa) {
        campoPesquisa.sendKeys(nomeDaPesquisa);
        campoPesquisa.submit();
    }
}