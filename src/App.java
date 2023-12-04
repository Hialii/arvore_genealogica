public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Amontoavel<Integer> membro1 = new ArvoreGenealogica<>(10);

        membro1.inserirFamiliar(1);
        membro1.imprimir();
    }
}

/*
 * Desenvolva um sistema de árvore genealógica, onde o usuário poderá criar e
 * visualizar relações familiares. Cada nó da árvore representa um membro da
 * família e a estrutura reflete
 * o parentesco entre membros familiares.
 * 1. Inserção de Familiar;
 * 2. Visualização da Árvore destacando a relação entre os membros da família;
 * 3. Busca por Familiares;
 * 4. Detalhes do Familiar;
 * 5. Remoção de Familiar
 * 
 * que gerará uma remoção de todos os familiares hierarquicamente abaixo dele;
 * 6. Verificação de Relacionamento familiar.
 */
