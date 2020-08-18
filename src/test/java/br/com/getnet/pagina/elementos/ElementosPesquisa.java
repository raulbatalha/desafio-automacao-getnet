package br.com.getnet.pagina.elementos;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementosPesquisa {
    @FindBy(xpath = "//a[@class='c-search-page__link'][10]")
    private WebElement elementoPesquisado;

    @FindBy (xpath = "//div[@class='o-modal__close o-modal__close-x']")
    private WebElement fecharJanelaModal;

    public void clickElementoDePesquisa() {
        elementoPesquisado.click();
    }

    public void clickFecharJanela(){
        fecharJanelaModal.click();
    }
}