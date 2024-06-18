/*
1.
Crie uma classe Pessoa usando o conceito de Record em Java, com atributos como nome, idade e cidade.
Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON representando uma pessoa em um objeto do tipo Pessoa.

2.
Modifique o programa do Exercício anterior para permitir a conversão de um JSON mesmo se alguns campos estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa.
Consulte a documentação da biblioteca Gson para flexibilizar a conversão.

3.
Crie uma classe Livro que contenha atributos como título, autor e um objeto representando a editora.
Em seguida, implemente um programa que utiliza a biblioteca Gson para converter um JSON aninhado representando um livro em um objeto do tipo Livro.
*/
package pratica4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1.
        String json = "{\"nome\":\"Rodrigo\",\"idade\":20,\"cidade\":\"Brasília\"}";
        Gson gson = new Gson();
        Pessoa pessoaRecord = gson.fromJson(json, Pessoa.class);
        System.out.println(pessoaRecord);
        //2
        Gson gsonBuilder = new GsonBuilder().setLenient().create();
        Pessoa pessoaRecord2 = gson.fromJson(json, Pessoa.class);
        System.out.println("Utilizando Gson Builder: "+pessoaRecord2);



    }
}
