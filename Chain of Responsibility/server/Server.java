package server;

import java.util.HashMap;
import java.util.Map;

import middleware.Middleware;

/**
 * Classe de servidor.
 */
public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    /**
     * O cliente passa uma cadeia de objetos para o servidor. Isto melhora a flexibilidade e
     * facilita o teste da classe do servidor.
     */
    public void setMiddleware(Middleware middleware) {
        this.middleware = middleware;
    }

    /**
     * Servidor recebe email e senha do cliente e envia a autorização
     *pedido à rede.
     */
    public boolean logIn(String email, String password) {
        if (middleware.check(email, password)) {
            System.out.println("Authorization have been successful!");

            // Possível regra de negócio útil aqui para usuários autorizados.

            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
