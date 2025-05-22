Feature: Product Review

	@buyproduct @full
  Scenario: Buying a selected product
  	Given que  o usuario acessa a aplicacao Sauce Demo
    When visualizar a tela de login
    And preencher o campo usuario com o dado "standard_user"
    And preencher o campo senha com o dado "secret_sauce"
    And clicar no botao Login
    When visualizar a tela de produtos
    And Escolhe os itens e adiciona o produto ao carrinho
    And O sistema vai mostrar o produto selecionado no carrinho
    And Clicar em Checkout
    When Visualizar a tela de Checkout: Your Information
    And preencher o campo First Name "Ana"
    And preencher o campo Last Name "EDemais"
    And preencher o campo Zip Postal Code "daConta"
    And clicar no botão Continue
    When Visualizar a tela Checkout: Overview
    And clicar em Finish
    Then o sistema apresentará a tela de Checkout: Complete!