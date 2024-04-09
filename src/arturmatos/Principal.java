package arturmatos;

public class Principal {
    public static void main(String[] args) {
        IFabricaCarro fabricaSedan = new FabricaSedan();
        ICarro sedan = fabricaSedan.criarCarro();
        sedan.montar();
        
        IFabricaCarro fabricaSUV = new FabricaSUV();
        
        ICarro suv = fabricaSUV.criarCarro();
        suv.montar();
    }
}