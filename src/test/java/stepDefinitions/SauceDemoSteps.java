//StepDefinition.java;
package stepDefinitions;

import actions.SauceDemoActions;
import io.cucumber.java.pt.*;

public class SauceDemoSteps {
	SauceDemoActions sauceDemoActions = new SauceDemoActions();

    @Dado("que  o usuario acessa a aplicacao Sauce Demo")
    public void queOUsuarioAcessaAAplicacaoSauceDemo() {
    	sauceDemoActions.navegarHomePage();
    }
    
    @Quando("visualizar a tela de login")
    public void visualizarTelaLogin() {
    	sauceDemoActions.visualizaTelaLogin();
    }

    @Quando("preencher o campo usuario com o dado {string}")
    public void preencherOCampoUsuarioComODado(String usuario) {
        sauceDemoActions.preencherCampoUsuario(usuario);
    }

    @Quando("preencher o campo senha com o dado {string}")
    public void preencherOCampoSenhaComODado(String senha) {
        sauceDemoActions.preencherCampoSenha(senha);
    }
    
    @Quando("preencher o campo First Name {string}")
    public void preencherOCampoFirstName(String firstName) {
    	sauceDemoActions.preencheOCampoFirstName(firstName);
    }
    
    @Quando("preencher o campo Last Name {string}")
    public void preencherOCampoLastName(String lastName) {
    	sauceDemoActions.preencheOCampoLastName(lastName);
    }
    
    @Quando("preencher o campo Zip Postal Code {string}")
    public void preencherOCampoZipCode(String lastName) {
    	sauceDemoActions.preencheOCampoZipCode(lastName);
    }
    
    @Quando("visualizar a tela de produtos")
    public void visualizarTelaProdutos() {
    	sauceDemoActions.verificaProdutos();
    }
    
    @Quando("clicar no botao Login")
    public void clicarBotaoLogin() {
    	sauceDemoActions.clicarLogin();
    }
    
    @Quando("clicar no botão Drop-Down no canto superior direito")
    public void botaoDropDown() {
    	sauceDemoActions.clicarBotaoDropDown();
    }
    
    @Quando("Selecionar a opção LOW TO HIGH")
    public void ordenarLowToHigh() throws InterruptedException {
    	sauceDemoActions.ordenaLowToHigh();
    }
    
    @Quando("Seleciona um item")
    public void selecionarItem() throws InterruptedException {
    	sauceDemoActions.selecionaItem();
    }
    
    @Quando("Escolhe os itens e adiciona o produto ao carrinho")
    public void escolherItem() {
    	sauceDemoActions.escolheItem();
    }
    
    @Quando("Clicar em Checkout")
    public void fazerCheckOut() {
    	sauceDemoActions.checkoutCompra();
    }
    
    @Quando("Visualizar a tela de Checkout: Your Information")
    public void checkoutYourInformation() {
    	sauceDemoActions.telaCheckout();
    }
    
    @Quando("clicar no botão Continue")
    public void clickContinue() {
    	sauceDemoActions.cliqueContinue();
    }
    
    @Quando("Visualizar a tela Checkout: Overview")
    public void checkoutOvierview() {
    	sauceDemoActions.telaCheckoutOvierview();
    }
    
    @Quando("clicar em Finish")
    public void clicarEmFinish() {
    	sauceDemoActions.clicaEmFinish();
    }
    
    @Quando("Escolhe um produto para ser removido")
    public void removerProduto() {
    	sauceDemoActions.removeProduto();
    }
    
    @Entao("o usuario e redirecionado para tela com os produtos disponiveis")
    public void oUsuarioERedirecionadoParaTelaComOsProdutosDisponiveis() {
    	sauceDemoActions.verificarTitulo();   	
    }
    
    @Entao("Sistema apresenta mensagem: Epic sadface: Username and password do not match any user in this service")
    public void mensagemDeErroLogin() {
    	sauceDemoActions.verificaMensagemErro();
    }
    
    @Entao("Sistema apresentará os itens em ordem de valor crescente")
    public void validarOrdenacao() {
    	sauceDemoActions.validaOrdenacao();
    }
    
    @Entao("Sistema apresentará as informações sobre o produto selecionado")
    public void validarAparicaoDoProduto() throws InterruptedException {
    	sauceDemoActions.validaAparicaoDoProduto();
    }
    
    @Entao("O sistema vai mostrar o produto selecionado no carrinho")
    public void sistemaMostrarOCarrinho() {
    	sauceDemoActions.mostraCarrinho();
    }
    
    @Entao("o sistema apresentará a tela de Checkout: Complete!")
    public void checkOutComplete() {
    	sauceDemoActions.telacheckOutComplete();
    }
    
    @Entao("O produto será removido do carrinho")
    public void removerProdDoCarrinho() {
    	sauceDemoActions.verificacaoRemover();
    }
    
}
