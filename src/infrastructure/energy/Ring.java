package infrastructure.energy;

import infrastructure.Experiment;
import lhc.Proton;

public class Ring {
    private boolean isActivated;
    private int energy;
    private Experiment currentExperiment;
    private Magnet magnet;

    public Ring(){

        magnet = new Magnet();
    }

    public void active(){

    }
    public void active(int initialEnergy){


    }
    public void activateMagneticField(){


    }
    public void releaseProton(){


    }
    public void invreaseEnergy(int delta){


    }
    public void collide(Proton proton01, Proton proton02){

    }
    public int decreaseEnergy(){

        return 1;
    }
    public void shutdown(){

    }
}
