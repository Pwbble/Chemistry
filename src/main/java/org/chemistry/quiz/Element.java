/**
 * File: Element.java
 * Author: Pebble
 * Date: Sept 22, 2022
 * Description: Element enums
 */

package org.chemistry.quiz;

public enum Element {

    // These are the 52 elements I needed to know for my chem class :>
    HYDROGEN("Hydrogen", "H"), HELIUM("Helium", "He"), LITHIUM("Lithium", "Li"),
    BERYLLIUM("Beryllium", "Be"), BORON("Boron", "B"), CARBON("Carbon", "C"),
    NITROGEN("Nitrogen", "N"), OXYGEN("Oxygen", "O"), FLUORINE("Fluorine", "F"),
    NEON("Neon", "Ne"), SODIUM("Sodium", "Na"), MAGNESIUM("Magnesium", "Mg"),
    ALUMINUM("Aluminum", "Al"), SILICON("Silicon", "Si"), PHOSPHORUS("Phosphorus", "P"),
    SULFUR("Sulfur", "S"), CHLORINE("Chlorine", "Cl"), ARGON("Argon", "Ar"),
    POTASSIUM("Potassium", "K"), CALCIUM("Calcium", "Ca"), SCANDIUM("Scandium", "Sc"),
    TITANIUM("Titanium", "Ti"), VANADIUM("Vanadium", "V"), CHROMIUM("Chromium", "Cr"),
    MANGANESE("Manganese", "Mn"), IRON("Iron", "Fe"), COBALT("Cobalt", "Co"),
    NICKEL("Nickel", "Ni"), COPPER("Copper", "Cu"), ZINC("Zinc", "Zn"),
    GALLIUM("Gallium", "Ga"), GERMANIUM("Germanium", "Ge"), ARSENIC("Arsenic", "As"),
    SELENIUM("Selenium", "Se"), BROMINE("Bromine", "Br"), KRYPTON("Krypton", "Kr"),

    SILVER("Silver", "Ag"), TIN("Tin", "Sn"), IODINE("Iodine", "I"),
    XENON("Xenon", "Xe"), TUNGSTEN("Tungsten", "W"), GOLD("Gold", "Au"),
    MERCURY("Mercury", "Hg"), LEAD("Lead", "Pb"), BISMUTH("Bismuth", "Bi"),
    RADON("Radon", "Rn"), RADIUM("Radium", "Ra"), URANIUM("Uranium", "U"),
    PLUTONIUM("Plutonium", "Pu"), CURIUM("Curium", "Cm"), EINSTEINIUM("Einsteinium", "Es"),
    MENDELEVIUM("Mendelevium", "Md");

    Element(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    private final String name, symbol;

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }
}