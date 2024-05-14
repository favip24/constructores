public class Constructor {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Guada", "Cuper", 22, 1.62f);
        Persona persona2 = new Persona("Favio", "Palermo", 24, 1.81f);
        Persona persona3 = new Persona("Milagros", "Palermo", 16, 1.62f);

        System.out.println(persona1.darInformacionCompleta());
        System.out.println(persona2.darInformacionCompleta());
        System.out.println(persona3.darInformacionCompleta());
    }
}