Feature: Order Validation

	@ordervalidation @full
  Scenario: Validating Swag Labs Order Validation
  	Given que  o usuario acessa a aplicacao Sauce Demo
    When visualizar a tela de login
    And preencher o campo usuario com o dado "standard_user"
    And preencher o campo senha com o dado "secret_sauce"
    And clicar no botao Login
    When visualizar a tela de produtos
    And clicar no botão Drop-Down no canto superior direito
    And Selecionar a opção LOW TO HIGH
    Then Sistema apresentará os itens em ordem de valor crescente