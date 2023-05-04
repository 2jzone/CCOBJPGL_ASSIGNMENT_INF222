package Explorers;

import Planets.*;

public class AndroidExplorer implements Explorer {
    @Override
    public void visit(Mercury mercury) {
        System.out.println("HALLO HOW ARE YU IM IN MERCARY PLS SEV ME");
    }

    @Override
    public void visit(Mars mars) {
        System.out.println("HALLO HOW ARE YU IM IN MARS PLS SEV ME");
    }

    @Override
    public void visit(Saturn saturn) {
        System.out.println("HALLO HOW ARE YU IM IN SATARN PLS SEV ME");
    }
    @Override
    public void visit(Earth earth) {
        System.out.println("HALLO HOW ARE YU IM IN EART PLS SEV ME");
    }
    @Override
    public void visit(Jupiter jupiter) {
        System.out.println("HALLO HOW ARE YU IM IN JUPITAH PLS SEV ME");
    }
    @Override
    public void visit(Neptune neptune) {
        System.out.println("HALLO HOW ARE YU IM IN NEPTUERN PLS SEV ME");
    }
    @Override
    public void visit(Uranus uranus) {
        System.out.println("HALLO HOW ARE YU IM IN URANUS PLS SEV ME");
    }
    @Override
    public void visit(Venus venus) {
        System.out.println("HALLO HOW ARE YU IM VENUSSSSSSS PLS SEV ME");
    }
}
