package pl.com.bottega.ecommerce.sales.domain.taxcalculation;

import pl.com.bottega.ecommerce.sales.domain.invoicing.Tax;

public interface TaxCalculator {

    public Tax calculateTax();
}
