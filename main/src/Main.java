import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        int i, id;
        int op = 10;
        int aux;
        String ano;
        String km;
        String saux;
        String nome;
        String modelo;
        String placa;
        String identidade;
        String nascimento;
        String profissao;
        String endereco;
        String cnh;
        String admissao;


        Scanner sc = new Scanner(System.in);
        ArrayList<Rota> rotas = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Onibus> onibus = new ArrayList<>();


        while (op != 0) {
            System.out.println("""
                    ██╗   ██╗██╗ █████╗  ██████╗ █████╗  ██████╗     ███████╗███████╗████████╗███████╗██████╗  ██████╗ ██╗██████╗\s
                    ██║   ██║██║██╔══██╗██╔════╝██╔══██╗██╔═══██╗    ██╔════╝██╔════╝╚══██╔══╝██╔════╝██╔══██╗██╔═══██╗██║██╔══██╗
                    ██║   ██║██║███████║██║     ███████║██║   ██║    █████╗  ███████╗   ██║   █████╗  ██████╔╝██║   ██║██║██║  ██║
                    ╚██╗ ██╔╝██║██╔══██║██║     ██╔══██║██║   ██║    ██╔══╝  ╚════██║   ██║   ██╔══╝  ██╔══██╗██║   ██║██║██║  ██║
                     ╚████╔╝ ██║██║  ██║╚██████╗██║  ██║╚██████╔╝    ███████╗███████║   ██║   ███████╗██║  ██║╚██████╔╝██║██████╔╝
                      ╚═══╝  ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝ ╚═════╝     ╚══════╝╚══════╝   ╚═╝   ╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚═╝╚═════╝\s
                                                                                                                                 \s
                                         ░█                                                        \s
                                        ░██                                                        \s
                                      ▓▓██                                                         \s
                                     █▒█░                                                          \s
                                    ▒█▒▒▓▓                                █▒                       \s
                               ▓█ ▓█▓ ▒▓█▓                           ░▓████▒                       \s
                              ██▒█▓  ▒██                            ▒██▓▓                          \s
                         ░▓███▓▒   ▒▓▓▓                            ▒█ ██                           \s
                        ██▒░    ░▒▓▒▓█                         ▓ ▓█▓ █▓░                           \s
                      ██  ░█▓▓▒  ▓▓▒░▓█                     ░██▓█▓░▒█▒                             \s
                    █▓▓ ███▓▓▓███  ▒▓▓█                    ▓█▓▒░▒ ░▓▒█▓                            \s
                    █▓▓ ███▓▓▓███ ██▓                 ▓█▒ ██▓▒▓░  ▒▓█░                             \s
                      ██  ▒█▓█▒  █▒                 ▒█▓██▓█▒▒░░ ▒▓▓▓                               \s
                        ▓▓▒▓▒▒▓█▓        ▓█        ▒█▒▒▒▒█░░  ▒▒▒█▓                                \s
                            ▓▓▒         ▓██       ▓█░▓       ░▒▓▒▓▓ ▒▒░                            \s
                                     ▓▓█▓        ▒▓▓░ ▒▓▓▓▓  ▒▒▒▒▒▓▓██▓                            \s
                                     █▒▒██       █▓  ██▓▓▓▓█▓ ░ ░▒▓█░   ░                         ▓█
                                     ░█▓▒░      ██▓▒ ███████▒ ░▒██▓░                           ▒▓▒█▓
                                ███▓███           ▓██ ▓▒░▒▓▒▒▓██▒                             █████\s
                              ▒█▓  ██               ░█▓▓▓▓▓ ▒██                        ▒░░▓█▓█▒▓▓  \s
                            ▒░▓█ ░▓▓▒                   ░░                       ▒░  ▓██▓▓▒░▓▒█░   \s
                        ░▓████▓░ ▓█                                           ▒████▓██▒  ░▓█▒▓     \s
                        ██░ ░   ▒▓▒██                               ▒▓  ▓██████░░▒▓▓▒░  ▓▓▓░       \s
                       █▓░░▓▓▓  ░▓░██                             ░█▓██▓▓▒░▒▒▒░░░     ░▓▒█░        \s
                      █▒ ██▓█▓██ ▒█▓                            ▒██▒▒  ░        ░░░▒▒▒▓██▒         \s
                      ██▒▒▓█▓█▒ ░█▓                            █▓▒   ▓██████▓   ░▒▒▓▒▓▓            \s
                        ▓▓▒▓▓▓▓▓▓▓░                            █▓░  ██▒▒▒▒▒▒██  ▒░ ░▒█▓            \s
                           ░  ░                                ▓██▒ ███▓▓▓▓███ ░░ ░▒▒██            \s
                                                                 ▒██  ▓█▓▓█▒  ▒▓▓▓██▓░             \s
                                                                   ▒▓▒░░░▒░▒▓▓▓░ ░░                \s""");
            System.out.println("Menu:");
            System.out.println("\t1:Listar Rotas\n\t2:Cadastro\n\t3:Comprar Passagem\n\t4:Administração\n\t0:Sair\n\tOP: ");


            op = sc.nextInt();
            switch (op) {
                case 1:
                    for (i = 0; i < rotas.size(); i++) {
                        rotas.get(i).printRota();
                    }
                    System.out.println("Digite enter para voltar para o menu");
                    sc.nextLine();
                    sc.nextLine();
                    break;
                case 2:
                    id = clientes.size()+1;
                    sc.nextLine();
                    System.out.print("Digite o Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Digite a Identidade: ");
                    identidade = sc.nextLine();
                    System.out.print("Digite seu nascimento: ");
                    nascimento = sc.nextLine();
                    System.out.print("Digite sua profissao: ");
                    profissao = sc.nextLine();
                    System.out.print("Digite seu endereco: ");
                    endereco = sc.nextLine();

                    Cliente objCliente = new Cliente(id, nome, identidade, nascimento, profissao, endereco);
                    clientes.add(objCliente);

                    break;
                case 3:
                    if(clientes.isEmpty()==true){
                        System.out.println("Sem clientes cadastrados. Cadastre o usuário primeiramente!");
                        break;
                    }
                    else {
                        System.out.println("Clientes: ");
                        for (i = 0; i < clientes.size(); i++) {
                            System.out.println("\n\tID: " + clientes.get(i).getId() + "\n\tNome: " + clientes.get(i).getNome() + "\n\tIdentidade: " + clientes.get(i).getIdentidade() + "\n-----------------------------");
                        }
                        System.out.println("Digite o ID do cliente: ");
                        id = sc.nextInt();
                    }
                    if (rotas.isEmpty()==true){
                        System.out.println("Sem rotas!");
                        break;
                    }
                    else {
                        for (i = 0; i < rotas.size(); i++) {
                            rotas.get(i).printRota();
                        }
                        int b, j;
                        System.out.println("Digite o numero da rota: ");
                        aux = sc.nextInt();
                        if(aux> rotas.size()){
                            System.out.println("VALOR INVALIDO!");
                            break;
                        }
                        for(i=0;i<rotas.size();i++) {
                            if (rotas.get(i).getIdRota() == aux) {
                                aux = i; //motoristaid = rota
                            }
                        }
                        for(i=0;i<onibus.size();i++){
                            if(onibus.get(i).getMotorista()==rotas.get(aux).getIdRota()){
                                onibus.get(i).printCadeiras();
                                break;
                            }
                        }
                        System.out.println("Digite a cadeira ex 6 3(fileira 6 cadeira 3): ");
                        b = sc.nextInt();
                        j = sc.nextInt();
                        if(b>10||j>4){
                            System.out.println("Valor invalido!");
                            break;
                        }
                        if(onibus.get(aux).getCadeira(b,j)>1){
                            System.out.println("Cadeira já ocupada!");
                        }
                        else{
                            onibus.get(aux).setCadeira(b, j,id);
                        }
                    }
                    break;
                case 4:
                    //ADMINISTRACAO
                    int opt = 10;
                    while (opt!=0){
                        System.out.println("\t1:Cadastro motorista\n\t2:Cadastro onibus\n\t3:Nova rota");
                        System.out.println("\t4:Excluir motorista\n\t5:Excluir onibus\n\t6:Excluir rota");
                        System.out.println("\t7:Alterar motorista\n\t8:Alterar onibus\n\t9:Alterar rota");
                        System.out.print("\t10:Ajuda\n\t0:Voltar\n\tOP:");
                        opt = sc.nextInt();
                        switch (opt) {
                            case 1://Cadastro motô
                                id = -1;
                                sc.nextLine();
                                System.out.print("Digite o Nome: ");
                                nome = sc.nextLine();
                                System.out.print("Digite a Identidade: ");
                                identidade = sc.nextLine();
                                System.out.print("Digite seu nascimento: ");
                                nascimento = sc.nextLine();
                                System.out.print("Digite seu endereço: ");
                                endereco = sc.nextLine();
                                System.out.print("Digite sua CNH: ");
                                cnh = sc.nextLine();
                                System.out.print("Data de admissao(DD:MM:AA): ");
                                admissao = sc.nextLine();

                                Funcionario objFuncionario = new Funcionario(id, nome, identidade, nascimento, endereco, cnh, admissao);
                                funcionarios.add(objFuncionario);

                                break;
                            case 2://Cadastro onibu

                                if (rotas.size() > 0) {
                                    for (i = 0; i < rotas.size(); i++) {
                                        rotas.get(i).printRota();
                                    }
                                    System.out.println("Digite o id da rota: ");
                                    id = sc.nextInt();
                                } else {
                                    System.out.println("Não existem rotas! Crie uma e entao associe ao onibus!");
                                    break;
                                }
                                System.out.println("Funcionarios: ");
                                for (i = 0; i < funcionarios.size(); i++) {
                                    objFuncionario = funcionarios.get(i);
                                    System.out.println(i+"-"+objFuncionario.getNome());
                                }
                                System.out.println("Deseja associar um motorista? Digite o ID, ou -1 para não associar: ");
                                aux = sc.nextInt();
                                if(aux==-1){
                                    continue;
                                }
                                else{
                                    objFuncionario = funcionarios.get(aux);
                                    objFuncionario.setId(id);
                                }

                                sc.nextLine();
                                System.out.print("Digite o Modelo: ");
                                modelo = sc.nextLine();
                                System.out.print("Digite a placa: ");
                                placa = sc.nextLine();
                                System.out.print("Digite o ano: ");
                                ano = sc.next();
                                System.out.print("Digite a Kilometragem: ");
                                km = sc.next();

                                Onibus objOnibus = new Onibus(id, modelo, placa, ano, km);
                                objOnibus.initCadeiras();
                                onibus.add(objOnibus);

                                break;
                            case 3://Cadastro rota
                                sc.nextLine();
                                Rota novaRota = new Rota();
                                novaRota.setIdRota(rotas.size());
                                System.out.print("\tDigite o nome da rota: ");
                                novaRota.setNomeRota(sc.nextLine());
                                System.out.print("\tDigite o tamanho da rota (numero de cidades): ");
                                aux = sc.nextInt();
                                sc.nextLine();
                                for (i = 0; i < aux; i++) {
                                    System.out.print("\tDigite o nome da " + (i + 1) + " cidade: ");
                                    novaRota.setRota(sc.nextLine());
                                }
                                System.out.print("\tDigite a hora de ida (hh mm): ");
                                aux = sc.nextInt();
                                novaRota.setIda(aux, sc.nextInt());
                                System.out.print("\tDigite a hora de chegada (hh mm): ");
                                aux = sc.nextInt();
                                novaRota.setChegada(aux, sc.nextInt());

                                rotas.add(novaRota);
                                break;
                            case 4://Excluir motorista
                                if(funcionarios.size()==0){
                                    System.out.println("Nao ha motoristas!");
                                    break;
                                }
                                System.out.println("\tFuncionarios:");
                                for (i = 0; i < funcionarios.size(); i++) {
                                    objFuncionario = funcionarios.get(i);
                                    System.out.println(objFuncionario.getId() + " " + objFuncionario.getNome());
                                }
                                System.out.print("\tDigite o ID do motorista a ser excluido: ");
                                aux = sc.nextInt();
                                for (i = 0; i < onibus.size(); i++) {
                                    if (aux == onibus.get(i).getMotorista()) {
                                        onibus.get(i).setMotorista(-1);
                                    }
                                }
                                for (i = 0; i < funcionarios.size(); i++) {
                                    if (funcionarios.get(i).getId() == aux) {
                                        funcionarios.remove(i);
                                    }
                                }
                                System.out.println("\tMotorista removido com sucesso");
                                break;
                            case 5://Excluir onibus
                                if(onibus.size()==0){
                                    System.out.println("Nao ha onibus!");
                                    break;
                                }
                                System.out.println("Onibus");
                                for (i = 0; i < onibus.size(); i++) {
                                    System.out.println("\tid:" + i + " Modelo: " + onibus.get(i).getModelo() + " km: " + onibus.get(i).getKilometragem());
                                }
                                System.out.print("Digite o ID do onibus para remover: ");
                                id = sc.nextInt();
                                onibus.remove(id);
                                break;

                            case 6://Excluir rota
                                if(rotas.size()==0){
                                    System.out.println("Nao ha rotas!");
                                    break;
                                }
                                sc.nextLine();
                                for (i = 0; i < rotas.size(); i++) {
                                    rotas.get(i).printRota();
                                }
                                System.out.print("Digite o Id da rota: ");
                                aux = sc.nextInt();
                                rotas.remove(aux);
                                System.out.println("Rota removida");
                                break;

                            case 7://Alterar motorista
                                if(funcionarios.size()==0){
                                    System.out.println("Nao ha motoristas!");
                                    break;
                                }
                                System.out.println("\tFuncionarios:");
                                for (i=0;i<funcionarios.size();i++){
                                    objFuncionario = funcionarios.get(i);
                                    System.out.println(objFuncionario.getId()+" "+ objFuncionario.getNome());
                                }
                                sc.nextLine();
                                System.out.print("\tDigite o ID do motorista: ");
                                aux = sc.nextInt();
                                if(aux==-1){
                                    System.out.println("Motorista Desativado ou sem rota! Introduza em '8-alterar onibus'");
                                    break;
                                }
                                sc.nextLine();
                                System.out.print("\tDigite o novo nome do motorista: ");
                                funcionarios.get(aux).setNome(sc.nextLine());
                                System.out.print(("\tDigite o novo numero do CNH do motorista: "));
                                funcionarios.get(aux).setCnh(sc.nextLine());
                                System.out.print("\tDigite o nova numero de identidade do motorista: ");
                                funcionarios.get(aux).setIdentidade(sc.nextLine());
                                System.out.print("\tDigite a nova data de nascimento do motorista (dd/mm/aaaa): ");
                                funcionarios.get(aux).setNascimento(sc.nextLine());
                                System.out.print("\tDigite o novo endereco do motorista: ");
                                funcionarios.get(aux).setEndereco(sc.nextLine());
                                for (i = 0; i < rotas.size(); i++) {
                                    rotas.get(i).printRota();
                                }
                                System.out.print("\tDigite o id da nova rota do motorista: ");
                                int ide = sc.nextInt();
                                for(i=0;i<rotas.size();i++){
                                    if(rotas.get(i).getIdRota()==ide){
                                        funcionarios.get(aux).setId(ide);
                                    }
                                    else if(i==rotas.size()-1){
                                        System.out.println("\tNao foi encontrada a rota");
                                        funcionarios.get(aux).setId(-1);
                                    }
                                }
                                System.out.println("\tO onibus que o motorista esta dirigindo é: ");

                                for(i=0;i<onibus.size();i++) {
                                    if (onibus.get(i).getMotorista() == funcionarios.get(aux).getId()) {
                                        System.out.println("\tPlaca: " + onibus.get(i).getPlaca());
                                        System.out.println("\tModelo: " + onibus.get(i).getModelo());
                                        System.out.println("\tAno: " + onibus.get(i).getAno());
                                        break;
                                    }
                                    if (i == onibus.size() - 1) {
                                        System.out.println("\tO motorista nao esta dirigindo nenhum onibus");
                                    }
                                }
                                System.out.println("\tPara mudar o motorista de onibus, use Alterar Onibus");
                                break;
                            case 8://Alterar onibus
                                if(onibus.size()==0){
                                    System.out.println("Nao ha onibus!");
                                    break;
                                }
                                for(i=0;i<onibus.size();i++){
                                   System.out.println("\tId: "+onibus.get(i).getMotorista());
                                   System.out.println("\tModelo: "+onibus.get(i).getModelo());
                                   System.out.println("\tPlaca: "+onibus.get(i).getPlaca());
                                   System.out.println("\tAno: "+onibus.get(i).getAno());
                                   System.out.println("\tQuilometragem: "+onibus.get(i).getKilometragem());
                                }
                                System.out.println("\tDigite o Id do onibus que voce quer alterar");
                                aux = sc.nextInt();
                                for(i=0;i<onibus.size();i++){
                                    if(aux == onibus.get(i).getMotorista()){
                                        aux = i;
                                        break;
                                    }
                                    else if(i==onibus.size()-1){
                                        System.out.println("\tOnibus nao encontrado");
                                    }
                                }
                                sc.nextLine();
                                System.out.print("\tDigite o novo modelo: ");
                                onibus.get(aux).setModelo(sc.nextLine());
                                System.out.print("\tDigite a nova placa: ");
                                onibus.get(aux).setPlaca(sc.nextLine());
                                System.out.print("\tDigite o novo ano: ");
                                onibus.get(aux).setAno(sc.next());
                                System.out.print("\tDigite a nova quilometragem: ");
                                onibus.get(aux).setKilometragem(sc.next());
                                System.out.println("\tMotoristas: ");
                                for(i=0;i<funcionarios.size();i++){
                                    System.out.println(i+". "+funcionarios.get(i).getNome());
                                }
                                sc.nextLine();
                                System.out.print("\tDigite o ID do motorista ou -1 caso não tenha: ");
                                int x = sc.nextInt();
                                if(x>=0) {
                                    funcionarios.get(x).setId(onibus.get(aux).getMotorista());
                                }
                                System.out.println("\tAlteracao completa!");
                                break;
                            case 9://Alterar rota
                                if(rotas.size()==0){
                                    System.out.println("Nao ha rotas!");
                                    break;
                                }
                                for(i=0;i<rotas.size();i++){
                                    rotas.get(i).printRota();
                                }
                                sc.nextLine();
                                System.out.print("Digite o numero da rota a ser alterada: ");
                                aux = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Digite o novo nome: ");
                                saux = sc.nextLine();
                                rotas.get(aux).setNomeRota(saux);
                                rotas.get(aux).getRota().clear();
                                System.out.print("Digite o numero de rotas :");
                                int aux2= sc.nextInt();
                                sc.nextLine();
                                for(i=0;i<aux2;i++){
                                    System.out.print("Digite o nome da "+i+"a rota: ");
                                    rotas.get(aux).setRota(sc.nextLine());
                                }
                                System.out.print("Digite o horario de ida (hh mm): ");
                                aux2 = sc.nextInt();
                                rotas.get(aux).setIda(aux2, sc.nextInt());
                                System.out.print("Digite o horario de volta (hh mm): ");
                                aux2 = sc.nextInt();
                                rotas.get(aux).setChegada(aux2,sc.nextInt());
                                break;
                            case 10: //Ajuda o usuario
                                System.out.println("Manual:\n\t1-Cadastro do motorista\nRealiza o cadastramento do motorista, deve se lembrar que o id gerado ao motorista será o mesmo de sua rota e devera ser introduzido em alterar onibus.");
                                System.out.println("\t2-Cadastro do onibus\nÉ recomendado que o usuário realize primiero o cadastro da rota, pois o ônibus já possuirá uma rota. Caso não seja feito, poderá ser alterado (8)");
                                System.out.println("\t3-Cadastro de rota\nFaz o cadastro da rota, já criando uma conexão com o motorista. É altamente recomendado que já se cadastre o motorista antes da rota.");
                                System.out.println("\t4,5,6-Exclusão\nApaga o dado desejado, apenas utilizando o seu id.");
                                System.out.println("\t7,8,9-Alteração\nAltera todo o conteúdo de um id, é necessário preencher todos os campos.");
                                System.out.println("Digite enter para voltar para o menu");
                                sc.nextLine();
                                sc.nextLine();
                        }
                    }

                    break;
            }
        }
    }
}
