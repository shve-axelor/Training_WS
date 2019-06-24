package com.guice.gradle;



import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Names;

public class Testguice {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Injector inject = Guice.createInjector(new AddModule());
    Player pd = inject.getInstance(GoodPlayImplement.class);

    pd.bat();
    pd.bowl();

    //		Injector inject = Guice.createInjector(new AddModule());
    //		PlayerDepend pd = inject.getInstance(PlayerDepend.class);

    //		pd.makePlayerCall();
  }
}
// @ImplementedBy(GoodPlayImplement.class)
interface Player {
  public void bat();

  public void bowl();
}

class GoodPlayImplement implements Player {
  @Override
  public void bat() {
    // TODO Auto-generated method stub
    System.out.println("This is the good player");
  }

  @Override
  public void bowl() {
    // TODO Auto-generated method stub
    System.out.println("This is the good bowler");
  }
}

class BadPlayImplement extends GoodPlayImplement {

  @Override
  public void bat() {
    // TODO Auto-generated method stub
    System.out.println("This is the average player");
  }

  @Override
  public void bowl() {
    // TODO Auto-generated method stub
    System.out.println("This is the average bowler");
  }
}

class AddModule extends AbstractModule {

  @Override
  protected void configure() {
    // TODO Auto-generated method stub
    bind(Player.class).annotatedWith(Names.named("Good")).to(GoodPlayImplement.class);
    bind(GoodPlayImplement.class).annotatedWith(Names.named("Bad")).to(BadPlayImplement.class);
  }
}

class PlayerDepend {
  public Player p1;

  @Inject
  public PlayerDepend(Player player) {
    this.p1 = player;
  }

  public void makePlayerCall() {
    p1.bat();
    p1.bowl();
  }
}
