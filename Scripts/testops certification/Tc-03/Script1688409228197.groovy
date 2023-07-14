import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda/home')

WebUI.maximizeWindow()

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('HomePage/Logo_hp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/searchTextbox_hp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/a_Mis Compras_hp'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/span_Iniciar sesin_hp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/bagIcon_hp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/multiSites_hp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/span_Categoras_hp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('HomePage/primaryBanner_hp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/secondaryBanner_hp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/carousel1_hp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('HomePage/footer_hp (1)'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/clickIniciarSession_Header'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : 'UN85@digisprint.com', ('password') : 'Un85@12345'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('HomePage/Logo_hp (1)'), 0)

WebUI.click(findTestObject('HomePage/span_Categoras_hp (1)'))

WebUI.click(findTestObject('HomePage/L1Category_HP (1)'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('0BLPPage/breadCrumb_blp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0BLPPage/l2Category_blp (1)'), 0)

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.click(findTestObject('0BLPPage/l2Category_blp (1)'))

WebUI.verifyElementPresent(findTestObject('0CLPPage/breadCrumb_clp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0CLPPage/l3Category_clp (1)'), 0)

WebUI.delay(3)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('0PLPPage/breadCrumb_plp (1)'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/EmptyCart_RunAt_HP'), [:], FailureHandling.OPTIONAL)

'gift item\r\n'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.gwpWithParentOOS], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/Check_gift_product_PDP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('0PLPPage/Page_Jeans slim GAP lavado obscuro para nio para Liverpool.com.mx/button_Agregar garanta'))

'digital item flag\r\n'
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : GlobalVariable.digitalP], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('0PDPPage/digital_item_flag_PDP'), 0)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

