package proyectoescritorio;
public class ProyectoEscritorio{
    public static void main(String[] args){
    java.awt.EventQueue.invokeLater(new Runnable(){
        @Override
        public void run(){
            new SplashInicio().setVisible(true);}});}
}
