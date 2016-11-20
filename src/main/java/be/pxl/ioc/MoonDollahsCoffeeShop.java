package be.pxl.ioc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MoonDollahsCoffeeShop {

    private List<Barista> baristas = new ArrayList<>();

    MoonDollahsCoffeeShop() {
        WorkEthic lazy = new LazyWorkEthic();
        WorkEthic badHearing = new BadHearingWorkEthic();
        WorkEthic friendly = new CustomerFriendlyWorkEthic();
        Barista vicky = new Barista("vicky");
        Barista gemmaA = new Barista("gemma");
        Barista gianluca = new Barista("gianluca");
        Barista gemmaB = new Barista("gemma");
        vicky.setWorkEthic(lazy);
        gemmaA.setWorkEthic(badHearing);
        gianluca.setWorkEthic(friendly);
        gemmaB.setWorkEthic(friendly);
        baristas = Arrays.asList(vicky, gemmaA, gianluca, gemmaB);
    }

    public static void main(String[] args) {
        MoonDollahsCoffeeShop shop = new MoonDollahsCoffeeShop();


        List<String> customers = Arrays.asList("meliodas", "ban", "elizabeth", "king", "merlin", "howther", "diane", "escanor");
        shop.serve(customers);
    }

    private void serve(List<String> customers) {
        customers.stream().map(this::serve).forEach(System.out::println);
    }

    private CustomerExperience serve(String customer) {
        int random = ThreadLocalRandom.current().nextInt(0, baristas.size());
        return baristas.get(random).serve(customer);
    }

    List<Barista> getBaristas() {
        return baristas;
    }

}
