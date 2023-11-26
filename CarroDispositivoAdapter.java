public class CarroDispositivoAdapter extends Dispositivo {
    private Carro carro; // Objeto adaptado

    public CarroDispositivoAdapter(Carro carro) {
        this.carro = carro;
    }

    @Override
    public String getNombre() {
        return carro.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        carro.setNombre(nombre);
    }

    // Aquí se pueden adaptar otros métodos de Dispositivo
}
