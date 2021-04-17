package webprog.oblig3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class Oblig3Controller {
    private final List<Billetter> alleKjop = new ArrayList<>();

    @PostMapping("/lagre")
    public void lagreKjop(Billetter innKjop){
        alleKjop.add(innKjop);
    }
    @GetMapping("/hentBilletter")
    public List<Billetter> hentBilletter(){
        return alleKjop;
    }
    @GetMapping("/slett")
    public void slett(){
        alleKjop.clear();
    }
}
