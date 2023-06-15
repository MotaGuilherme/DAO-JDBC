package src.db;

public class DbIntegrityException extends RuntimeException {

    private static final long serialVersio = 1L;

    public DbIntegrityException(String msg) {
        super(msg);
    }
}

