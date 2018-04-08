import org.javamoney.moneta.convert.imf.IMFHistoricRateProvider;
import org.javamoney.moneta.convert.imf.IMFRateProvider;

/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE CONDITION THAT YOU
 * ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT. PLEASE READ THE TERMS AND CONDITIONS OF THIS
 * AGREEMENT CAREFULLY. BY DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF
 * THE AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE" BUTTON AT THE
 * BOTTOM OF THIS PAGE. Specification: JSR-354 Money and Currency API ("Specification") Copyright
 * (c) 2012-2013, Credit Suisse All rights reserved.
 */
module org.javamoney.moneta.convert.imf {
    requires org.javamoney.moneta.convert;
    provides javax.money.convert.ExchangeRateProvider with
            IMFRateProvider, IMFHistoricRateProvider;
    uses org.javamoney.moneta.spi.LoaderService;
    uses org.javamoney.moneta.spi.MonetaryAmountProducer;
}