/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masterData;

/**
 *
 * @author Admin
 */
public class ItemCombo {
    
    

    private final String label;
    private final String value;

    public ItemCombo(String label, String value) {
        this.label = label;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return label; // Ini yang akan tampil di combo box
    }
}

