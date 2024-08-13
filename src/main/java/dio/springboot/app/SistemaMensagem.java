package dio.springboot.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Componente responsável por enviar uma mensagem com informações de contato.
//Implementa CommandLineRunner para executar código após a inicialização do Spring Boot.

@Component
public class SistemaMensagem implements CommandLineRunner{
    //Nome do remetente, configurável via application.properties.
    //se não definido, o valor padrão será "NoReply-DIO".
    @Value("${nome:NoReply-DIO}")
    private String nome;
    @Value("${email}")
    private String email;
    @Value("${telefones}")
    private List<Long> telefones = new ArrayList<>(Arrays.asList(
            new Long[]{11998736416L}));

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Mensagem enviada por: " + nome
                + "\nE-mail: " + email
                + "\nCom telefones para contato: " + telefones);
        System.out.println("Seu cadastro foi aprovado...");
    }
}