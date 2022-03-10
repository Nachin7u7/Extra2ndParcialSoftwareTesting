package factoryBrowser;

public class FactoryBrowser {
    public static IBrowser make(String browserType) {
        IBrowser browser;

        switch (browserType.toLowerCase()) {

            case "chrome":
                browser = new Chrome();
                break;
            default:
                browser = new Chrome();
                break;
        }

        return browser;

    }
}
