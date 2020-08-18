# Desafio Automação GetNet

Desafio técnico da Empresa GetNet.

**O desafio técnico foi lançado com os seguintes passos:**

1. Acessar o site: https://site.getnet.com.br/
2. No campo de busca(LUPA), pesquisar por "*superget*"
3. No resultado da busca, clicar no link "*como faço a portabilidade da minha maquininha*"
4. Verificar se a modal foi aberta com a mensagem “*Como faço a portabilidade da minha maquininha?*"

> Observação:
O passo 3 não pode ser executado por não ter o link ativo, logo foi usando um link que se aproxima do solicitado "*Posso utilizar a conta SuperGet para receber as vendas de outras maquininhas?*". O passo 4 foi mantida a mensagem, assim é possível ver uma falha sendo exibida!

> Por se tratar de um sistema em produção foi utilizado um *Thread.sleep* no código pra ter um ganho de espera no carregamento dos dados no portal, esse processo não deve ser muito utilizado devido a perda de tempo no processo, sistema iguais deve ser criado ambiente de teste onde os dados de servidores estejam mockados ou locais, assim evita tão uso de *Thread*.



