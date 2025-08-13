public abstract class Departamento {
    private int complementoSalarial;

    public int getComplementoSalarial() {
        return this.complementoSalarial;
    }

    public String toString(){
        return getClass().getSimpleName();

    }
}
