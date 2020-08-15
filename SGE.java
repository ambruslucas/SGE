import java.util.Scanner;

    public class SGE {

        public static void main(String[] args) {

            System.out.println("digite seu nome completo: ");  //imprime na tela o pedido de nome de usuário
            Scanner scanner = new Scanner(System.in);  //entrada do nome completo

            String frase = scanner.nextLine();  //insere o nome completo na variável frase
            String[] array;

            array = frase.split(" ");  //forma um array com o nome completo
            String UltimoNome = array[array.length - 1];  //associa UltimoNome ao último elemento do array
            String PrimeiroNome = array[0]; //associa PrimeiroNome ao primeiro elemento do array
            char PrimeiraLetra = PrimeiroNome.charAt(0);  //pega a primeira letra do primeiro elemento do array

            System.out.println("");
            System.out.println("seu login é: " + PrimeiraLetra + "_" + UltimoNome);


            System.out.println("");
            System.out.println("digite uma senha de no mínimo 8 caracteres que contenha letras minúsculas, maiúsculas, números e caracteres especiais: ");
            Scanner scanner2 = new Scanner(System.in);

            String senha = scanner2.nextLine();

            if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8){
                System.out.println("");
                System.out.println("senha e login registrados com sucesso");
            } else {
                System.out.println("senha inválida, não preenche todos os requisitos");
            }

                //System.out.println("seu login é: " + PrimeiraLetra + "_" + UltimoNome);
        }
    }


