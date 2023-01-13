import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;
@Named
@ApplicationScoped
public class SuperHeroService {


    private boolean change = true;
    public List<SuperHero> getFilter(String pubId){
        List<SuperHero> heros = new ArrayList<>();
        SuperHeroRepository superHeroRepository = new SuperHeroRepository();
       List<SuperHero> help = superHeroRepository.getAllHeros();
        for (int i = 0; i < help.size(); i++) {
            if (pubId.equals(help.get(i).getPublisherid())){
                heros.add(help.get(i));
            }
        }
        return heros;
    }
    public boolean changeVisibility(){

        return change = !change;
    }
    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }
}
