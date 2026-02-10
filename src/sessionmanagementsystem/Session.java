package sessionmanagementsystem;

import java.util.Date;

public class Session implements SessionService{
    private String userName;
    private int userId;
    private int sessionId;
    private Date loginTimestamp;


    @Override
    public void createSession(int userId, String userName) {
        this.userId=userId;
        this.userName=userName;


    }

    @Override
    public int getSession(String sessionId) {
        return 0;
    }

    @Override
    public void logout(String sessionId) {

    }

    @Override
    public int getActiveSessionCount() {
        return 0;
    }
}
