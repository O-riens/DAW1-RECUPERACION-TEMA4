package zoo;

/**
 *
 * @author usuario
 */
public class Tiburon extends Pez {
    private String especie;
    private boolean peligroso;
    private static int numTiburones = 0;

    /** Constructor de tiburón
     *
     */
    public Tiburon () {
        super(20, Tipo.CARTILAGINOSO, Animal.Habitat.ARTICO, "focas", 100);
        this.especie = "Tiburón blanco";
        this.peligroso = true;
        this.numTiburones ++;
    }
    
    /** Parámetros
     *
     * @param especie
     * @param peligroso
     * @param velocidadMaxNatacion
     * @param tipo
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo) {
        super(velocidadMaxNatacion, tipo);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }

    /** Parámetros
     *
     * @param especie
     * @param peligroso
     * @param velocidadMaxNatacion
     * @param tipo
     * @param habitat
     * @param comida
     * @param longevidad
     */
    public Tiburon(String especie, boolean peligroso, int velocidadMaxNatacion, Tipo tipo, Habitat habitat, String comida, int longevidad) {
        super(velocidadMaxNatacion, tipo, habitat, comida, longevidad);
        this.especie = especie;
        this.peligroso = peligroso;
        this.numTiburones ++;
    }
    
    /** Cómo se desplaza el tiburón medido en km/h
     *
     */
    public void desplazar() {
        System.out.println("Estoy nadando a " + this.getVelocidadMaxNatacion() + " km/h.");
    }
    
    /** Lo que come el tiburón
     *
     */
    public void comer() {
        System.out.println("Estoy comiendo " + this.comida);    
    }
    
    /** Finaliza
     *
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        numTiburones--;
        super.finalize();
    }
}
