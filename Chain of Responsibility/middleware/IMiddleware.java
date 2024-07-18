package middleware;

public interface IMiddleware {
    public boolean check(String email, String password);
    public boolean checkNext(String email, String password);
}
