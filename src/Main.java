import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
//        Crie um ArrayList de Strings, e imprima (iterando) o ArrayList. Obs, deverá imprimir uma mensagem de erro caso esteja vazio
        ArrayList<String> cats = new ArrayList<>();
        if (cats.size() == 0) {
            System.out.println("ArrayList is empty");
        } else {
            for (String cat : cats) {
                System.out.println(cat);
            }
        }
//        Adicione elementos (nomes de pessoas, por exemplo) ao ArrayList criado anteriormente e imprima-o.
        cats.add("British Shorthair");
        cats.add("Munchkin");
        cats.add("Ragdoll");
        cats.add("Maine Coons");

        System.out.println(cats);

//        Imprima o número de elementos no ArrayList.
        System.out.println(cats.size());

//        Recupere o terceiro elemento do ArrayList.
        System.out.println(cats.get(2));
//        Atualize o segundo elemento do ArrayList para um novo valor.
        cats.set(1, "Sphynx");
        System.out.println(cats);

//        Remova o último elemento do ArrayList
        cats.remove(cats.size() - 1);

//        Verifique se um elemento específico está presente no ArrayList.
        String buscaElemento = cats.get(2);
        System.out.println(buscaElemento);
//        Clone o ArrayList criado para um novo ArrayList e imprima-o.
        ArrayList<String> clone = cats;
        System.out.println(clone);
//        Converta o ArrayList em um array regular e imprima esse array.
        String[] regularCatsArray = cats.toArray(new String[0]);
        for (String cat : regularCatsArray) {
            System.out.println(cat);
        }
//        Verifique se o ArrayList está vazio.
        if (cats.isEmpty()){
            System.out.println("Void Array");
        } else {
            System.out.println("Filled Array");
        }
    }
}