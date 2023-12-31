package org.example;

/**
 * Clase para generar un comprador con vuelto y un sonido del producto que consumio
 *
 * @author Benjamin Espinoza
 */
class Comprador {
    private String sonido;
    private int vuelto;

    /**
     * Metodo constructor de la calse, se encarga de asignarle el sonido de que consumio y cuanto vuelto recibe
     * el comprador
     *
     * @param moneda moneda ingresadad para comprar
     * @param opcionProducto opcion elegida del producto para el comprador
     * @param expendedor expendedor del cual comprara
     * @throws NoHayProductoException si no hay producto o no se eligio una opcion correcta de producto
     * @throws PagoIncorrectoException si la moneda es null
     * @throws PagoInsuficienteException si el valor de la moneda es menor al precio del producto
     */
    public Comprador(Moneda moneda, InfoProducto opcionProducto, Expendedor expendedor)
            throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException {
        Producto p = expendedor.comprarProducto(moneda, opcionProducto);
        sonido = p.consumir();
        Moneda aux;
        aux = expendedor.getVuelto();
        while (aux != null) {
            vuelto += aux.getValor();
            aux = expendedor.getVuelto();
        }
    }

    /**
     *
     * @return entero con el vuelto del comprador
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     *
     * @return String con el sonido de que consumio
     */
    public String queConsumiste() {
        return sonido;
    }
}
