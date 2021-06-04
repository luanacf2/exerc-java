package projetolivro;

public class ProjetoLivro {

    public static void main(String[] args) {
       Pessoa[] p = new Pessoa[2];
       Livro [] l = new Livro[3];
       
       p[0] = new Pessoa("Pedro", 22, "M");
       p[1] = new Pessoa("Maria", 25, "F");
       
       l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
       l[1] = new Livro("POO para iniciantes", "Pedro Paulo", 500, p[1]);
       l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[1]);
       
       l[0].abrir();
       l[0].folhear(200);
       l[0].avancarPag();
       System.out.println(l[0].detalhes());
       l[1].abrir();
       l[1].folhear(100);
       l[1].avancarPag();
       System.out.println(l[1].detalhes());
       l[2].abrir();
       l[2].folhear(450);
       l[2].voltarPag();
       System.out.println(l[2].detalhes());
       
     }
    
}
