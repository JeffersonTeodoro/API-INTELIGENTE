package br.com.jefferson.budgeting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@EnabledIfEnvironmentVariable(named = "OPENAI_API_KEY", matches = ".+")
public class OpenAiChatClientIT {

    @Autowired
    OpenAiChatModel openAiChatModel;

    @Test
    void should_executeSum_when_promted() {
        var chatCLient = ChatClient.builder(openAiChatModel).defaultSystem("Você é um matemático").build();

        var response = chatCLient.prompt("Some 10 mais 20. Depois subtraia 30 do resulta anterior. Exiba apenas o resulto.")
                .call().content();

        assertThat(response).contains("0");
        System.out.println(response);
    }
}
