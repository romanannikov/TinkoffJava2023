package edu.hw2.Task3;

import org.apache.logging.log4j.LogManager;

public final class PopularCommandExecutor {

    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();
    private final ConnectionManager manager;
    private final int maxAttempts;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }

    public void updatePackages() throws Exception {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) throws Exception {
        Exception exception = null;
        for (int i = 0; i < maxAttempts; i++){
            try(Connection connection = manager.getConnection()) {
                connection.execute(command);
                return;
            } catch (ConnectionException e) {
                exception = e;
            }
        }
        LOGGER.info("Попытки выполнения" + command + "провалились");
        LOGGER.info("Кол-во попыток:" + maxAttempts);
        LOGGER.info("Ошибка:" + exception);
    }
}
