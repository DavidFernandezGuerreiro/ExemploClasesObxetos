
package exemploclasesobxetos;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploClasesObxetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cpu c=new Cpu(2000,1000);
        Pantalla p=new Pantalla("Philips",15.5F);
        Raton r=new Raton(" con cable");
        Ordenador orde1=new Ordenador(c,p,r);
        System.out.println(orde1.toString());
        
        Ordenador orde2=new Ordenador(new Cpu(2500,2000),new Pantalla("Samsung",17.2F),new Raton(" sen cable"));
        System.out.println(orde2.toString());
        
        //Ahora cambiamos el valor de velocidade:
        //c.setVelocidade(5000); -> NO
        //System.out.println(orde1.toString()); -> NO
        orde1.getProcesador().setVelocidade(5000);
        System.out.println(orde1.toString());
        
        //Visualizar marca da pantalla do segundo ordenador:
        System.out.println("Marca pantalla ordenador 2 : "+orde2.getPantalla().getMarca());
        
        //Orde3, co constructor por defecto(<- lo visualizo) e logo doulle uns valores: 
        Ordenador orde3=new Ordenador();
        System.out.println(orde3);
        orde3.getProcesador().setVelocidade(3000);
        orde3.getProcesador().setMemoria(1500);
        orde3.getPantalla().setMarca("ASUS");
        orde3.getPantalla().setPulgadas(13.2F);
        orde3.getRaton().setTipo(" sen cable");
        System.out.println(orde3);
    }
    
}
