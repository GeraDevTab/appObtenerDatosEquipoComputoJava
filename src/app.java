

public class app {
    public static void main(String[] args) {
        String texto = System.getProperty("user.name");
        String texto2 = System.getProperty("java.version");
        String texto3 = System.getProperty("os.name");
        String texto4 = System.getProperty("os.arch");
        String texto5 = System.getProperty("os.version");
        System.out.println(texto);
        System.out.println(texto2);
        System.out.println(texto3);
        System.out.println(texto4);
        System.out.println(texto5);
        System.out.println("hola");

        //declarando un array de string
        String[] consultas = {"user.name","os.name"};
        //consultas = {"user.name","os.name"};
        int cantidad = consultas.length;
        System.out.println("cantidad "+cantidad);
        for (int i = 0; i < consultas.length; i++) {
            System.out.println("datos del sistema: "+System.getProperty(consultas[i]));

        }
    }
}
