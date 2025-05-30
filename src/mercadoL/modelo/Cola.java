/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoL.modelo;

public class Cola {

    static final int N = 15;
    private int frente;
    private int finalCola;
    private Historico[] datosCola = new Historico[N];

    public Cola() {
        frente = 0;
        finalCola = -1;
    }

    public void crearVector() {
        datosCola = new Historico[N];
    }

    public Historico[] getDatosCola() {
        return datosCola;
    }
    private void desplazar() {
        for (int i = 1; i <= getFinal(); i++) {
            datosCola[i - 1] = datosCola[i];
        }
    }

    public int getFrente() {
        return frente;
    }

    public int getFinal() {
        return finalCola;
    }

    public boolean colaVacia() {
        if (getFinal() == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean colaLLena() {
        if (getFinal() >= N - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar(Historico dato) {
        if (!colaLLena()) {
            finalCola = getFinal() + 1;
            datosCola[getFinal()] = dato;
        }
    }

    public void quitar() {
        if (!colaVacia()) {
            desplazar();
            finalCola = getFinal() - 1;
        }
    }

    public Historico valorFrente() {
        return datosCola[getFrente()];
    }

    public Historico valorFinal() {
        return datosCola[getFinal()];
    }

    public void limpiarCola() {
        while (!colaVacia()) {
            quitar();
        }
    }
}
