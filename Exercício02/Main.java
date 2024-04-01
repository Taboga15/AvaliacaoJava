public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java: Do básico ao avançado", "João", 2020);
        Livro livro2 = new Livro("Python para iniciantes", "Pedro", 2018);
        Livro livro3 = new Livro("Lógica", "Maria", 2022);
        Livro livro4 = new Livro("Matrizes e Vetores", "Ana", 2024);

        System.out.println("Informações do Livro 1:");
        livro1.exibirinfo();

        System.out.println("Informações do Livro 2:");
        livro2.exibirinfo();

        System.out.println("Informações do Livro 3:");
        livro3.exibirinfo();

        System.out.println("Informações do Livro 4:");
        livro4.exibirinfo();
    }
}