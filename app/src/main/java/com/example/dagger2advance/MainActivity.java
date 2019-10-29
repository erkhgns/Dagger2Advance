package com.example.dagger2advance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**@Inject annotation will tell the Dagger what all
     * the dependencies needed to be transferred to the dependant.
     *
     *@Component Annotation - annotation is used to build the interface
     * which wires everything together.
     * In this place, we define from which modules
     * (or other Components) we’re taking dependencies.
     *  - something like a bridge between @Module(Which we’ll be seeing later) and @Inject.
     *
     * after rebuilding project, Dagger will create class for
     * Component to create instance of inject
     *
     *
     * @Module Annotation - marks the module or classes
     * e.g  For example, Let’s talk in Android. We can have a module called ContextModule and this
     * module can provide ApplicationContext and Context dependencies to other classes.
     *
     * @Provides Annotation - marks the methods inside the modules which provides dependencies
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Cash cash = new Cash();
        Soldiers soldiers = new Soldiers();

        BattleComponent battleComponent = DaggerBattleComponent.builder()
                .braavosModule(new BraavosModule(cash,soldiers))
                .build();

        War war = battleComponent.getWar();

        war.prepare();

        war.report();

        Boltons boltons = battleComponent.getBoltons();

        boltons.prepareForWar();


        Cash cash1 = battleComponent.getCash();




    }
}
