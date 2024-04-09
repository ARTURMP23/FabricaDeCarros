package arturmatos;

class Sedan implements ICarro {
    @Override
    public void montar() {
        System.out.println("Montando um carro Sedan");
    }
}


class SUV implements ICarro {
    @Override
    public void montar() {
        System.out.println("Montando um carro SUV");
    }
}


class FabricaSedan implements IFabricaCarro {
    @Override
    public ICarro criarCarro() {
        return new Sedan();
    }
}


class FabricaSUV implements IFabricaCarro {
    @Override
    public ICarro criarCarro() {
        return new SUV();
    }
}
