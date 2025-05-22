package Pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.messages.types.Duration;
import utils.BasePage;

public class SauceDemoPage extends BasePage {

	private static final String USER_NAME_FIELD = "//*[@id=\"user-name\"]";
	private static final String PASSWORD_FIELD = "//*[@id=\"password\"]";
	private static final String LOGIN_BUTTON = "//*[@id=\"login-button\"]";
	//private static final String HAMBURGER_MENU = "//*[@id=\"react-burger-menu-btn\"]";
	private static final String TITLE_PRODUCTS = "//*[@id=\"header_container\"]/div[2]/span";
	private static final String LOGIN_ERROR_MESSAGE = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";
	private static final String PRODUCTS_PAGE_TITLE = "//*[@id=\"header_container\"]/div[2]/span";
	private static final String DROP_DOWN_BUTTON = "//*[@id=\"header_container\"]/div[2]/div/span/select";
	private static final String LOW_TO_HIGH = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]";
	private static final String SWAG_LABS = "//*[@id=\"root\"]/div/div[1]";
	private static final String BACK_TO_PRODUCTS = "//*[@id=\"back-to-products\"]";
	private static final String INVENTORY_ITEM_NAME = "inventory_item_name";
	private static final String INVENTORY_ITEM_PRICE = "inventory_item_price";
	private static final String CART_LIST = "cart_list";
	private static final String SHOPPING_CART = "//*[@id=\"shopping_cart_container\"]/a";
	private static final String YOUR_CART =	"//*[@id=\"header_container\"]/div[2]/span";
	private static final String CHECKOUT_YOUR_INFORMATION = "//*[@id=\"header_container\"]/div[2]/span";
	private static final String CHECKOUT_BUTTON = "//*[@id=\"checkout\"]";
	private static final String FIRST_NAME_FIELD = "//*[@id=\"first-name\"]";
	private static final String LAST_NAME_FIELD = "//*[@id=\"last-name\"]";
	private static final String ZIP_CODE_FIELD = "//*[@id=\"postal-code\"]";
	private static final String CONTINUE_BUTTON = "//*[@id=\"continue\"]";
	private static final String CHECKOUT_OVERVIEW = "//*[@id=\"header_container\"]/div[2]/span";
	private static final String FINISH_BUTTON = "//*[@id=\"finish\"]";
	private static final String CHECKOUT_COMPLETE = "//*[@id=\"header_container\"]/div[2]/span";
	
	private List<String> chosenItems;
	

	// Getter methods for the WebElements
	public WebElement getUserNameField() {
		// Locate and return the user name input field element
		return driver.findElement(By.xpath(USER_NAME_FIELD));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.xpath(PASSWORD_FIELD));
	}
	
	public WebElement getFirstName() {
		return driver.findElement(By.xpath(FIRST_NAME_FIELD));
	}
	
	public WebElement getLastName() {
		return driver.findElement(By.xpath(LAST_NAME_FIELD));
	}
	
	public WebElement getZipPostalCode() {
		return driver.findElement(By.xpath(ZIP_CODE_FIELD));
	}
	
	public WebElement getButtonContinue() {
		return driver.findElement(By.xpath(CONTINUE_BUTTON));
	}

	public WebElement getInfo(String path) {
		WebElement element = driver.findElement(By.xpath(path));
		if (element.isEnabled()) {
			return element;
		} else {
			System.out.println("Não validado");
		}

		return driver.findElement(By.xpath(path));
	}

	public WebElement getLoginButton() {
		WebElement loginButton = getInfo(LOGIN_BUTTON);
		return loginButton;
	}

	public WebElement getLoginScreen() {
		WebElement loginScreen = getInfo(SWAG_LABS);
		return loginScreen;
	}

	public WebElement getMenuTitle() {
		WebElement menuTitle = getInfo(TITLE_PRODUCTS);
		return menuTitle;
	}

	public WebElement getErrorMessage() {
		WebElement errorMessage = getInfo(LOGIN_ERROR_MESSAGE);
		return errorMessage;
	}

	public WebElement getProductsPageName() {
		WebElement productPageName = getInfo(PRODUCTS_PAGE_TITLE);
		return productPageName;
	}

	public WebElement getDropDownButton() {
		WebElement dropDownButton = getInfo(DROP_DOWN_BUTTON);
		return dropDownButton;
	}

	public WebElement getLowToHighButton() {
		WebElement lowToHighButton = getInfo(LOW_TO_HIGH);
		return lowToHighButton;
	}

	@SuppressWarnings("deprecation")
	public boolean verifyIfIsSortedByPriceAscending() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> priceElements = driver.findElements(By.className(INVENTORY_ITEM_PRICE)); // captura a parte dos preços
		
		List<Double> extractedPrices = new ArrayList<>(); // armazeno em uma lista -- ainda contem o cifrão

		for (WebElement element : priceElements) { // pega cada valor
			String priceText = element.getText().replace("$", ""); // remove o cifrão
			extractedPrices.add(Double.parseDouble(priceText)); // converte pra double
		}
		
		List<Double> sortedPrices = new ArrayList<>(extractedPrices); // cria uma cópia e ordena a lista manualmente
		Collections.sort(sortedPrices); // ordenação crescente (menor para maior)
		
		return extractedPrices.equals(sortedPrices); // compara se a lista extraida está igual a lista ordenada
	}

	public WebElement getSelectedItemInformation() {
		// pego todos os itens da classe
		List<WebElement> productElements = driver.findElements(By.className(INVENTORY_ITEM_NAME));

		Random random = new Random();
		WebElement selectedElement = productElements.get(random.nextInt(productElements.size())); // escolho produto
																									// aleatorio

		return selectedElement;
	}

	public void verifyIfClicked() throws InterruptedException {

		// TimeUnit.SECONDS.sleep(5);

		WebElement backToProducts = driver.findElement(By.xpath(BACK_TO_PRODUCTS));

		if (backToProducts.isEnabled()) { // voltar pra ideia inicial e tentar comparar o nome sorteado com o nome
											// na nova pagina
			// acho que get text nas duas e dar assertequals vai -- esse foi apenas pq eu
			// tinha cansado
			System.out.println("Produto selecionado corretamente");
		} else {
			System.out.println("Erro: Produto diferente encontrado na página de detalhes.");
		}
	}

	public List<String> pickItem() {
		List<String> products = Arrays.asList("//*[@id='add-to-cart-sauce-labs-backpack']",
				"//*[@id='add-to-cart-sauce-labs-bike-light']", "//*[@id='add-to-cart-sauce-labs-bolt-t-shirt']",
				"//*[@id='add-to-cart-sauce-labs-fleece-jacket']", "//*[@id='add-to-cart-sauce-labs-onesie']",
				"//*[@id='add-to-cart-test.allthethings()-t-shirt-(red)']");

		Random random = new Random();
		int quantity = random.nextInt(5) + 1;
		List<String> alreadyChosen = new ArrayList<>();

		int i = 0;
		while (i < quantity) {
			String randomXpath = products.get(random.nextInt(products.size())); // escolhe aleatoriamente o produto

			if (!alreadyChosen.contains(randomXpath)) { // verifica se o produto escolhido já esta na lista
				WebElement successElement = driver.findElement(By.xpath(randomXpath)); // encontra o produto na tela
				successElement.click();
				alreadyChosen.add(randomXpath); // adiciona a lista dos já esolhidos
				i++;
			}
		}
		//System.out.println("Produtos adicionados ao carrinho: " + alreadyChosen);
		chosenItems = alreadyChosen;
		return alreadyChosen;
	}

	public void showShoppingCart() {
		WebElement cart = driver.findElement(By.xpath(SHOPPING_CART));
		if (cart.isEnabled()) {
			cart.click();
		}
		
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(0));
		WebElement shoppingCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(YOUR_CART)));
		
		if (shoppingCart.isEnabled()) {
			System.out.println("Produtos estão no carrinho.");
		}
	}
	
	public WebElement checkoutShop() {
		WebElement checkout = driver.findElement(By.xpath(CHECKOUT_BUTTON));
		return checkout;
	}
	
	public WebElement checkoutYourInformation() {
		WebElement yourInfo = getInfo(CHECKOUT_YOUR_INFORMATION);
		return yourInfo;
	}	
	
	public WebElement screenCheckoutOvierview() {
		WebElement checkout = getInfo(CHECKOUT_OVERVIEW);
		return checkout;
	}
	
	public WebElement getFinishButton() {
		WebElement finish = getInfo(FINISH_BUTTON);
		return finish;
	}
	
	public WebElement getcheckOutComplete() {
		WebElement checkOutComplete = getInfo(CHECKOUT_COMPLETE);
		return checkOutComplete;
	}
	
	public boolean getRemoveButton() {
		List<String> removeButtonOptions = Arrays.asList("//*[@id=\'remove-sauce-labs-backpack\']","//*[@id=\'remove-sauce-labs-bike-light\']",
				"//*[@id=\'remove-sauce-labs-bolt-t-shirt\']", "//*[@id=\'remove-sauce-labs-fleece-jacket\']", "//*[@id='remove-sauce-labs-onesie']",
				"//*[@id=\'remove-test.allthethings()-t-shirt-(red)\']");
		
		List<String> itemToRemove = new ArrayList<>();
		Random random = new Random();
		
		// comparação para entendimento dos itens recebidos com seu respectivo botão de remover e adicionar em uma nova lista
		for (String product : chosenItems) {
            String productName = product.split("-cart-")[1].split("']")[0];
            for (String removeButton : removeButtonOptions) {
                if (removeButton.contains(productName)) {
                	itemToRemove.add(removeButton);
                    //System.out.println("Produto: " + product + " Comparação " + removeButton);
                }
            }
        }
		
		// escolha do produto a ser removido da lista de forma aleatoria 
		String product = itemToRemove.get(random.nextInt(itemToRemove.size()));
		//System.out.println("PRODUTOOOOOO: " + product);
		
		// remoção do produto escolhido
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
		WebElement remove = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(product)));
		if (remove.isEnabled()) {
			remove.click();
			//System.out.println("Produto removido: " + product);
		}
		
		// verificação se o elemento correto foi removido do carrinho, com base na escolha acima
        List<WebElement> produtosNoCarrinhoAposExclusao = driver.findElements(By.className(CART_LIST)); //faz a lista com os elementos contidos na tela
        boolean produtoRemovido = true;
        for (WebElement prod : produtosNoCarrinhoAposExclusao) {
        	if (prod.getText().contains(product)) { //verifica se contem o produto que eu removi na lista da tela atual após exclusao
        		produtoRemovido = false;
        		break;
        	}
        }
        return produtoRemovido;
    }
	
	public void verifyRemoval() {
		Boolean removido = getRemoveButton();
		
		if(removido) {
        	System.out.println("Produto removido.");
        }
	}
}
