/*
1. Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API do Google Books.
Solicite ao usuário que insira o título de um livro, e exiba as informações disponíveis sobre o livro retornado pela API.

2. Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para fazer uma consulta à API CoinGecko
e exiba a cotação atual de uma criptomoeda escolhida pelo usuário.

3. Crie um programa Java que faça uma consulta à API do TheMealDB utilizando as classes HttpClient, HttpRequest e HttpResponse.
Solicite ao usuário que insira o nome de uma receita e exiba as informações disponíveis sobre essa receita.
 */
package pratica3;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Aqui utlizamos a API do Google!
        // A URL trás bastamte informação!
        // Precisamos estudar a API para entender como formatar a URL.

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do livre que você deseja informações: ");
        String titulo = scan.nextLine();
        String chaveApiGoogle = "AIzaSyCooy6fAWfozbKmFPnHH3Amq598Im0ZYUA";
        String teste = "https://www.googleapis.com/books/v1/volumes?q="+titulo+"&maxResults=1&key="+chaveApiGoogle;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(teste)).build();
        HttpResponse<String> response = cliente.send(request ,HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        Gson gson = new Gson();
        TituloApi tituloApi = gson.fromJson(json, TituloApi.class);
        TotalInfo totalInfo = new TotalInfo(tituloApi);
        System.out.println("Rertorna dados com Record: "+tituloApi);
        System.out.println("Rertorna dados com Classe: "+totalInfo);

    }
}