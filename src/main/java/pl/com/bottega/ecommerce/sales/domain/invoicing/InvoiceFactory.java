package pl.com.bottega.ecommerce.sales.domain.invoicing;

import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.ClientData;
import pl.com.bottega.ecommerce.canonicalmodel.publishedlanguage.Id;

public class InvoiceFactory {

    public static Invoice getInvoice(ClientData clientData) {
        return new Invoice(Id.generate(), clientData);
    }
}
