import java.util.Scanner;

public class display {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        car car = new car();

        Boolean loop = true;
        while (loop) {

        System.out.println("escolha uma das opçoes: ");
        System.out.println("1 - Cadastrar novo veículo");
        System.out.println("2 - Verificar veículos cadastrados");
        System.out.println("3 - Sair");

        Integer switchcase = scanner.nextInt();
            switch (switchcase) {
                case 1:
                    System.out.print("insira a marca do carro: ");
                    String brand = scanner.next();
                    car.setBrand(brand);

                    System.out.print("insira o modelo do carro: ");
                    String model = scanner.next();
                    car.setModel(model);
                    
                    System.out.print("insira a cor do carro: ");
                    String color = scanner.next();
                    car.setColor(color);

                    System.out.println("Cadastro concluído com sucesso");
                break;
                case 2:
                    System.out.print(car.getBrand() + car.getModel() + car.getColor());
                break;

                case 3:
                loop = false;
                break;

                default:
                    System.out.println("Escolha uma opçao válida\n");
                    break;
            }
        }
        scanner.close();
    }
}