'market place '
WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : '1030531937'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0PLPPage/product1_PLP'), FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('0PDPPage/marketPlase_sellerBY_link_PDP'), 0)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'el'], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('0PLPPage/div_Precios_plp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('0PLPPage/div_Tamao_plp'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/label_Color_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/label_Descuentos_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/productName_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/productImage2_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/listView_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/gridView_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/button_Relevancia_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/button_Lo Ms Nuevo_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/button_Mayor precio_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/button_Menor precio_plp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PLPPage/button_Calificaciones_plp (1)'), 0)

not_run: WebUI.click(findTestObject('0PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

WebUI.delay(3)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('0PLPPage/carousel_plp'))

WebUI.callTestCase(findTestCase('CommonMethods/SortBY_highTOlow_check_search_plp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/SortBY_lowTOhigh_check_search_plp'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0PLPPage/a_Color_variants-normalizedColor-Blanco_plp (1)'))

WebUI.click(findTestObject('HomePage/Logo_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/SearchForAProduct_search'), [('searchTerm') : 'ropa'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/facet(liverpool)_CheckBox_selected_check_PLP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0PLPPage/product3_PLP'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('0PDPPage/breadCrumb_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/alternateImages_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/ProductImage_pdp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('0PDPPage/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/ITRLink_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

WebUI.verifyElementPresent(findTestObject('0PDPPage/Quantity(plus)_PDP'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/UpdateQuantity_PDP'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.callTestCase(findTestCase('CommonMethods/Submit_Rating_PDP'), [:], FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('CommonMethods/checkITRFunctionality_pdp'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.verifyElementPresent(findTestObject('0PDPPage/breadCrumb_pdp (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/breadCrumb_pdp'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('0PDPPage/ProductImage_pdp (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('0PDPPage/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('0PDPPage/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/ITRLink_pdp'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('0PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: WebUI.verifyElementPresent(findTestObject('0PDPPage/Quantity(plus)_PDP'), 0)

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/regularPrice_pdp'))

WebUI.verifyElementPresent(findTestObject('0PDPPage/discountPrice_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/ITRLink_pdp'), 0, FailureHandling.OPTIONAL)

WebUI.verifyElementPresent(findTestObject('0PDPPage/ratingSection_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/span_Compartir_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/AddToCart_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/h3_Ofertas y promociones_pdp'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/h3_Opiniones del artculo_pdp'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: WebUI.verifyElementPresent(findTestObject('0PDPPage/Quantity(plus)_PDP'), 0)

not_run: WebUI.click(findTestObject('pdp/selectSize1'))

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('pdp/carousels_pdp'))

not_run: WebUI.click(findTestObject('pdp/button_Agregar a mi bolsa_pdp'))

WebUI.click(findTestObject('0PDPPage/close_PDP'), FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.click(findTestObject('0PDPPage/Colour1_PDP'), FailureHandling.OPTIONAL)

WebUI.scrollToElement(findTestObject('0PDPPage/AddToCart_PDP'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('0PDPPage/AddToCart_PDP'))

WebUI.click(findTestObject('HomePage/Cart_header'))

WebUI.delay(3)

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('0CartPage/span_Mi Bolsa_cart'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/myBagImageProduct_cart (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/productName_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/productPrice_cart'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/button_EliminarIcon_cart'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/totalPrice_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('0CartPage/button_mesaDeRegalos_cart'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/button_Mover a Wishlist_cart'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/button_Eliminar_cart (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/button_Comprarahora_cart (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/priceSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/button_Comprar_cart (1)'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('0CartPage/div_Entregaestimada_cart'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('DemoObjects/CartPage/div_carouselSection_cart'), 0)

WebUI.verifyElementPresent(findTestObject('0CartPage/button_SeguirComprando_cart'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/updateQuantity_cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('CommonMethods/delete_product_cart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0CartPage/button_Comprar_cart (1)'))

WebUI.delay(3)

ActualOPCPageUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('checkoutpage/h4_Confirma tu compra_opc'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/deliveryAddressHeading_address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/label_Cambiar_Address_opc'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/Forma de Pago_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/paymentSection_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/label_Cambiar_payment_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productSection_opc'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/productImage_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productName_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/productprice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/totalPrice_opc'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/promotionSection_opc'), 0, FailureHandling.OPTIONAL)

not_run: WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Comprar para mesa de regalos_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Mover a Wishlist_opc'), 0)

WebUI.verifyElementPresent(findTestObject('checkoutpage/button_Eliminar_opc'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/button_Cupones_opc (1)'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/digital_item_flag_PDP'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/Regalo_flag_OPC2'), 0)

WebUI.verifyElementPresent(findTestObject('0PDPPage/marketPlase_sellerBY_link_PDP'), 0)

WebUI.click(findTestObject('0OPCPage/changeADDRESS_OPC'))

WebUI.verifyElementPresent(findTestObject('0OPCPage/CheckAddressDefault_Checkout'), 0)

WebUI.verifyElementClickable(findTestObject('0OPCPage/clickAndCollect_OPC'))

WebUI.click(findTestObject('0OPCPage/AddAddressButtonPopup_checkout'))

WebUI.callTestCase(findTestCase('CommonMethods/addAddress_fillform_opc'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0OPCPage/paymentMethod_change_OPC'))

WebUI.verifyElementPresent(findTestObject('0OPCPage/paymentMethod_button1_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/paymentMethod_button2_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/paymentMethod_button1_OPC'), 0)

WebUI.callTestCase(findTestCase('CommonMethods/cardSelect_card1_CO1'), [:], FailureHandling.STOP_ON_FAILURE)

'would show if the login user has a default card'
WebUI.verifyElementPresent(findTestObject('0OPCPage/CardLast4Digit_OPC'), 0)

WebUI.verifyElementPresent(findTestObject('0OPCPage/card_pink_radiobutton_OPC'), 0)

not_run: WebUI.click(findTestObject('0OPCPage/final_confirm_order_button_OPC'))

not_run: WebUI.click(findTestObject('0OPCPage/button_Continuar_payment_opc (3)'))

WebUI.delay(4)

WebUI.click(findTestObject('0OPCPage/button_Finalizar compra_opc (1)'))

WebUI.delay(5)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/a_Mis compras_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productDetailHeading_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productImage_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/gracias por comprar_confirmation (1)'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/addressSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/paymentSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/totalPrice_confirmation'), 0)

not_run: WebUI.verifyElementPresent(findTestObject('ConfirmationPage/carousel_confirmation'), 0)

CardOrder = WebUI.getText(findTestObject('ConfirmationPage/PaypalOrderNumber_ConfirmationPage'))

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Continuar comprando_confirmation'), 0)

WebUI.click(findTestObject('ConfirmationPage/button_Ir a Mis compras_confirmation'))

WebUI.callTestCase(findTestCase('CommonMethods/delete_Product1_OPC2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('0OPCPage/button_Finalizar compra_opc (1)'))

WebUI.delay(3)

actualConfirmationUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/gracias por comprar_confirmation (1)'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/a_Mis compras_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productDetailHeading_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/productImage_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/div_Entrega estimada_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/addressSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/paymentSection_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/totalPrice_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/legalInfo_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/referenceNumber_confirmation'), 0)

referenceNumber_confirmation = WebUI.getText(findTestObject('ConfirmationPage/referenceNumber_confirmation'))

not_run: WebUI.verifyElementPresent(findTestObject('ConfirmationPage/carousel_confirmation'), 0)

WebUI.verifyElementPresent(findTestObject('ConfirmationPage/button_Continuar comprando_confirmation'), 0)

WebUI.click(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'))

WebUI.click(findTestObject('ConfirmationPage/button_Ir a Mis compras_confirmation'))

WebUI.delay(3)

actualMisComprasUrl = WebUI.getUrl()

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

WebUI.setText(findTestObject('MyOrderesPage/mainSearchbar_misCompras'), referenceNumber_confirmation)

WebUI.sendKeys(findTestObject('MyOrderesPage/mainSearchbar_misCompras'), Keys.chord(Keys.ENTER))

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/breadCrumb_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/aside_leftNavigation_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/mainSearchbar_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/span_Filtrar compras_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/productName_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/img_product__image_misCompras'), 0)

WebUI.verifyElementPresent(findTestObject('MyOrderesPage/button_Comprar nuevamente__misCompras'), 0)

WebUI.click(findTestObject('MyOrderesPage/button_Ver detalle de compra_misCompras'))

WebUI.closeBrowser()

