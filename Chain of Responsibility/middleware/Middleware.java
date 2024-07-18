package middleware;

/**
 * Classe base de handler.
 */
public abstract class Middleware implements IMiddleware {
    
    private Middleware next;

    /**
     * Constrói cadeias de objetos de middleware.
     */
    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;
        for (Middleware nextInChain: chain) {
            head.next = nextInChain;
            head = nextInChain;
        }
        return first;
    }

    /**
     * As subclasses implementarão este método com verificações concretas.
     */
    public abstract boolean check(String email, String password);

    /**
     * Executa a verificação no próximo objeto da cadeia ou termina a travessia se estivermos dentro
     * último objeto da cadeia.
     */
    public boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}
