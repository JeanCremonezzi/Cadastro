package br.edu.ifsp.scl.ads.cadastro.model;

public enum Sex {
    MALE("Masculino"),
    FEMALE("Feminino");

    private String label;

    Sex(String label) {
        this.label = label;
    }
}
