package actions;

import java.util.concurrent.TimeUnit;

//import static org.junit.Assert.assertEquals;

import Pages.SauceDemoPage;
import utils.BasePage;

public class SauceDemoActions extends BasePage{
	SauceDemoPage sauceDemoPage = new SauceDemoPage();
	

	public void navegarHomePage() {
		driver.get("https://www.saucedemo.com/");
	}
	
	public void clicarLogin() {
		sauceDemoPage.getLoginButton().click();
	}

	public void preencherCampoUsuario(String usuario) {
		sauceDemoPage.getUserNameField().sendKeys(usuario);	
	}

	public void preencherCampoSenha(String senha) {
		sauceDemoPage.getPasswordField().sendKeys(senha);	
	}
	
	public void preencheOCampoFirstName(String firstName) {
		sauceDemoPage.getFirstName().sendKeys(firstName);
	}
	
	public void preencheOCampoLastName(String lastName) {
		sauceDemoPage.getLastName().sendKeys(lastName);
	}
	
	public void preencheOCampoZipCode(String zipPostalCode) {
		sauceDemoPage.getZipPostalCode().sendKeys(zipPostalCode);
	}
	
	public void clicaEmFinish() {
		sauceDemoPage.getFinishButton().click();
	}

	public void verificarTitulo() {
//		assertEquals(sauceDemoPage.getTituloHomePage().getText(), titulo);
		sauceDemoPage.getMenuTitle(); //clica no element que eu encontrei
	}
	
	public void verificaMensagemErro() { 
		sauceDemoPage.getErrorMessage();
	}
	
	//public void ordenaPreço() {
	//	sauceDemoPage.getPriceOrder();
	//}
	
	public void visualizaTelaLogin() {
		sauceDemoPage.getLoginScreen();
	}
	
	public void verificaProdutos() {
		sauceDemoPage.getProductsPageName();
	}
	
	public void clicarBotaoDropDown() {
		sauceDemoPage.getDropDownButton().click();
	}
	
	public void cliqueContinue() {
		sauceDemoPage.getButtonContinue().click();
	}
	
	public void ordenaLowToHigh() throws InterruptedException {
		sauceDemoPage.getLowToHighButton().click();
		//TimeUnit.SECONDS.sleep(5); 
	}
	
	public void validaOrdenacao() {
		boolean resultado = sauceDemoPage.verifyIfIsSortedByPriceAscending();
		if (resultado) {
			System.out.println("Ordenação validada");
		} else {
			System.out.println("Ordenção não foi validada");
		}
	}
	
	public void selecionaItem() {
		sauceDemoPage.getSelectedItemInformation().click();
	}

	public void validaAparicaoDoProduto() throws InterruptedException {
		sauceDemoPage.verifyIfClicked();
		
	}
	
	public void escolheItem() {
		sauceDemoPage.pickItem();
		}
	
	public void mostraCarrinho() {
		sauceDemoPage.showShoppingCart();
	}
	
	public void checkoutCompra() {
		sauceDemoPage.checkoutShop().click();
	}
	
	public void telaCheckout() {
		sauceDemoPage.checkoutYourInformation();
	}
	
	public void telaCheckoutOvierview() {
		sauceDemoPage.screenCheckoutOvierview();
	}
	
	public void telacheckOutComplete() {
		sauceDemoPage.getcheckOutComplete();
	}
	
	public void removeProduto() {
		sauceDemoPage.getRemoveButton();//.click();
	}
	
	public void verificacaoRemover() {
		sauceDemoPage.verifyRemoval();
	}
	
}
	
	
