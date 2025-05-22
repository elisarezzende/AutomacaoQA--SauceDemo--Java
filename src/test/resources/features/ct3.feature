Feature: Validating Login

	@loginincorreto2 @full
  Scenario: Validating Swag Labs Login
    Given que  o usuario acessa a aplicacao Sauce Demo
    When visualizar a tela de login
    And preencher o campo usuario com o dado "locked_out_user"
    And preencher o campo senha com o dado "secret_sauce"
    And clicar no botao Login
    Then Sistema apresenta mensagem: Epic sadface: Username and password do not match any user in this service