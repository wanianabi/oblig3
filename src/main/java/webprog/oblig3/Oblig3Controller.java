package webprog.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class Oblig3Controller {

    @Autowired
    Oblig3Repository rep;

    @PostMapping("/lagre")
    public void lagreKjop(Billetter innKjop){
        rep.lagre(innKjop);
    }
    @GetMapping("/hentBilletter")
    public List<Billetter> hentBilletter(){
        return rep.hentBilletter();
    }
    @GetMapping("/slett")
    public void slett(){
        rep.slett();
    }
}
