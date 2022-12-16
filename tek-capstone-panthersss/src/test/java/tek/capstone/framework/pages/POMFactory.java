package tek.capstone.framework.pages;

import tek.capstone.framework.base.BaseSetupp;

public class POMFactory extends BaseSetupp {

    private RetailHomePage homepage;

    private RetailSignInPage signInPage;

    private RetailAccountPage accountPage;

    private RetailOrderPage orderPage;

    public POMFactory() {
        this.homepage = new RetailHomePage();
        this.signInPage = new RetailSignInPage();
        this.accountPage = new RetailAccountPage();
        this.orderPage = new RetailOrderPage();

    }

    public RetailHomePage homepage() {
        return this.homepage;
    }

    public RetailSignInPage signInPage() {
        return this.signInPage;
    }

    public RetailAccountPage accountPage() {
        return this.accountPage;
    }

    public RetailOrderPage orderPage() {
        return this.orderPage;
    }

}
