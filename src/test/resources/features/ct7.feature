Feature: Product Removal

	@removeproduct @full
  Scenario: Buying a selected product
  	Given que  o usuario acessa a aplicacao Sauce Demo
    When visualizar a tela de login
    And preencher o campo usuario com o dado "standard_user"
    And preencher o campo senha com o dado "secret_sauce"
    And clicar no botao Login
    When visualizar a tela de produtos
    And Escolhe os itens e adiciona o produto ao carrinho
    And O sistema vai mostrar o produto selecionado no carrinho
    And Escolhe um produto para ser removido
    Then O produto será removido do carrinho