package tarea11_MVC;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class NombreModeloCombo implements ComboBoxModel {
    ArrayList<String> datos;
    String selected;

    public NombreModeloCombo() {
        datos = new ArrayList<>();
    }

    public NombreModeloCombo(ArrayList<String> datos) {
        this.datos = datos;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected =(String) o;

    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener listDataListener) {

    }

    @Override
    public void removeListDataListener(ListDataListener listDataListener) {

    }
    public void agregarNombre(String nom){
        datos.add(nom);
    }
}
