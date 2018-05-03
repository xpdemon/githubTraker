package fr.wildcodeschool.githubtracker.githubtracker.dao;

import fr.wildcodeschool.githubtracker.model.Githuber;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Alternative;
import java.util.ArrayList;

import java.util.List;


@Dependent
public class DumbGithuberDAO implements GithuberDAO {



    @Override
    public List<Githuber> getGithubers() {
        List<Githuber> githuberList = new ArrayList<>();
        Githuber sonic = new Githuber();
        sonic.setName("Sonic");sonic.setId(1);sonic.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0017.gif");sonic.setLogin("Sonic");sonic.setEmail("Sonic@wcs.fr");
        githuberList.add(sonic);

        Githuber mario = new Githuber();
        mario.setName("Mario");mario.setId(2);mario.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0043.gif");mario.setLogin("Mario");mario.setEmail("Crazy_mushroom@wcs.fr");
        githuberList.add(mario);

        Githuber lara = new Githuber();
        lara.setName("Lara");lara.setId(3);lara.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0105.gif");lara.setLogin("Lara");lara.setEmail("Croft@wcs.fr");
        githuberList.add(lara);

        Githuber pacman = new Githuber();
        pacman.setName("Pacman");pacman.setId(4);pacman.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0031.gif");pacman.setLogin("Pacman");pacman.setEmail("Miammiam@wcs.fr");
        githuberList.add(pacman);

        Githuber tails = new Githuber();
        tails.setName("Tails");tails.setId(5);tails.setAvatarUrl("http://www.animated-gifs.eu/category_leisure/avatars-100x100-leisure/0060.gif");tails.setLogin("Tails");tails.setEmail("Tails@wcs.fr");
        githuberList.add(tails);
        return githuberList;

    }

    @Override
    public void saveGithuber(Githuber githuber) throws UnsupportedOperationException {

    }


}
