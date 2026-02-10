package sessionmanagementsystem;
//Interface to deal with sessions

public interface SessionService {
    void  createSession(int userId,String userName);
    int getSession(String sessionId);
    void logout(String sessionId);
    int getActiveSessionCount();

}
