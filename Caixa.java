package practicas;

import java.util.Scanner;

public class Caixa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao, saque, entrada = 12345, emConta = 500, saldo, depo;

		System.out.println("ola seja benvindo ao banco da tua preferença");
		System.out.println("digite o seu usuario");
		String usuario = sc.next();
		if (usuario.equalsIgnoreCase("sandro")) {

			System.out.println("digite a sua senha");
			int senha = sc.nextInt();
			if (senha == 12345) {

				do {

					System.out.println("escolha uma opçao: ");
					System.out.println("1 -sacar dinheiro\n2 -depositar dinheiro\n3 -sair");
					opcao = sc.nextInt();

					switch (opcao) {

					case 1:
						System.out.println("digite a quantidade que deseja sacar");
						saque = sc.nextInt();
						if (saque <= emConta) {
							saldo = saque - emConta;
							System.out.println("aguarde o seu dinheiro " + saque);
							System.out.println("o teu novo saldo e de: " + saldo);

						} else if (saque > emConta) {
							System.out.println("saldo insuficiente para realizar esta transaçao");
						}

						break;

					case 2:
						System.out.println("digite a quantidade a depositar");
						depo = sc.nextInt();
						saldo = emConta + depo;
						System.out.println("transaçao realizado com sucesso!");
						System.out.println("seu novo saldo e de: " + saldo);

						break;

					case 3:
						System.out.println("volte sempre!");

						break;
					}
					if (opcao != 3) {

						System.out.println("deseja realizar outra operaçao?:\n1- sim\n2- nao ");
						entrada = sc.nextInt();
					} else {
						System.out.println("ate a proxima");
					}
				} while (entrada != 2 && opcao != 3);
				System.out.println("ate logo!");

			} else {
				System.out.println("senha incorreta!");

			}
		} else {
			System.out.println("usuario invalido");
		}
		// }while(entrada == sair);

		sc.close();
	}

	
}
