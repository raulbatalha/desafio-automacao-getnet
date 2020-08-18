#language:pt
Caracteristica: Teste para automação Getnet

  Contexto:
    Dado que desejo acessar a pagina da GetNet

  Esquema do Cenário:  CT001 Caso de Teste Pesquisa
    Quando realizar uma pesquisa com o nome "<nomeDaPesquisa>"
    Entao recebo a mensagem "<mensagem>" !

    Exemplos:
      | nomeDaPesquisa | mensagem                                       |
      | superget       | Como faço a portabilidade da minha maquininha? |