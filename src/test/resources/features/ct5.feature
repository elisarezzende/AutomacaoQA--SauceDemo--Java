Feature: Product Review

	@productreview @full
  Scenario: Validating Swag Labs Product Review
  	Given que  o usuario acessa a aplicacao Sauce Demo
    When visualizar a tela de login
    And preencher o campo usuario com o dado "standard_user"
    And preencher o campo senha com o dado "secret_sauce"
    And clicar no botao Login
    When visualizar a tela de produtos
    And Seleciona um item
    Then Sistema apresentará as informações sobre o produto selecionado