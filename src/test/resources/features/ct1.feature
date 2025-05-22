Feature: Validating Login

	@logincorreto @full
  Scenario: Validating Swag Labs Login
    Given que  o usuario acessa a aplicacao Sauce Demo
    When visualizar a tela de login
    And preencher o campo usuario com o dado "standard_user"
    And preencher o campo senha com o dado "secret_sauce"
    And clicar no botao Login
    Then o usuario e redirecionado para tela com os produtos disponiveis