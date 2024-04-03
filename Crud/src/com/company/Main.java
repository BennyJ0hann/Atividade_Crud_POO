package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Carros> listaCarros = new ArrayList<>();

        while (true){
        int opcao = Menu();

        switch(opcao) {
            case 1:
                Create(listaCarros);
                break;
            case 2:
                ReadAll(listaCarros);
                break;
            case 3:
                Read(listaCarros);
                break;
            case 4:
                Update(listaCarros);
                break;
            case 5:
                Delete(listaCarros);
                break;
            case 6:
                numeroAleatorio();
            default:
                System.out.println("Opção inválida!");
        }

        }

    }
    public static void Create(List<Carros> listaCarros){
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o modelo do carro?");
        String modelo = lerValorString();

        System.out.println("Qual a marca do carro?");
        String marca = lerValorString();

        System.out.println("Qual o ano do carro?");
        int ano = lerValorInt();

        System.out.println("Qual a cor do carro?");
        String cor = lerValorString();

        System.out.println("Qual o chassi do carro?");
        String chassi = lerValorString();

        Carros carro = new Carros(modelo,marca,ano,cor,chassi);

        listaCarros.add(carro);


    }
    public static void ReadAll(List<Carros> listaCarros){
        for(Carros c : listaCarros){
            System.out.println("marca: " + c.marca);
            System.out.println("marca: " + c.modelo);
            System.out.println("marca: " + c.ano);
            System.out.println("marca: " + c.cor);
            System.out.println("marca: " + c.chassi);
            System.out.println("marca: " + c.revisoes);
            System.out.println("marca: " + c.km);
            System.out.println("------------------------------");

        }


    }
    public static void Read(List<Carros> listaCarros){
        System.out.println("Informe o chassi ou modelo desejado");
        String findCar = lerValorString();

        Carros car = listaCarros.stream().filter(carro -> carro.chassi.equals(findCar)).findFirst().get();
        List<Carros> cars = listaCarros.stream().filter(carros -> carros.modelo.equals(findCar)).collect(Collectors.toList());

        System.out.println("Carros procurados pelo chassi: "+ car.marca);
        System.out.println("Carros procurados pelo chassi: "+ car.modelo);
        System.out.println("Carros procurados pelo chassi: "+ car.ano);
        System.out.println("Carros procurados pelo chassi: "+ car.cor);
        System.out.println("Carros procurados pelo chassi: "+ car.chassi);

        System.out.println("Carros procurados pelo modelo: "+ cars);


    }
    public static void Update(List<Carros> listaCarros){
        System.out.println("Informe o chassi desejado: ");
        String chassi = lerValorString();

        Carros car = listaCarros.stream().filter(carro -> carro.chassi.equals(chassi)).findFirst().get();
        System.out.println("Informe o modelo do carro: ");
        car.modelo = lerValorString();

        System.out.println("Informe o marca do carro: ");
        car.marca = lerValorString();

        System.out.println("Informe o ano do carro: ");
        car.ano = lerValorInt();

        System.out.println("Informe o cor do carro: ");
        car.cor = lerValorString();




    }
    public static void Delete(List<Carros> listaCarros){
        System.out.println("Informe o chassi desejado: ");
        String chassi = lerValorString();

        Carros carro = listaCarros.stream().filter(c -> c.chassi.equals(chassi)).findFirst().orElse(null);

        if(carro != null){
            listaCarros.remove(carro);
        }else
            System.out.println("Carro não existe");
    }


    public static int Menu() {
            System.out.println("-----------Menu-----------");
            System.out.println("Digite o número: ");
            System.out.println("1- para criar novo carro;");
            System.out.println("2- para ler todos os carros;");
            System.out.println("3- para ler um carro");
            System.out.println("4- para atualizar carro");
            System.out.println("5- para apagar um carro");
            System.out.println("---------------------------");
            System.out.print("Escolha: "); int valor = lerValorInt();
            System.out.println("---------------------------");

            return valor;
    }


    public static int lerValorInt(){
     Scanner valor = new Scanner(System.in);
     return valor.nextInt();
    }
    public static String lerValorString(){
        Scanner valor = new Scanner(System.in);
        return valor.nextLine();
    }
    public static void numeroAleatorio(){
        Random random = new Random();
        int num = random.nextInt(999999);
        
    }
}
