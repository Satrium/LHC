package security;

import humaresources.IRODetector;
import humaresources.IROExperiment;
import infrastructure.energy.Ring;

import java.io.Reader;
import java.util.LinkedList;

public class Detector implements IRODetector {
    private Ring ring;

    private String higgsBosonStructure ="higgs";
    private boolean isActive;
    private LinkedList experimentList;
    private Reader reader;
    private IROExperiment iroExperiment;

    @Override
    public void viewData() {
        iroExperiment.readExperimentData();
    }
}