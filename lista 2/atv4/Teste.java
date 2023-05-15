package ex4;

public class Teste {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();
        
        carro.setMarca("Fiat");
        carro.setModelo("Uno Mille");
        carro.setAno("2010");
        carro.setCavalos(12000);
        
        System.out.println("Carro\n");
        System.out.println("Marca: "+ carro.getMarca());
        System.out.println("Modelo: "+ carro.getModelo());
        System.out.println("Ano: "+carro.getAno());
        System.out.println("Cavalos: "+ carro.getCavalos());
        
         moto.setMarca("Honda");
        moto.setModelo("Titan");
        moto.setAno("2010");
        moto.setCilindradas(150);
        
        System.out.println("\nmoto\n");
        System.out.println("Marca: "+ moto.getMarca());
        System.out.println("Modelo: "+ moto.getModelo());
        System.out.println("Ano: "+moto.getAno());
        System.out.println("Cilindradas: "+ moto.getCilindradas());
    }
}
