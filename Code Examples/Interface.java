public interface Pesado{
    double obterPeso();
}

public abstract interface Colorido{
    Color obterCor();
}

public class Porco extends Animal implements Pesado, Colorido{
    public void fazerBarulho(){
        System.out.println("Óinc!");
    }

    //Implementação da interface Pesado
    public double obterPeso(){
        return 50.00;
    }

    //Implementação da interface Colorido
    public Color obterCor() {
        return Color.BLACK;
    }

    //Uma propiedade só do Porco
    public boolean enlameado(){
        return true;
    }

}




