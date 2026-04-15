// Decorator - feito por Enrique Nogueira, João Victor e Artur Figueiredo


abstract class Bebida {
    String descricao = "Bebida desconhecida";
    
    public String getDescricao() {
        return descricao;
    }
    
    public abstract double custo();
}

class CafeExpresso extends Bebida {
    public CafeExpresso() { descricao = "Café Expresso"; }
    public double custo() { return 5.00; }
}

class Cha extends Bebida {
    public Cha() { descricao = "Chá"; }
    public double custo() { return 4.00; }
}

class Capuccino extends Bebida {
    public Capuccino() { descricao = "Capuccino"; }
    public double custo() { return 10.00; }
}

abstract class AdicionalDecorator extends Bebida {
    protected Bebida bebida;
    public abstract String getDescricao();
}

class Leite extends AdicionalDecorator {
    public Leite(Bebida bebida) { this.bebida = bebida; }

    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    public double custo() {
        return bebida.custo() + 1.50;
    }
}

class Chantilly extends AdicionalDecorator {
    public Chantilly(Bebida bebida) { this.bebida = bebida; }

    public String getDescricao() {
        return bebida.getDescricao() + ", Chantilly";
    }

    public double custo() {
        return bebida.custo() + 2.00;
    }
}

class Canela extends AdicionalDecorator {
    public Canela(Bebida bebida) { this.bebida = bebida; }

    public String getDescricao() {
        return bebida.getDescricao() + ", Canela";
    }

    public double custo() {
        return bebida.custo() + 2.50;
    }
}

class Chocolate extends AdicionalDecorator {
    public Chocolate(Bebida bebida) { this.bebida = bebida; }

    public String getDescricao() {
        return bebida.getDescricao() + ", Chocolate";
    }

    public double custo() {
        return bebida.custo() + 3.00;
    }
}

public class Main {
    public static void main(String[] args) {
        Bebida meuCafe = new CafeExpresso();
        
        meuCafe = new Leite(meuCafe);
        
        meuCafe = new Chantilly(meuCafe);
        
        System.out.println("Pedido: " + meuCafe.getDescricao());
        System.out.println("Total: R$ " + meuCafe.custo());
        
        System.out.println("\n==================\n");

        Bebida meuCapuccino = new Leite (new Chantilly (new Chocolate (new Capuccino ())));
        
        System.out.println("Pedido: " + meuCapuccino.getDescricao());
        System.out.println("Total: R$ " + meuCapuccino.custo());
    }
} 
