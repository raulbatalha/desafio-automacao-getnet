package br.com.getnet.executor;

import br.com.getnet.navegador.ConfiguracaoDoNavegador;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/br/com/getnet/definicao_dos_testes",
        glue = "br/com/getnet/suite_de_teste",
        plugin = {"pretty", "html: reports/reports/report.html"},
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        strict = false
)
public class ExecutarTeste extends ConfiguracaoDoNavegador {
}